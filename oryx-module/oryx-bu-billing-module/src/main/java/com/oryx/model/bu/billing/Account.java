package com.oryx.model.bu.billing;

import com.oryx.model.*;
import com.oryx.model.basic.ITracableCancelableEntity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;

/**
 * Created by 241180 on 09/01/2017.
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XmlAccount", namespace = "http://model.ref.ws.oryx.com")
@Entity
@Table(
        name = SchemaTableConstantName.T_ACCOUNT
        /*, uniqueConstraints = {
        @UniqueConstraint(name = "UC_DATE_HOST"
                , columnNames = {SchemaColumnConstantName.T_RDV_DATE, SchemaColumnConstantName.T_HOST_ID}),
        @UniqueConstraint(name = "UC_DATE_GUEST"
                , columnNames = {SchemaColumnConstantName.T_RDV_DATE, SchemaColumnConstantName.T_GUEST_ID})}
                */
)
public class Account extends ITracableCancelableEntity {
    @Column(name = ComSchemaColumnConstantName.T_CODE, length = ComSchemaConstantSize.CODE, updatable = false/*, nullable = false*/)
    private String accountCode;

    @Column(name = SchemaColumnConstantName.T_ACTIVTION_DATE, nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date activationDate;

    @Column(name = SchemaColumnConstantName.T_DEACTIVTION_DATE, nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date deactivationDate;

    @Column(name = SchemaColumnConstantName.T_AMOUNT, nullable = false)
    private Double ammount;

    @Override
    public Object newInstance() {
        return new Account();
    }

    @Override
    public Object newXmlInstance() {
        return new Account();
    }
}