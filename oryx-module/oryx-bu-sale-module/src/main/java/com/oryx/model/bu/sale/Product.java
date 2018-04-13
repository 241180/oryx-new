package com.oryx.model.bu.sale;

import com.oryx.model.*;
import com.oryx.model.basic.ITracableCancelableEntity;
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
@XmlType(name = "ProductVO", namespace = "http://model.ref.ws.oryx.com")
@Entity
@Table(
        name = SchemaTableConstantName.T_PRODUCT
        /*, uniqueConstraints = {
        @UniqueConstraint(name = "UC_DATE_HOST"
                , columnNames = {SchemaColumnConstantName.T_RDV_DATE, SchemaColumnConstantName.T_HOST_ID}),
        @UniqueConstraint(name = "UC_DATE_GUEST"
                , columnNames = {SchemaColumnConstantName.T_RDV_DATE, SchemaColumnConstantName.T_GUEST_ID})}
                */
)
public class Product extends ITracableCancelableEntity {

    @Column(name = ComSchemaColumnConstantName.T_CODE, length = ComSchemaConstantSize.CODE, updatable = false/*, nullable = false*/)
    private String productCode;

    @Column(name = SchemaColumnConstantName.T_NAME, length = SchemaConstantSize.NAME/*, nullable = false*/)
    private String productName;

    @Column(name = SchemaColumnConstantName.T_DESCRIPTION, length = SchemaConstantSize.M_DESCRIPTION/*, nullable = false*/)
    private String description;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = SchemaColumnConstantName.T_CATEGORY_ID)
    @ForeignKey(name = "FK_PRODUCT_REF_CATEGORY")
    private ProductCategory category;
    @Transient
    private UUID categoryId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = SchemaColumnConstantName.T_BRAND_ID)
    @ForeignKey(name = "FK_PRODUCT_REF_BRAND")
    private Brand brand;
    @Transient
    private UUID brandId;

    @Override
    public Object newInstance() {
        return new Product();
    }

    @Override
    public Object newXmlInstance() {
        return new Product();
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public UUID getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(UUID categoryId) {
        this.categoryId = categoryId;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public UUID getBrandId() {
        return brandId;
    }

    public void setBrandId(UUID brandId) {
        this.brandId = brandId;
    }
}