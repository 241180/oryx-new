package com.oryx.model.bu.sale;

import com.oryx.domain.EnumCartStatus;
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
@XmlType(name = "CartVO", namespace = "http://model.ref.ws.oryx.com")
@Entity
@Table(
        name = SchemaTableConstantName.T_CART
        /*, uniqueConstraints = {
        @UniqueConstraint(name = "UC_DATE_HOST"
                , columnNames = {SchemaColumnConstantName.T_RDV_DATE, SchemaColumnConstantName.T_HOST_ID}),
        @UniqueConstraint(name = "UC_DATE_GUEST"
                , columnNames = {SchemaColumnConstantName.T_RDV_DATE, SchemaColumnConstantName.T_GUEST_ID})}
                */
)
public class Cart extends ITracableCancelableEntity {

    @Column(name = ComSchemaColumnConstantName.T_CODE, length = ComSchemaConstantSize.CODE, updatable = false/*, nullable = false*/)
    private String cartCode;

    @Enumerated(EnumType.STRING)
    @Column(name = SchemaColumnConstantName.T_CART_STATUS, length = SchemaConstantSize.CODE)
    private EnumCartStatus status;

    @Column(name = SchemaColumnConstantName.T_EXPIRY_DATE)
    @Temporal(TemporalType.TIMESTAMP)
    private Date expiryDate;

    @Column(name = SchemaColumnConstantName.T_SETTLEMENT_DATE)
    @Temporal(TemporalType.TIMESTAMP)
    private Date settlementDate;

    @Column(name = SchemaColumnConstantName.T_GROSS_AMOUNT, nullable = false)
    private Double grossAmmount;

    @Column(name = SchemaColumnConstantName.T_TAX)
    private Double tax;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = SchemaColumnConstantName.T_CART_ID)
    @ForeignKey(name = "FK_CART_REF_CART_ITEM")
    private Set<CartItem> cartItemSet;
    @Transient
    private List<UUID> cartItemIds;

    @Override
    public Object newInstance() {
        return new Cart();
    }

    @Override
    public Object newXmlInstance() {
        return new Cart();
    }
}