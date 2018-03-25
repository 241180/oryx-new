package com.oryx.domain;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XmlEnumGender", namespace = "http://domain.ref.ws.oryx.com")
@XmlEnum
public enum EnumGender {
    @XmlEnumValue("Male")
    MALE,
    @XmlEnumValue("Female")
    FEMALE
}
