package com.oryx.model.system.ose;

import com.oryx.model.basic.ITracableCancelableEntity;
import com.oryx.model.SchemaColumnConstantName;
import com.oryx.model.SchemaConstantSize;
import com.oryx.model.SchemaTableConstantName;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by 241180 on 09/01/2017.
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XmlParameter", namespace = "http://model.ref.ws.oryx.com")
@Entity
@Table(
        name = SchemaTableConstantName.T_PARAMETER
        , uniqueConstraints = {@UniqueConstraint(name = "UC_PARAMETER_NAME_REFERENCE", columnNames = {SchemaColumnConstantName.T_NAME
        , SchemaColumnConstantName.T_PARAMETER_REFERENCE})}
)
public class Parameter extends ITracableCancelableEntity {

    @Column(name = SchemaColumnConstantName.T_NAME, length = SchemaConstantSize.NAME, nullable = false)
    private String name;

    @Column(name = SchemaColumnConstantName.T_DESCRIPTION, length = SchemaConstantSize.M_DESCRIPTION)
    private String descriptionTextArea;

    @Column(name = SchemaColumnConstantName.T_PARAMETER_VALUE, length = SchemaConstantSize.S_VALUE, nullable = false)
    private String value;

    @Column(name = SchemaColumnConstantName.T_PARAMETER_REFERENCE, length = SchemaConstantSize.REFERENCE)
    private String reference;

    @Override
    public Object newInstance() {
        return new Parameter();
    }

    @Override
    public Object newXmlInstance() {
        return new Parameter();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescriptionTextArea() {
        return descriptionTextArea;
    }

    public void setDescriptionTextArea(String descriptionTextArea) {
        this.descriptionTextArea = descriptionTextArea;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}
