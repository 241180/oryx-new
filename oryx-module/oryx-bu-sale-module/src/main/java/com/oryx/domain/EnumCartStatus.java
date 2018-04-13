package com.oryx.domain;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnumCartStatusVO", namespace = "http://domain.ref.ws.oryx.com")
@XmlEnum
public enum EnumCartStatus {
    @XmlEnumValue("Calculated")
    CALCULATED,
    @XmlEnumValue("Issued")
    ISSUED,
    @XmlEnumValue("Paid")
    PAID,
    @XmlEnumValue("Blocked")
    BLOCKED,
    @XmlEnumValue("Canceled")
    CANCELED,
    @XmlEnumValue("OutDated")
    OUTDATED;
}