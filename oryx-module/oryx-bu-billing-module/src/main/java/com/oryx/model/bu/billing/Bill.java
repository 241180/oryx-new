package com.oryx.model.bu.billing;


import com.oryx.domain.EnumBillStatus;
import com.oryx.model.*;
import com.oryx.model.basic.ITracableCancelableEntity;
import org.hibernate.annotations.ForeignKey;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/**
 * Created by 241180 on 09/01/2017.
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XmlBill", namespace = "http://model.ref.ws.oryx.com")
@Entity
@Table(
        name = SchemaTableConstantName.T_BILL
        /*, uniqueConstraints = {
        @UniqueConstraint(name = "UC_DATE_HOST"
                , columnNames = {SchemaColumnConstantName.T_RDV_DATE, SchemaColumnConstantName.T_HOST_ID}),
        @UniqueConstraint(name = "UC_DATE_GUEST"
                , columnNames = {SchemaColumnConstantName.T_RDV_DATE, SchemaColumnConstantName.T_GUEST_ID})}
                */
)
public class Bill extends ITracableCancelableEntity {
    @Column(name = ComSchemaColumnConstantName.T_CODE, length = ComSchemaConstantSize.CODE, updatable = false/*, nullable = false*/)
    private String billCode;

    @Enumerated(EnumType.STRING)
    @Column(name = SchemaColumnConstantName.T_BILL_STATUS, length = SchemaConstantSize.CODE)
    private EnumBillStatus status;

    @Column(name = SchemaColumnConstantName.T_CALCULATION_DATE, nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date calculationDate;

    @Column(name = SchemaColumnConstantName.T_ISSUE_DATE)
    @Temporal(TemporalType.TIMESTAMP)
    private Date issueDate;

    @Column(name = SchemaColumnConstantName.T_DUE_DATE)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dueDate;

    @Column(name = SchemaColumnConstantName.T_SETTLEMENT_DATE)
    @Temporal(TemporalType.TIMESTAMP)
    private Date settlementDate;

    @Column(name = SchemaColumnConstantName.T_GROSS_AMOUNT, nullable = false)
    private Double grossAmmount;

    @Column(name = SchemaColumnConstantName.T_TAX)
    private Double tax;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = SchemaColumnConstantName.T_BILL_ID)
    @ForeignKey(name = "FK_BILL_REF_BILL_ITEM")
    private Set<BillItem> billItemSet;
    @Transient
    private List<UUID> billItemIds;

    @Override
    public Object newInstance() {
        return new Bill();
    }

    @Override
    public Object newXmlInstance() {
        return new Bill();
    }
}