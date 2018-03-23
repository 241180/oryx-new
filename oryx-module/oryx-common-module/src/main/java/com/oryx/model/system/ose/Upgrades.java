package com.oryx.model.system.ose;

import com.oryx.model.basic.ITracableEntity;
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
@XmlType(name = "XmlUpgrades", namespace = "http://model.ref.ws.oryx.com")
@Entity
@Table(
        name = SchemaTableConstantName.T_UPGRADES
        , uniqueConstraints = {@UniqueConstraint(name = "UC_UPGRADES_CODE_SFT_VERSION", columnNames = {SchemaColumnConstantName.T_CODE
        , SchemaColumnConstantName.T_SOFTWARE_VERSION})}
)
public class Upgrades extends ITracableEntity {
    @Column(name = SchemaColumnConstantName.T_CODE, length = SchemaConstantSize.CODE, nullable = false)
    private String upgradeCode;

    @Column(name = SchemaColumnConstantName.T_SOFTWARE_VERSION, length = SchemaConstantSize.VERSION, nullable = false)
    private String softwareVersion;

    @Column(name = SchemaColumnConstantName.T_DESCRIPTION, length = SchemaConstantSize.M_DESCRIPTION)
    private String descriptionTextArea;

    @Override
    public Object newInstance() {
        return new Upgrades();
    }

    @Override
    public Object newXmlInstance() {
        return new Upgrades();
    }

    public String getDescriptionTextArea() {
        return descriptionTextArea;
    }

    public void setDescriptionTextArea(String descriptionTextArea) {
        this.descriptionTextArea = descriptionTextArea;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public String getUpgradeCode() {
        return upgradeCode;
    }

    public void setUpgradeCode(String upgradeCode) {
        this.upgradeCode = upgradeCode;
    }
}