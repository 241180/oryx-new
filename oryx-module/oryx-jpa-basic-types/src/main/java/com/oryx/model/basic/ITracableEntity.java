package com.oryx.model.basic;

import javax.persistence.MappedSuperclass;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;

/**
 * Created by smbarki on 22/03/2018.
 */

@XmlType(name = "XmlTracableEntity", namespace = "http://model.ref.ws.oryx.com")
@MappedSuperclass
public class ITracableEntity extends IEntity {
    private Date createdDate;
    private String createdBy;
    private Date updatedDate;
    private String updatedBy;

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
}
