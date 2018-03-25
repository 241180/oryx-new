package com.oryx.domain;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XmlEnumUserRole", namespace = "http://domain.ref.ws.oryx.com")
@XmlEnum
public enum EnumUserRole {
    @XmlEnumValue("Administrator")
    ROLE_ADMIN, //
    @XmlEnumValue("User")
    ROLE_USER //
}
