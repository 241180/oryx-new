package com.oryx.listener.system.ref;

import com.oryx.Crypter;
import com.oryx.KeyczarFileReader;
import com.oryx.exceptions.KeyczarException;
import com.oryx.interfaces.KeyczarReader;
import com.oryx.model.system.ose.User;

import javax.persistence.*;

/**
 * Created by smbarki on 08/09/2017.
 */
public class UserListener {

    @PrePersist
    void onPrePersist(Object entity) throws Exception {
        User user = (User) entity;
        try {
            KeyczarReader reader = null; //new KeyczarFileReader(IServerParameterNames.ENCRIPTION_DIR);
            Crypter crypter = new Crypter(reader);
            user.setUserPassword(crypter.encrypt(user.getUserPassword()));
        } catch (KeyczarException e) {
            e.printStackTrace();
        }
    }

    @PostPersist
    void onPostPersist(Object entity) {
    }

    @PostLoad
    void onPostLoad(Object entity) {

    }

    @PreUpdate
    void onPreUpdate(Object entity) throws Exception {
        User user = (User) entity;
        try {
            KeyczarReader reader = null;//new KeyczarFileReader(IServerParameterNames.ENCRIPTION_DIR);
            Crypter crypter = new Crypter(reader);
            user.setUserPassword(crypter.encrypt(user.getUserPassword()));
        } catch (KeyczarException e) {
            e.printStackTrace();
        }
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
