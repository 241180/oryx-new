package com.oryx.domain;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XmlEnumUserStatus", namespace = "http://domain.ref.ws.oryx.com")
@XmlEnum
public enum EnumUserStatus {
    @XmlEnumValue("Active")
    ACTIVE,
    @XmlEnumValue("Inactive")
    INACTIVE;
}