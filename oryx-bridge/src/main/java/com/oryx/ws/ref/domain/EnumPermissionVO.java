
package com.oryx.ws.ref.domain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour EnumPermissionVO.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumPermissionVO">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Create"/>
 *     &lt;enumeration value="Full"/>
 *     &lt;enumeration value="Select"/>
 *     &lt;enumeration value="Update"/>
 *     &lt;enumeration value="Delete"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumPermissionVO", namespace = "http://domain.ref.ws.oryx.com")
@XmlEnum
public enum EnumPermissionVO {

    @XmlEnumValue("Create")
    CREATE("Create"),
    @XmlEnumValue("Full")
    FULL("Full"),
    @XmlEnumValue("Select")
    SELECT("Select"),
    @XmlEnumValue("Update")
    UPDATE("Update"),
    @XmlEnumValue("Delete")
    DELETE("Delete");
    private final String value;

    EnumPermissionVO(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumPermissionVO fromValue(String v) {
        for (EnumPermissionVO c: EnumPermissionVO.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
