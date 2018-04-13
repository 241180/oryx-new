package com.oryx.domain;

import javax.xml.bind.annotation.*;

public interface IEnumUID {
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "EnumUIDVO", namespace = "http://domain.ref.ws.oryx.com")
    @XmlEnum
    public enum Types {
        @XmlEnumValue("NationalIdentificationCard")
        NIDC("NationalIdentificationCard"),
        @XmlEnumValue("Passport")
        PSPT("Passport"),
        @XmlEnumValue("CnssNumber")
        CNSS("CnssNumber"),
        @XmlEnumValue("CnrpsNumber")
        CNRPS("CnrpsNumber"),
        @XmlEnumValue("Other")
        OTHER("Other");

        private final String meaning;

        private Types(String meaning) {
            this.meaning = meaning;
        }

        public String getMeaning() {
            return meaning;
        }
    }
}
