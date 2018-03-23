package com.oryx.model.system.ose;

import com.oryx.model.basic.ITracableCancelableEntity;
import com.oryx.model.SchemaColumnConstantName;
import com.oryx.model.SchemaConstantSize;
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
@XmlType(name = "XmlCodification", namespace = "http://model.ref.ws.oryx.com")
@Entity
@Table(
        name = SchemaTableConstantName.T_CODIFICATION
        , uniqueConstraints = {@UniqueConstraint(name = "UC_CODIF_SERV_CODE_INT_CODE", columnNames = {SchemaColumnConstantName.T_SERVER_CODE, SchemaColumnConstantName.T_INTERNAL_CODE})}
)
public class Codification extends ITracableCancelableEntity {

    @Column(name = SchemaColumnConstantName.T_SERVER_CODE, length = SchemaConstantSize.CODE, nullable = false)
    private String serverCode;

    @Column(name = SchemaColumnConstantName.T_INTERNAL_CODE, length = SchemaConstantSize.M_VALUE, nullable = false)
    private String internalCode;

    @Column(name = SchemaColumnConstantName.T_EXTERNAL_CODE, length = SchemaConstantSize.M_VALUE, nullable = false)
    private String externalCode;

    @Column(name = SchemaColumnConstantName.T_STAT_DATE)
    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Column(name = SchemaColumnConstantName.T_END_DATE)
    @Temporal(TemporalType.DATE)
    private Date endDate;

    @Override
    public Object newInstance() {
        return new Codification();
    }

    @Override
    public Object newXmlInstance() {
        return new Codification();
    }

    public String getInternalCode() {
        return internalCode;
    }

    public void setInternalCode(String internalCode) {
        this.internalCode = internalCode;
    }

    public String getExternalCode() {
        return externalCode;
    }

    public void setExternalCode(String externalCode) {
        this.externalCode = externalCode;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getServerCode() {
        return serverCode;
    }

    public void setServerCode(String serverCode) {
        this.serverCode = serverCode;
    }
}
