
package com.oryx.ws.ref.domain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour EnumUIDVO.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumUIDVO">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Passport"/>
 *     &lt;enumeration value="NationalIdentificationCard"/>
 *     &lt;enumeration value="CnssNumber"/>
 *     &lt;enumeration value="CnrpsNumber"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumUIDVO", namespace = "http://domain.ref.ws.oryx.com")
@XmlEnum
public enum EnumUIDVO {

    @XmlEnumValue("Passport")
    PASSPORT("Passport"),
    @XmlEnumValue("NationalIdentificationCard")
    NATIONAL_IDENTIFICATION_CARD("NationalIdentificationCard"),
    @XmlEnumValue("CnssNumber")
    CNSS_NUMBER("CnssNumber"),
    @XmlEnumValue("CnrpsNumber")
    CNRPS_NUMBER("CnrpsNumber"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    EnumUIDVO(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumUIDVO fromValue(String v) {
        for (EnumUIDVO c: EnumUIDVO.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
