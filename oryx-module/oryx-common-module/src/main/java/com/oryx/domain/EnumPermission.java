package com.oryx.domain;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XmlEnumPermission", namespace = "http://domain.ref.ws.oryx.com")
@XmlEnum
public enum EnumPermission {
    @XmlEnumValue("Full")
    FULL,
    @XmlEnumValue("Select")
    SELECT,
    @XmlEnumValue("Create")
    CREATE,
    @XmlEnumValue("Update")
    UPDATE,
    @XmlEnumValue("Delete")
    DELETE
}
