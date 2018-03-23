/*
 * Copyright 2008 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.oryx;

import com.oryx.enums.RsaPadding;
import com.oryx.exceptions.KeyczarException;
import com.oryx.interfaces.*;
import com.oryx.keyparams.RsaKeyParameters;
import com.oryx.util.Util;
import org.json.JSONException;
import org.json.JSONObject;

import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;
import java.nio.ByteBuffer;
import java.security.*;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;

/**
 * Wrapping class for RSA Private Keys
 *
 * @author steveweis@gmail.com (Steve Weis)
 * @author arkajit.dey@gmail.com (Arkajit Dey)
 */
public class RsaPrivateKey extends KeyczarKey implements KeyczarPrivateKey {
    private static final String KEY_GEN_ALGORITHM = "RSA";
    private static final String SIG_ALGORITHM = "SHA1withRSA";
    private final RsaPublicKey publicKey;
    private final String privateExponent;
    private final String primeP;
    private final String primeQ;
    private final String primeExponentP;
    private final String primeExponentQ;
    private final String crtCoefficient;
    private RSAPrivateCrtKey jcePrivateKey;

    public RsaPrivateKey(RSAPrivateCrtKey privateKey, RsaPadding padding) throws KeyczarException {
        super(privateKey.getModulus().bitLength());
        publicKey = new RsaPublicKey(privateKey, padding);
        privateExponent = Util.encodeBigInteger(privateKey.getPrivateExponent());
        primeP = Util.encodeBigInteger(privateKey.getPrimeP());
        primeQ = Util.encodeBigInteger(privateKey.getPrimeQ());
        primeExponentP = Util.encodeBigInteger(privateKey.getPrimeExponentP());
        primeExponentQ = Util.encodeBigInteger(privateKey.getPrimeExponentQ());
        crtCoefficient = Util.encodeBigInteger(privateKey.getCrtCoefficient());
        jcePrivateKey = privateKey;
    }

    private RsaPrivateKey(int size, RsaPublicKey publicKey, String privateExponent,
                          String primeP, String primeQ, String primeExponentP, String primeExponentQ,
                          String crtCoefficient) {
        super(size);
        this.publicKey = publicKey;
        this.privateExponent = privateExponent;
        this.primeP = primeP;
        this.primeQ = primeQ;
        this.primeExponentP = primeExponentP;
        this.primeExponentQ = primeExponentQ;
        this.crtCoefficient = crtCoefficient;
        jcePrivateKey = null;
    }

    static RsaPrivateKey generate(RsaKeyParameters params) throws KeyczarException {
        KeyPair keyPair = Util.generateKeyPair(KEY_GEN_ALGORITHM, params.getKeySize());
        return new RsaPrivateKey((RSAPrivateCrtKey) keyPair.getPrivate(),
                (params.getRsaPadding() == null) ? RsaPadding.OAEP : params.getRsaPadding());
    }

