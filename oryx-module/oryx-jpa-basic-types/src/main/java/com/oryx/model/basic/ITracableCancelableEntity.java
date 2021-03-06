package com.oryx.model.basic;

import com.oryx.model.ComSchemaColumnConstantName;
import com.oryx.model.basic.ITracableEntity;
import com.oryx.model.listener.TracableEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;

/**
 * Created by smbarki on 22/03/2018.
 */

@XmlType(name = "TracableCancelableEntityVO", namespace = "http://model.ref.ws.oryx.com")
@MappedSuperclass
@EntityListeners(TracableEntityListener.class)
public class ITracableCancelableEntity extends ICancelableEntity {
    @Column(name = ComSchemaColumnConstantName.T_CREATE_DATE)
    private Date creatDate;

    @Column(name = ComSchemaColumnConstantName.T_CREATED_BY)
    private String creatBy;

    @Column(name = ComSchemaColumnConstantName.T_UPDATE_DATE)
    private Date updateDate;

    @Column(name = ComSchemaColumnConstantName.T_UPDATED_BY)
    private String updatedBy;

    public Date getCreateDate() {
        return creatDate;
    }

    public void setCreateDate(Date createDate) {
        this.creatDate = createDate;
    }

    public String getCreatedBy() {
        return creatBy;
    }

    public void setCreatedBy(String createdBy) {
        this.creatBy = createdBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
}
