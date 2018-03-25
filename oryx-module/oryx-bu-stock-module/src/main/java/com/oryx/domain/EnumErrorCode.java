package com.oryx.domain;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XmlEnumErrorCode", namespace = "http://domain.ref.ws.oryx.com")
@XmlEnum
public enum EnumErrorCode {
    @XmlEnumValue("ObjectNotfound")
    OBJECT_NOT_FOUND,
    @XmlEnumValue("ObjectDuplicated")
    OBJECT_DUPLICATED,
    @XmlEnumValue("UniqueConstraintViolated")
    UNIQUE_CONSTRAINT_VIOLATED
}
