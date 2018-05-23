package com.oryx.model.listener;

import com.oryx.model.basic.IEntity;
import com.oryx.model.basic.ITracableCancelableEntity;
import com.oryx.model.basic.ITracableEntity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by smbarki on 08/09/2017.
 */
public class TracableEntityListener {
    @PrePersist
    void onPrePersist(IEntity entity) {
        entity.setVersion(entity.getVersion()!=null?entity.getVersion():0+1);
        if(entity instanceof ITracableEntity){
            ((ITracableEntity)entity).setCreateDate(new Date());
        } else if(entity instanceof ITracableCancelableEntity){
            ((ITracableCancelableEntity)entity).setCreateDate(new Date());
        }
    }

    @PostPersist
    void onPostPersist(IEntity entity) {
    }

    @PostLoad
    void onPostLoad(IEntity entity) {
    }

    @PreUpdate
    void onPreUpdate(IEntity entity) {
        entity.setVersion(entity.getVersion()!=null?entity.getVersion():0+1);
        if(entity instanceof ITracableEntity){
            ((ITracableEntity)entity).setUpdateDate(new Date());
        } else if(entity instanceof ITracableCancelableEntity){
            ((ITracableCancelableEntity)entity).setUpdateDate(new Date());
        }
    }

    @PostUpdate
    void onPostUpdate(IEntity entity) {
    }

    @PreRemove
    void onPreRemove(IEntity entity) {
    }

    @PostRemove
    void onPostRemove(IEntity entity) {
    }
}
