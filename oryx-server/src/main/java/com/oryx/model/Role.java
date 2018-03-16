package com.oryx.model;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XmlRole", namespace = "http://domain.ref.ws.oryx.com")
@XmlEnum
public enum Role {
    @XmlEnumValue("ADMIN")
    ROLE_ADMIN,
    @XmlEnumValue("USER")
    ROLE_USER
}
