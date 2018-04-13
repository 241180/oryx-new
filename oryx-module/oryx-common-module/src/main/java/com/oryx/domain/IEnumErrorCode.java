package com.oryx.domain;

import javax.xml.bind.annotation.*;

public interface IEnumErrorCode {
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "EnumErrorCodeVO", namespace = "http://domain.ref.ws.oryx.com")
    @XmlEnum
    public enum Types {
        @XmlEnumValue("ObjectNotfound")
        OBJECT_NOT_FOUND("ObjectNotfound"),
        @XmlEnumValue("ObjectDuplicated")
        OBJECT_DUPLICATED("ObjectDuplicated"),
        @XmlEnumValue("UniqueConstraintViolated")
        UNIQUE_CONSTRAINT_VIOLATED("UniqueConstraintViolated");

        private final String meaning;

        private Types(String meaning) {
            this.meaning = meaning;
        }

        public String getMeaning() {
            return meaning;
        }
    }
}
