package com.oryx.domain;

import javax.xml.bind.annotation.*;

public interface IEnumGender {
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "XmlEnumGender", namespace = "http://domain.ref.ws.oryx.com")
    @XmlEnum
    public enum Types {
        @XmlEnumValue("Male")
        MALE("Male"),
        @XmlEnumValue("Female")
        FEMALE("Female");

        private final String meaning;

        private Types(String meaning) {
            this.meaning = meaning;
        }

        public String getMeaning() {
            return meaning;
        }
    }
}
