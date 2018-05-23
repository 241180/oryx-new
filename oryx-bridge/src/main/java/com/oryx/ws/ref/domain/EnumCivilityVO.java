
package com.oryx.ws.ref.domain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour EnumCivilityVO.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumCivilityVO">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Married"/>
 *     &lt;enumeration value="Single"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumCivilityVO", namespace = "http://domain.ref.ws.oryx.com")
@XmlEnum
public enum EnumCivilityVO {

    @XmlEnumValue("Married")
    MARRIED("Married"),
    @XmlEnumValue("Single")
    SINGLE("Single");
    private final String value;

    EnumCivilityVO(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumCivilityVO fromValue(String v) {
        for (EnumCivilityVO c: EnumCivilityVO.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
