package com.oryx.model.system.ref;

import com.oryx.domain.EnumContact;
import com.oryx.model.basic.ITracableCancelableEntity;
import com.oryx.model.SchemaColumnConstantName;
import com.oryx.model.SchemaConstantSize;
import com.oryx.model.SchemaTableConstantName;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XmlSysContact", namespace = "http://model.ref.ws.oryx.com")
@Entity
@Table(
        name = SchemaTableConstantName.T_CONTACT
        //,uniqueConstraints = {@UniqueConstraint(columnNames = {"contactType", "value"})}
)
public class Contact extends ITracableCancelableEntity {

    @Column(name = SchemaColumnConstantName.T_CONTACT_TYPE, length = SchemaConstantSize.TYPE, nullable = false)
    private EnumContact contactType;

    @Column(name = SchemaColumnConstantName.T_CONTACT_VALUE, length = SchemaConstantSize.M_VALUE, nullable = false)
    private String value;

    @Override
    public Object newInstance() {
        return new Contact();
    }

    @Override
    public Object newXmlInstance() {
        return new Contact();
    }

    public EnumContact getContactType() {
        return contactType;
    }

    public void setContactType(EnumContact contactType) {
        this.contactType = contactType;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
