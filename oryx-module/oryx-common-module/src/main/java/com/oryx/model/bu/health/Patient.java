package com.oryx.model.bu.health;

import com.oryx.model.*;
import com.oryx.model.basic.ITracableCancelableEntity;
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
@XmlType(name = "XmlPatient", namespace = "http://model.ref.ws.oryx.com")
@Entity
@Table(
        name = SchemaTableConstantName.T_PATIENT
        , uniqueConstraints = {@UniqueConstraint(name = "UC_PATIENT_CODE", columnNames = {SchemaColumnConstantName.T_CODE}),
        @UniqueConstraint(name = "UC_PATIENT_EMAIL", columnNames = {SchemaColumnConstantName.T_EMAIL}),
        @UniqueConstraint(name = "UC_PATIENT_PERSON_ID", columnNames = {SchemaColumnConstantName.T_PERSON_ID})}
)
public class Patient extends ITracableCancelableEntity {
    @Column(name = ComSchemaColumnConstantName.T_CODE, length = ComSchemaConstantSize.CODE, updatable = false/*, nullable = false*/)
    private String patientCode;

    @Column(name = SchemaColumnConstantName.T_EMAIL, length = SchemaConstantSize.EMAIL/*, nullable = false*/)
    private String email;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = SchemaColumnConstantName.T_PERSON_ID)
    @ForeignKey(name = "FK_PATIENT_REF_PERSON")
    private Person person;
    @Transient
    private UUID personId;


    @Override
    public Object newInstance() {
        return new Patient();
    }

    @Override
    public Object newXmlInstance() {
        return new Patient();
    }
}