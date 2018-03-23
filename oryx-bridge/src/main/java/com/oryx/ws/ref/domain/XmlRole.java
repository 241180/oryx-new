package com.oryx.ws.ref.domain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour XmlRole.
 * <p>
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="XmlRole">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ADMIN"/>
 *     &lt;enumeration value="USER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "XmlRole", namespace = "http://domain.ref.ws.oryx.com")
@XmlEnum
public enum XmlRole {

    ADMIN,
    USER;

    public static XmlRole fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }

}
