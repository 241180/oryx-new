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
@XmlType(name = "DomainVO", namespace = "http://model.ref.ws.oryx.com")
@Entity
@Table(
        name = SchemaTableConstantName.T_DOMAIN
        , uniqueConstraints = {@UniqueConstraint(name = "UC_DOMAIN_CODE", columnNames = {SchemaColumnConstantName.T_CODE})
}
)
public class Domain extends ITracableCancelableEntity {

    @Column(name = SchemaColumnConstantName.T_CODE, length = SchemaConstantSize.CODE, nullable = false)
    private String domainCode;

    @Column(name = SchemaColumnConstantName.T_DESCRIPTION, length = SchemaConstantSize.M_DESCRIPTION)
    private String description;

    @Column(name = SchemaColumnConstantName.T_DOMAIN_REFERENCE, length = SchemaConstantSize.S_VALUE)
    private String reference;

    @Override
    public Object newInstance() {
        return new Domain();
    }

    @Override
    public Object newXmlInstance() {
        return new Domain();
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDomainCode() {
        return domainCode;
    }

    public void setDomainCode(String domainCode) {
        this.domainCode = domainCode;
    }
}
