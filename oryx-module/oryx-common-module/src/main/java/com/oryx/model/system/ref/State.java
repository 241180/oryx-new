package com.oryx.model.system.ref;

import com.oryx.model.basic.ITracableCancelableEntity;
import com.oryx.model.SchemaColumnConstantName;
import com.oryx.model.SchemaConstantSize;
import com.oryx.model.SchemaTableConstantName;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.UUID;

/**
 * Created by 241180 on 09/01/2017.
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XmlState", namespace = "http://model.ref.ws.oryx.com")
@Entity
@Table(
        name = SchemaTableConstantName.T_STATE
        , uniqueConstraints = {@UniqueConstraint(name = "UC_STATE_NAME_CNTRY_ID", columnNames = {SchemaColumnConstantName.T_NAME
        , SchemaColumnConstantName.T_COUNTRY_ID})}
)
public class State extends ITracableCancelableEntity {
    @Column(name = SchemaColumnConstantName.T_NAME, length = SchemaConstantSize.NAME)
    private String name;

    @Column(name = SchemaColumnConstantName.T_COUNTRY_NAME, length = SchemaConstantSize.NAME)
    private String countryName;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = SchemaColumnConstantName.T_COUNTRY_ID)
    private Country country;
    @Transient
    private UUID countryId;

    @Column(name = SchemaColumnConstantName.T_POSTAL_CODE, length = SchemaConstantSize.POSTAL_CODE/* , nullable = false */)
    private String postalCode;

    @Column(name = SchemaColumnConstantName.T_LATITUDE)
    private Double latitude;

    @Column(name = SchemaColumnConstantName.T_LONGITUDE)
    private Double longitude;

    @Column(name = SchemaColumnConstantName.T_ALTITUDE)
    private Double altitude;

    @Override
    public Object newInstance() {
        return new State();
    }

    @Override
    public Object newXmlInstance() {
        return new State();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public UUID getCountryId() {
        return countryId;
    }

    public void setCountryId(UUID countryId) {
        this.countryId = countryId;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Double getAltitude() {
        return altitude;
    }

    public void setAltitude(Double altitude) {
        this.altitude = altitude;
    }
}