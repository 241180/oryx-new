package com.oryx.model.bu.billing;


import com.oryx.model.basic.ITracableCancelableEntity;
import com.oryx.model.SchemaColumnConstantName;
import com.oryx.model.SchemaTableConstantName;
import com.oryx.model.bu.sale.Product;
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
@XmlType(name = "BillItemVO", namespace = "http://model.ref.ws.oryx.com")
@Entity
@Table(
        name = SchemaTableConstantName.T_BILL_ITEM
        /*, uniqueConstraints = {
        @UniqueConstraint(name = "UC_DATE_HOST"
                , columnNames = {SchemaColumnConstantName.T_RDV_DATE, SchemaColumnConstantName.T_HOST_ID}),
        @UniqueConstraint(name = "UC_DATE_GUEST"
                , columnNames = {SchemaColumnConstantName.T_RDV_DATE, SchemaColumnConstantName.T_GUEST_ID})}
                */
)
public class BillItem extends ITracableCancelableEntity {

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = SchemaColumnConstantName.T_PRODUCT_ID)
    @ForeignKey(name = "FK_BILL_ITEM_REF_PRODUCT")
    private Product product;
    @Transient
    private UUID productId;

    @Column(name = SchemaColumnConstantName.T_QUANTITY, nullable = false)
    private Double quantity;

    @Column(name = SchemaColumnConstantName.T_UNIT_PRICE, nullable = false)
    private Double unitPrice;

    @Column(name = SchemaColumnConstantName.T_DISCOUNT)
    private Double discount;

    @Column(name = SchemaColumnConstantName.T_TAX)
    private Double tax;

    @Override
    public Object newInstance() {
        return new BillItem();
    }

    @Override
    public Object newXmlInstance() {
        return new BillItem();
    }
}