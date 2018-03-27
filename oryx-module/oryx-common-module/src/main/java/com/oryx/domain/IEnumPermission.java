package com.oryx.domain;

import javax.xml.bind.annotation.*;

public interface IEnumPermission {
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "XmlEnumPermission", namespace = "http://domain.ref.ws.oryx.com")
    @XmlEnum
    public enum Types {
        @XmlEnumValue("Full")
        FULL("Full"),
        @XmlEnumValue("Select")
        SELECT("Select"),
        @XmlEnumValue("Create")
        CREATE("Create"),
        @XmlEnumValue("Update")
        UPDATE("Update"),
        @XmlEnumValue("Delete")
        DELETE("Delete");

        private final String meaning;

        private Types(String meaning) {
            this.meaning = meaning;
        }

        public String getMeaning() {
            return meaning;
        }
    }
}
