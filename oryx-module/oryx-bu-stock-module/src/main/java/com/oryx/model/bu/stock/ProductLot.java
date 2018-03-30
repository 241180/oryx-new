package com.oryx.model.bu.stock;

import com.oryx.model.*;
import com.oryx.model.basic.ITracableCancelableEntity;
import com.oryx.model.bu.sale.Product;
import org.hibernate.annotations.ForeignKey;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;
import java.util.UUID;

/**
 * Created by 241180 on 09/01/2017.
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XmlProductLot", namespace = "http://model.ref.ws.oryx.com")
@Entity
@Table(
        name = SchemaTableConstantName.T_STOCK_POSITION
        /*, uniqueConstraints = {
        @UniqueConstraint(name = "UC_DATE_HOST"
                , columnNames = {SchemaColumnConstantName.T_RDV_DATE, SchemaColumnConstantName.T_HOST_ID}),
        @UniqueConstraint(name = "UC_DATE_GUEST"
                , columnNames = {SchemaColumnConstantName.T_RDV_DATE, SchemaColumnConstantName.T_GUEST_ID})}
                */
)
public class ProductLot extends ITracableCancelableEntity {
    @Column(name = ComSchemaColumnConstantName.T_CODE, length = ComSchemaConstantSize.CODE, updatable = false/*, nullable = false*/)
    private String lotCode;

    @Column(name = SchemaColumnConstantName.T_NAME, length = SchemaConstantSize.NAME/*, nullable = false*/)
    private String lotName;

    @Column(name = SchemaColumnConstantName.T_DESCRIPTION, length = SchemaConstantSize.M_DESCRIPTION/*, nullable = false*/)
    private String description;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = SchemaColumnConstantName.T_PRODUCT_ID)
    @ForeignKey(name = "FK_PRODUCT_LOT_REF_PRODUCT")
    private Product product;
    @Transient
    private UUID productId;

    @Column(name = SchemaColumnConstantName.T_QUANTITY, nullable = false)
    private Double quantity;

    @Column(name = SchemaColumnConstantName.T_STOCK_IN_DATE)
    @Temporal(TemporalType.TIMESTAMP)
    private Date stockInDate;

    @Column(name = SchemaColumnConstantName.T_STOCK_OUT_DATE)
    @Temporal(TemporalType.TIMESTAMP)
    private Date stockOutDate;

    @Column(name = SchemaColumnConstantName.T_EXPIRY_DATE)
    @Temporal(TemporalType.TIMESTAMP)
    private Date expiryDate;

    @Override
    public Object newInstance() {
        return new ProductLot();
    }

    @Override
    public Object newXmlInstance() {
        return new ProductLot();
    }
}