package com.oryx.domain;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XmlEnumStatus", namespace = "http://domain.ref.ws.oryx.com")
@XmlEnum
public enum EnumStatus {
    @XmlEnumValue("Active")
    ACTIVE,
    @XmlEnumValue("Inactive")
    INACTIVE;
}