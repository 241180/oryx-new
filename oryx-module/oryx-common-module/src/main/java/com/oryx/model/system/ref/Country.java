package com.oryx.model.system.ref;

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
@XmlType(name = "CountryVO", namespace = "http://model.ref.ws.oryx.com")
@Entity
@Table(
        name = SchemaTableConstantName.T_COUNTRY
        , uniqueConstraints = {@UniqueConstraint(name = "UC_CNTRY_NAME", columnNames = {SchemaColumnConstantName.T_NAME})
        , @UniqueConstraint(name = "UC_CNTRY_CODE", columnNames = {SchemaColumnConstantName.T_CODE})}
)
public class Country extends ITracableCancelableEntity {

    @Column(name = ComSchemaColumnConstantName.T_CODE, length = ComSchemaConstantSize.CODE, updatable = false)
    private String countryCode;

    @Column(name = ComSchemaColumnConstantName.T_LANG_CODE, length = ComSchemaConstantSize.LANG_CODE)
    private String language;

    @Column(name = SchemaColumnConstantName.T_NAME, length = SchemaConstantSize.NAME, nullable = false)
    private String name;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = SchemaColumnConstantName.T_POL_CAPITAL_ID)
    @ForeignKey(name = "FK_COUNTRY_REF_POL_CAPITAL")
    private State polCapital;
    @Transient
    private UUID polCapitalId;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = SchemaColumnConstantName.T_ECO_CAPITAL_ID)
    @ForeignKey(name = "FK_COUNTRY_REF_ECO_CAPITAL")
    private State ecoCapital;
    @Transient
    private UUID ecoCapitalId;

    @Override
    public Object newInstance() {
        return new Country();
    }

    @Override
    public Object newXmlInstance() {
        return new Country();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public State getPolCapital() {
        return polCapital;
    }

    public void setPolCapital(State polCapital) {
        this.polCapital = polCapital;
    }

    public UUID getPolCapitalId() {
        return polCapitalId;
    }

    public void setPolCapitalId(UUID polCapitalId) {
        this.polCapitalId = polCapitalId;
    }

    public State getEcoCapital() {
        return ecoCapital;
    }

    public void setEcoCapital(State ecoCapital) {
        this.ecoCapital = ecoCapital;
    }

    public UUID getEcoCapitalId() {
        return ecoCapitalId;
    }

    public void setEcoCapitalId(UUID ecoCapitalId) {
        this.ecoCapitalId = ecoCapitalId;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}