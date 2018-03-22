package com.oryx.domain;

import javax.xml.bind.annotation.*;

public interface IEnumCrudOperation{
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "XmlCrudOperation", namespace = "http://domain.ref.ws.oryx.com")
    @XmlEnum
    public enum Types {
        @XmlEnumValue("CREATE")
        CREATE("Create"),
        @XmlEnumValue("UPDATE")
        UPDATE("Update"),
        @XmlEnumValue("DELETE")
        DELATE("Delete");

        private final String meaning;

        private Types(String meaning) {
            this.meaning = meaning;
        }

        public String getMeaning() {
            return meaning;
        }
    }
}
