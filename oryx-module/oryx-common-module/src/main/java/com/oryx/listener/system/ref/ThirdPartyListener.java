package com.oryx.listener.system.ref;

import javax.persistence.*;

/**
 * Created by smbarki on 08/09/2017.
 */
public class ThirdPartyListener {
    @PrePersist
    void onPrePersist(Object entity) {
    }

    @PostPersist
    void onPostPersist(Object entity) {
    }

    @PostLoad
    void onPostLoad(Object entity) {
    }

    @PreUpdate
    void onPreUpdate(Object entity) {
    }

    @PostUpdate
    void onPostUpdate(Object entity) {
    }

    @PreRemove
    void onPreRemove(Object entity) {
    }

    @PostRemove
    void onPostRemove(Object entity) {
    }
}
