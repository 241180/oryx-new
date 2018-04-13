package com.oryx.domain;

import javax.xml.bind.annotation.*;

public interface IEnumRole {
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "EnumRoleVO", namespace = "http://domain.ref.ws.oryx.com")
    @XmlEnum
    public enum Types {
        @XmlEnumValue("ADMIN")
        ROLE_ADMIN("Administrator"),
        @XmlEnumValue("USER")
        ROLE_USER("User");

        private final String meaning;

        private Types(String meaning) {
            this.meaning = meaning;
        }

        public String getMeaning() {
            return meaning;
        }
    }
}

