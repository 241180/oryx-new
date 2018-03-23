package com.oryx.model.basic;

import javax.persistence.MappedSuperclass;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;

/**
 * Created by smbarki on 22/03/2018.
 */
@XmlType(name = "XmlCancelableEntity", namespace = "http://model.ref.ws.oryx.com")
@MappedSuperclass
public class ICancelableEntity extends IEntity {
    private boolean checkCancel;
    private Date cancelDate;
    private String cancelBy;

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

    public String getCancelBy() {
        return cancelBy;
    }

    public void setCancelBy(String cancelBy) {
        this.cancelBy = cancelBy;
    }
}
