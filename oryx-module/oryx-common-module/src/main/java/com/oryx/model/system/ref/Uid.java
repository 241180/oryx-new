package com.oryx.model.system.ref;

import com.oryx.domain.EnumUID;
import com.oryx.model.basic.ITracableCancelableEntity;
import com.oryx.model.SchemaColumnConstantName;
import com.oryx.model.SchemaConstantSize;
import com.oryx.model.SchemaTableConstantName;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by 241180 on 09/01/2017.
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XmlUid", namespace = "http://model.ref.ws.oryx.com")
@Entity
@Table(
        name = SchemaTableConstantName.T_PERSON_UID
        , uniqueConstraints = {@UniqueConstraint(name = "UC_UID_TYPE_VALUE", columnNames = {SchemaColumnConstantName.T_UID_TYPE, SchemaColumnConstantName.T_UID_VALUE})}
)
public class Uid extends ITracableCancelableEntity {

    @Enumerated(EnumType.STRING)
    @Column(name = SchemaColumnConstantName.T_UID_TYPE, length = SchemaConstantSize.TYPE/* , nullable = false */)
    private EnumUID uidType;

    @Column(name = SchemaColumnConstantName.T_UID_VALUE, length = SchemaConstantSize.M_VALUE)
    private String uid;

    @Override
    public Object newInstance() {
        return new Uid();
    }

    @Override
    public Object newXmlInstance() {
        return new Uid();
    }

    public EnumUID getUidType() {
        return uidType;
    }

    public void setUidType(EnumUID uidType) {
        this.uidType = uidType;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}