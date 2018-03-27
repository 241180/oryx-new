package com.oryx.domain;

import javax.xml.bind.annotation.*;

public interface IEnumCivility {
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "XmlEnumCivility", namespace = "http://domain.ref.ws.oryx.com")
    @XmlEnum
    public enum Types {
        @XmlEnumValue("Married")
        MARRIED("Married"),
        @XmlEnumValue("Single")
        SINGLE("Married");

        private final String meaning;

        private Types(String meaning) {
            this.meaning = meaning;
        }

        public String getMeaning() {
            return meaning;
        }
    }
}
