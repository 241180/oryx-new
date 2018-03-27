package com.oryx.model.system.ref;

import com.oryx.domain.IEnumContact;
import com.oryx.model.basic.ITracableCancelableEntity;
import com.oryx.model.SchemaColumnConstantName;
import com.oryx.model.SchemaConstantSize;
import com.oryx.model.SchemaTableConstantName;

import javax.persistence.*;
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

    @Enumerated(EnumType.STRING)
    @Column(name = SchemaColumnConstantName.T_CONTACT_TYPE, length = SchemaConstantSize.TYPE, nullable = false)
    private IEnumContact.Types contactType;

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

    public IEnumContact.Types getContactType() {
        return contactType;
    }

    public void setContactType(IEnumContact.Types contactType) {
        this.contactType = contactType;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
