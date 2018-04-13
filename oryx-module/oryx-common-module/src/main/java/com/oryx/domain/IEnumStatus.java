package com.oryx.domain;

import javax.xml.bind.annotation.*;

public interface IEnumStatus {
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "EnumStatusVO", namespace = "http://domain.ref.ws.oryx.com")
    @XmlEnum
    public enum Types {
        @XmlEnumValue("Active")
        ACTIVE("Active"),
        @XmlEnumValue("Inactive")
        INACTIVE("Inactive");

        private final String meaning;

        private Types(String meaning) {
            this.meaning = meaning;
        }

        public String getMeaning() {
            return meaning;
        }
    }
}