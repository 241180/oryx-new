package com.oryx.model.system.ose;

import com.oryx.domain.EnumLanguage;
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
@XmlType(name = "XmlAnnex", namespace = "http://model.ref.ws.oryx.com")
@Entity
@Table(
        name = SchemaTableConstantName.T_ANNEX
        , uniqueConstraints = {@UniqueConstraint(name = "UC_ANNEX_CODE_LANG_VALUE", columnNames = {SchemaColumnConstantName.T_ANNEX_CODE
        , SchemaColumnConstantName.T_LANGUAGE_CODE
        , SchemaColumnConstantName.T_ANNEX_VALUE})}
)
public class Annex extends ITracableCancelableEntity {

    @Column(name = SchemaColumnConstantName.T_ANNEX_CODE, length = SchemaConstantSize.TABLE_CODE, nullable = false)
    private String tableCode;

    @Column(name = SchemaColumnConstantName.T_LANGUAGE_CODE, length = SchemaConstantSize.LANG_CODE, nullable = false)
    private EnumLanguage langage;

    @Column(name = SchemaColumnConstantName.T_ANNEX_VALUE, length = SchemaConstantSize.S_VALUE, nullable = false)
    private String value;

    @Column(name = SchemaColumnConstantName.T_DESCRIPTION, length = SchemaConstantSize.M_DESCRIPTION)
    private String descriptionTextArea;

    @Column(name = SchemaColumnConstantName.T_ANNEX_REFERENCE, length = SchemaConstantSize.S_VALUE)
    private String reference;

    @Override
    public Object newInstance() {
        return new Annex();
    }

    @Override
    public Object newXmlInstance() {
        return new Annex();
    }

    public String getTableCode() {
        return tableCode;
    }

    public void setTableCode(String tableCode) {
        this.tableCode = tableCode;
    }

    public EnumLanguage getLangage() {
        return langage;
    }

    public void setLangage(EnumLanguage langage) {
        this.langage = langage;
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

    public String getDescriptionTextArea() {
        return descriptionTextArea;
    }

    public void setDescriptionTextArea(String descriptionTextArea) {
        this.descriptionTextArea = descriptionTextArea;
    }
}
