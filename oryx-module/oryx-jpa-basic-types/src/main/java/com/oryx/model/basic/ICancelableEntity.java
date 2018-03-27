package com.oryx.model.basic;

import com.oryx.model.ComSchemaColumnConstantName;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;

/**
 * Created by smbarki on 22/03/2018.
 */
@XmlType(name = "XmlCancelableEntity", namespace = "http://model.ref.ws.oryx.com")
@MappedSuperclass
public class ICancelableEntity extends IEntity {
    @Column(name = ComSchemaColumnConstantName.T_CHECK_CANCEL)
    private boolean checkCancel;

    @Column(name = ComSchemaColumnConstantName.T_CANCEL_DATE)
    private Date cancelDate;

    @Column(name = ComSchemaColumnConstantName.T_CANCELED_BY)
    private String canceledBy;

    public boolean isCheckCancel() {
        return checkCancel;
    }

    public void setCheckCancel(boolean checkCancel) {
        this.checkCancel = checkCancel;
    }

    public Date getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(Date cancelDate) {
        this.cancelDate = cancelDate;
    }

    public String getCanceledBy() {
        return canceledBy;
    }

    public void setCanceledBy(String canceledBy) {
        this.canceledBy = canceledBy;
    }
}
