package com.oryx.domain;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XmlEnumCivility", namespace = "http://domain.ref.ws.oryx.com")
@XmlEnum
public enum EnumCivility {
    @XmlEnumValue("Married")
    MARRIED,
    @XmlEnumValue("Single")
    SINGLE
}
