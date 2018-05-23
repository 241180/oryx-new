
package com.oryx.ws.ref.domain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour EnumContactVO.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumContactVO">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Web"/>
 *     &lt;enumeration value="Fax"/>
 *     &lt;enumeration value="Email"/>
 *     &lt;enumeration value="Mobile"/>
 *     &lt;enumeration value="Phone"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumContactVO", namespace = "http://domain.ref.ws.oryx.com")
@XmlEnum
public enum EnumContactVO {

    @XmlEnumValue("Web")
    WEB("Web"),
    @XmlEnumValue("Fax")
    FAX("Fax"),
    @XmlEnumValue("Email")
    EMAIL("Email"),
    @XmlEnumValue("Mobile")
    MOBILE("Mobile"),
    @XmlEnumValue("Phone")
    PHONE("Phone");
    private final String value;

    EnumContactVO(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumContactVO fromValue(String v) {
        for (EnumContactVO c: EnumContactVO.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
