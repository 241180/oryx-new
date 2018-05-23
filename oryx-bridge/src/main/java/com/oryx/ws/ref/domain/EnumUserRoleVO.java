
package com.oryx.ws.ref.domain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour EnumUserRoleVO.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumUserRoleVO">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="User"/>
 *     &lt;enumeration value="Administrator"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumUserRoleVO", namespace = "http://domain.ref.ws.oryx.com")
@XmlEnum
public enum EnumUserRoleVO {

    @XmlEnumValue("User")
    USER("User"),
    @XmlEnumValue("Administrator")
    ADMINISTRATOR("Administrator");
    private final String value;

    EnumUserRoleVO(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumUserRoleVO fromValue(String v) {
        for (EnumUserRoleVO c: EnumUserRoleVO.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