    static RsaPrivateKey read(String input) throws KeyczarException {
        try {
            JSONObject json = new JSONObject(input);
            return new RsaPrivateKey(
                    json.getInt("size"),
                    RsaPublicKey.fromJson(json.getJSONObject("publicKey")),
                    json.getString("privateExponent"),
                    json.getString("primeP"),
                    json.getString("primeQ"),
                    json.getString("primeExponentP"),
                    json.getString("primeExponentQ"),
                    json.getString("crtCoefficient"))
                    .initFromJson();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    JSONObject toJson() {
        try {
            return new JSONObject()
                    .put("size", size)
                    .put("publicKey", publicKey != null ? publicKey.toJson() : null)
                    .put("privateExponent", privateExponent)
                    .put("primeP", primeP)
                    .put("primeQ", primeQ)
                    .put("primeExponentP", primeExponentP)
                    .put("primeExponentQ", primeExponentQ)
                    .put("crtCoefficient", crtCoefficient);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected Stream getStream() throws KeyczarException {
        Stream cachedStream = cachedStreams.poll();
        if (cachedStream != null) {
            return cachedStream;
        }
        return new RsaPrivateStream();
    }

    @Override
    public KeyType getType() {
        return DefaultKeyType.RSA_PRIV;
    }

    @Override
    protected byte[] hash() {
        return publicKey.hash();
    }

    @Override
    protected Iterable<byte[]> fallbackHash() {
        return publicKey.fallbackHash();
    }

    @Override
    public KeyczarPublicKey getPublic() {
        return publicKey;
    }

    /**
     * Initialize JCE key from JSON data.  Must be called after an instance is read from JSON.
     */
    private RsaPrivateKey initFromJson() throws KeyczarException {
        publicKey.initFromJson();
        try {
            final KeyFactory keyFactory = KeyFactory.getInstance(KEY_GEN_ALGORITHM);
            final RSAPrivateCrtKeySpec spec =
                    new RSAPrivateCrtKeySpec(Util.decodeBigInteger(publicKey.modulus),
                            Util.decodeBigInteger(publicKey.publicExponent), Util.decodeBigInteger(privateExponent),
                            Util.decodeBigInteger(primeP), Util.decodeBigInteger(primeQ), Util.decodeBigInteger(primeExponentP),
                            Util.decodeBigInteger(primeExponentQ), Util.decodeBigInteger(crtCoefficient));
            jcePrivateKey = (RSAPrivateCrtKey) keyFactory.generatePrivate(spec);
            return this;
        } catch (GeneralSecurityException e) {
            throw new KeyczarException(e);
        }
    }

    @Override
    protected RSAPrivateCrtKey getJceKey() {
        return jcePrivateKey;
    }

    private class RsaPrivateStream implements SigningStream, VerifyingStream,
            DecryptingStream, EncryptingStream {
        private Cipher cipher;
        private EncryptingStream encryptingStream;
        private Signature signature;
        private VerifyingStream verifyingStream;

        public RsaPrivateStream() throws KeyczarException {
            try {
                signature = Signature.getInstance(SIG_ALGORITHM);
                verifyingStream = (VerifyingStream) publicKey.getStream();
                cipher = Cipher.getInstance(publicKey.getPadding().getCryptAlgorithm());
                encryptingStream = (EncryptingStream) publicKey.getStream();
            } catch (GeneralSecurityException e) {
                throw new KeyczarException(e);
            }
        }

        @Override
        public int digestSize() {
            return publicKey.keySizeInBytes();
        }

        @Override
        public int doFinalDecrypt(ByteBuffer input, ByteBuffer output)
                throws KeyczarException {
            try {
                return cipher.doFinal(input, output);
            } catch (GeneralSecurityException e) {
                throw new KeyczarException(e);
            }
        }

        @Override
        public int doFinalEncrypt(ByteBuffer input, ByteBuffer output)
                throws KeyczarException {
            return encryptingStream.doFinalEncrypt(input, output);
        }

        @Override
        public SigningStream getSigningStream() throws KeyczarException {
            return encryptingStream.getSigningStream();
        }

        @Override
        public VerifyingStream getVerifyingStream() {
            return new VerifyingStream() {
                @Override
                public int digestSize() {
                    return 0;
                }

                @Override
                public void initVerify() {
                    // Do nothing
                }

                @Override
                public void updateVerify(ByteBuffer input) {
                    // Do nothing
                }

                @Override
                public boolean verify(ByteBuffer signature) {
                    // Do nothing
                    return true;
                }
            };
        }

        @Override
        public void initDecrypt(ByteBuffer input) throws KeyczarException {
            try {
                cipher.init(Cipher.DECRYPT_MODE, jcePrivateKey);
            } catch (InvalidKeyException e) {
                throw new KeyczarException(e);
            }
        }

        @Override
        public int initEncrypt(ByteBuffer output) throws KeyczarException {
            return encryptingStream.initEncrypt(output);
        }

        @Override
        public void initSign() throws KeyczarException {
            try {
                signature.initSign(jcePrivateKey);
            } catch (GeneralSecurityException e) {
                throw new KeyczarException(e);
            }
        }

        @Override
        public void initVerify() throws KeyczarException {
            verifyingStream.initVerify();
        }

        @Override
        public int maxOutputSize(int inputLen) {
            return publicKey.keySizeInBytes();
        }

        @Override
        public void sign(ByteBuffer output) throws KeyczarException {
            try {
                byte[] sig = signature.sign();
                output.put(sig);
            } catch (SignatureException e) {
                throw new KeyczarException(e);
            }
        }

        @Override
        public int updateDecrypt(ByteBuffer input, ByteBuffer output)
                throws KeyczarException {
            try {
                return cipher.update(input, output);
            } catch (ShortBufferException e) {
                throw new KeyczarException(e);
            }
        }

        @Override
        public int updateEncrypt(ByteBuffer input, ByteBuffer output)
                throws KeyczarException {
            return encryptingStream.updateEncrypt(input, output);
        }

        @Override
        public void updateSign(ByteBuffer input) throws KeyczarException {
            try {
                signature.update(input);
            } catch (SignatureException e) {
                throw new KeyczarException(e);
            }
        }

        @Override
        public void updateVerify(ByteBuffer input) throws KeyczarException {
            verifyingStream.updateVerify(input);
        }

        @Override
        public boolean verify(ByteBuffer sig) throws KeyczarException {
            return verifyingStream.verify(sig);
        }
    }
}
