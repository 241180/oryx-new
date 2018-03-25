package com.oryx.model.bu.sale;

import com.oryx.model.*;
import com.oryx.model.basic.ITracableCancelableEntity;
import com.oryx.model.system.ose.User;
import com.oryx.model.system.ref.Person;
import org.hibernate.annotations.ForeignKey;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.UUID;

/**
 * Created by 241180 on 09/01/2017.
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XmlShopper", namespace = "http://model.ref.ws.oryx.com")
@Entity
@Table(
        name = SchemaTableConstantName.T_SHOPPER
        , uniqueConstraints = {@UniqueConstraint(name = "UC_SHOPPER_CODE", columnNames = {SchemaColumnConstantName.T_CODE}),
        @UniqueConstraint(name = "UC_SHOPPER_EMAIL", columnNames = {SchemaColumnConstantName.T_EMAIL}),
        @UniqueConstraint(name = "UC_SHOPPER_PERSON_ID", columnNames = {SchemaColumnConstantName.T_PERSON_ID})}
)
public class Shopper extends ITracableCancelableEntity {
    @Column(name = ComSchemaColumnConstantName.T_CODE, length = ComSchemaConstantSize.CODE, updatable = false/*, nullable = false*/)
    private String shopperCode;

    @Column(name = SchemaColumnConstantName.T_EMAIL, length = SchemaConstantSize.EMAIL/*, nullable = false*/)
    private String email;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = SchemaColumnConstantName.T_PERSON_ID)
    @ForeignKey(name = "FK_SHOPPER_REF_PERSON")
    private Person person;
    @Transient
    private UUID personId;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = SchemaColumnConstantName.T_USER_ID)
    @ForeignKey(name = "FK_SHOPPER_REF_USER")
    private User user;
    @Transient
    private UUID userId;

    @Override
    public Object newInstance() {
        return new Shopper();
    }

    @Override
    public Object newXmlInstance() {
        return new Shopper();
    }
}