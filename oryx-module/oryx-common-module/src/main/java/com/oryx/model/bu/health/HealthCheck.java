package com.oryx.model.bu.health;


import com.oryx.model.basic.ITracableCancelableEntity;
import com.oryx.model.SchemaColumnConstantName;
import com.oryx.model.SchemaTableConstantName;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;

/**
 * Created by 241180 on 09/01/2017.
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XmlHealthCheck", namespace = "http://model.ref.ws.oryx.com")
@Entity
@Table(
        name = SchemaTableConstantName.T_HEALTH_CHECK
        /*, uniqueConstraints = {
        @UniqueConstraint(name = "UC_DATE_HOST"
                , columnNames = {SchemaColumnConstantName.T_RDV_DATE, SchemaColumnConstantName.T_HOST_ID}),
        @UniqueConstraint(name = "UC_DATE_GUEST"
                , columnNames = {SchemaColumnConstantName.T_RDV_DATE, SchemaColumnConstantName.T_GUEST_ID})}
                */
)
public class HealthCheck extends ITracableCancelableEntity {
    @Column(name = SchemaColumnConstantName.T_RDV_DATE, nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date healthCheckDateTime;

    /*
    Poid
Kg
Taille
cm
PAS
mmHg
PAD
mmHg
Pouls
bpm
Temp
°C
Glycémie
g/l
Cholést.
mmol/l
     */


    @Override
    public Object newInstance() {
        return new HealthCheck();
    }

    @Override
    public Object newXmlInstance() {
        return new HealthCheck();
    }
}