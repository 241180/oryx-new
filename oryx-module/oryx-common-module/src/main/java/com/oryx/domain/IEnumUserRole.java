package com.oryx.domain;

import javax.xml.bind.annotation.*;

public interface IEnumUserRole {
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "XmlEnumUserRole", namespace = "http://domain.ref.ws.oryx.com")
    @XmlEnum
    public enum Types {
        @XmlEnumValue("Administrator")
        ROLE_ADMIN("Administrator"), //
        @XmlEnumValue("User")
        ROLE_USER("User"); //

        private final String meaning;

        private Types(String meaning) {
            this.meaning = meaning;
        }

        public String getMeaning() {
            return meaning;
        }
    }
}
