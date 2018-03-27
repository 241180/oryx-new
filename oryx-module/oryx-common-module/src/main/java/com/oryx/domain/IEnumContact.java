package com.oryx.domain;

import javax.xml.bind.annotation.*;

public interface IEnumContact {
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "XmlEnumContact", namespace = "http://domain.ref.ws.oryx.com")
    @XmlEnum
    public enum Types {
        @XmlEnumValue("Mobile")
        MPHONE("Mobile"),
        @XmlEnumValue("Phone")
        FPHONE("Phone"),
        @XmlEnumValue("Fax")
        FAX("Fax"),
        @XmlEnumValue("Email")
        EMAIL("Email"),
        @XmlEnumValue("Web")
        WEB("Web");

        private final String meaning;

        private Types(String meaning) {
            this.meaning = meaning;
        }

        public String getMeaning() {
            return meaning;
        }
    }
}
