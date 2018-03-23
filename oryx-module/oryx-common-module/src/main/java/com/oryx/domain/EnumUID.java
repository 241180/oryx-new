package com.oryx.domain;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XmlEnumUID", namespace = "http://domain.ref.ws.oryx.com")
@XmlEnum
public enum EnumUID {
    @XmlEnumValue("NationalIdentificationCard")
    NIDC,
    @XmlEnumValue("Passport")
    PSPT,
    @XmlEnumValue("CnssNumber")
    CNSS,
    @XmlEnumValue("CnrpsNumber")
    CNRPS,
    @XmlEnumValue("Other")
    OTHER
}
