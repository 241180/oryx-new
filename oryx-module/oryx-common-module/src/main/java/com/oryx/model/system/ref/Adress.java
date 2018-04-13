package com.oryx.model.system.ref;

import com.oryx.model.basic.ITracableCancelableEntity;
import com.oryx.model.SchemaColumnConstantName;
import com.oryx.model.SchemaConstantSize;
import com.oryx.model.SchemaTableConstantName;
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
@XmlType(name = "AdressVO", namespace = "http://model.ref.ws.oryx.com")
@Entity
@Table(
        name = SchemaTableConstantName.T_ADDRESS
        , uniqueConstraints = {@UniqueConstraint(name = "UC_CNTRY_STATE_STREET", columnNames = {SchemaColumnConstantName.T_COUNTRY_ID
        , SchemaColumnConstantName.T_STATE_ID
        , SchemaColumnConstantName.T_STREET})
}
)
public class Adress extends ITracableCancelableEntity {
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = SchemaColumnConstantName.T_COUNTRY_ID, nullable = false)
    @ForeignKey(name = "FK_ADRESS_REF_COUNTRY")
    private Country country;
    @Transient
    private UUID countryId;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = SchemaColumnConstantName.T_STATE_ID, nullable = false)
    @ForeignKey(name = "FK_ADRESS_REF_STATE")
    private State state;
    @Transient
    private UUID stateId;

    @Column(name = SchemaColumnConstantName.T_STREET, length = SchemaConstantSize.STREET, nullable = false)
    private String street;
    @Column(name = SchemaColumnConstantName.T_LATITUDE)
    private double latitude;
    @Column(name = SchemaColumnConstantName.T_LONGITUDE)
    private double longitude;

    @Override
    public Object newInstance() {
        return new Adress();
    }

    @Override
    public Object newXmlInstance() {
        return new Adress();
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

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public UUID getStateId() {
        return stateId;
    }

    public void setStateId(UUID stateId) {
        this.stateId = stateId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}