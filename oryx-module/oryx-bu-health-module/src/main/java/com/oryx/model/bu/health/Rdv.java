package com.oryx.model.bu.health;

import com.oryx.domain.EnumRdvStatus;
import com.oryx.model.basic.ITracableCancelableEntity;
import com.oryx.model.SchemaColumnConstantName;
import com.oryx.model.SchemaConstantSize;
import com.oryx.model.SchemaTableConstantName;
import com.oryx.model.system.ref.Person;
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
@XmlType(name = "XmlRdv", namespace = "http://model.ref.ws.oryx.com")
@Entity
@Table(
        name = SchemaTableConstantName.T_RDV
        , uniqueConstraints = {
        @UniqueConstraint(name = "UC_DATE_HOST"
                , columnNames = {SchemaColumnConstantName.T_RDV_DATE, SchemaColumnConstantName.T_HOST_ID}),
        @UniqueConstraint(name = "UC_DATE_GUEST"
                , columnNames = {SchemaColumnConstantName.T_RDV_DATE, SchemaColumnConstantName.T_GUEST_ID})}
)
public class Rdv extends ITracableCancelableEntity {
    @Column(name = SchemaColumnConstantName.T_RDV_DATE, nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date rdvDateTime;

    @Column(name = SchemaColumnConstantName.T_RDV_DURATION, nullable = false)
    private Integer duration; // in min

    @Enumerated(EnumType.STRING)
    @Column(name = SchemaColumnConstantName.T_STATUS, length = SchemaConstantSize.CODE/*, nullable = false*/)
    private EnumRdvStatus status;

    @Column(name = SchemaColumnConstantName.T_REASON, length = SchemaConstantSize.L_DESCRIPTION/*, nullable = false*/)
    private String reason;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = SchemaColumnConstantName.T_HOST_ID)
    @ForeignKey(name = "FK_RDV_REF_HOST_PERSON")
    private Person host;
    @Transient
    private UUID hostId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = SchemaColumnConstantName.T_GUEST_ID)
    @ForeignKey(name = "FK_RDV_REF_GUEST_PERSON")
    private Person guest;
    @Transient
    private UUID guestId;

    @Override
    public Object newInstance() {
        return new Rdv();
    }

    @Override
    public Object newXmlInstance() {
        return new Rdv();
    }

    public EnumRdvStatus getStatus() {
        return status;
    }

    public void setStatus(EnumRdvStatus status) {
        this.status = status;
    }

    public Date getRdvDateTime() {
        return rdvDateTime;
    }

    public void setRdvDateTime(Date rdvDateTime) {
        this.rdvDateTime = rdvDateTime;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Person getHost() {
        return host;
    }

    public void setHost(Person host) {
        this.host = host;
    }

    public UUID getHostId() {
        return hostId;
    }

    public void setHostId(UUID hostId) {
        this.hostId = hostId;
    }

    public Person getGuest() {
        return guest;
    }

    public void setGuest(Person guest) {
        this.guest = guest;
    }

    public UUID getGuestId() {
        return guestId;
    }

    public void setGuestId(UUID guestId) {
        this.guestId = guestId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}