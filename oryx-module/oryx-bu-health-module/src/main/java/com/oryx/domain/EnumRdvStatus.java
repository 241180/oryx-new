package com.oryx.domain;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnumRdvStatusVO", namespace = "http://domain.ref.ws.oryx.com")
@XmlEnum
public enum EnumRdvStatus {
    @XmlEnumValue("Planned")
    PLANNED,
    @XmlEnumValue("Accepted")
    ACCEPTED,
    @XmlEnumValue("Completed")
    COMPLETED,
    @XmlEnumValue("Rejected")
    REJECTED,
    @XmlEnumValue("Delayed")
    DELAYED,
    @XmlEnumValue("Canceled")
    CANCELED;
}