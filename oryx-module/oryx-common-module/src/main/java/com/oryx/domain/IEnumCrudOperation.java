package com.oryx.domain;

import javax.xml.bind.annotation.*;

public interface IEnumCrudOperation {
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "EnumCrudOperationVO", namespace = "http://domain.ref.ws.oryx.com")
    @XmlEnum
    public enum Types {
        @XmlEnumValue("CREATE")
        CREATE("Create"),
        @XmlEnumValue("UPDATE")
        UPDATE("Update"),
        @XmlEnumValue("DELETE")
        DELETE("Delete"),
        FETCH_BY_ID("Fetch by id"),
        FETCH_ALL("Fetch all"),
        FETCH_BY_CRITERIA("Fetch by criteria");

        private final String meaning;

        private Types(String meaning) {
            this.meaning = meaning;
        }

        public String getMeaning() {
            return meaning;
        }
    }
}
