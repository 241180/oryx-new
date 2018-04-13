package com.oryx.domain;

import javax.xml.bind.annotation.*;

public interface IEnumLanguage {
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "EnumLanguageVO", namespace = "http://domain.ref.ws.oryx.com")
    @XmlEnum
    public enum Types {
        @XmlEnumValue("FRA")
        FRA("FRA"),
        @XmlEnumValue("ENG")
        ENG("ENG"),
        @XmlEnumValue("ITA")
        ITA("ITA"),
        @XmlEnumValue("SPA")
        SPA("SPA"),
        @XmlEnumValue("ARA")
        ARA("ARA"),
        @XmlEnumValue("DEU")
        DEU("DEU"); //...

        private final String meaning;

        private Types(String meaning) {
            this.meaning = meaning;
        }

        public String getMeaning() {
            return meaning;
        }
    }
}
