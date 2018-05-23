
package com.oryx.ws.ref.domain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour EnumLanguageVO.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumLanguageVO">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEU"/>
 *     &lt;enumeration value="ENG"/>
 *     &lt;enumeration value="ITA"/>
 *     &lt;enumeration value="ARA"/>
 *     &lt;enumeration value="FRA"/>
 *     &lt;enumeration value="SPA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumLanguageVO", namespace = "http://domain.ref.ws.oryx.com")
@XmlEnum
public enum EnumLanguageVO {

    DEU,
    ENG,
    ITA,
    ARA,
    FRA,
    SPA;

    public String value() {
        return name();
    }

    public static EnumLanguageVO fromValue(String v) {
        return valueOf(v);
    }

}
