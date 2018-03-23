package com.oryx.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XmlEnumServiceOperation", namespace = "http://domain.ref.ws.oryx.com")
@XmlEnum
public enum EnumServiceOperation {
    CREATE, UPDATE, DELETE, FETCH_BY_ID, FETCH_ALL, FETCH_BY_CRITERIA;
}
