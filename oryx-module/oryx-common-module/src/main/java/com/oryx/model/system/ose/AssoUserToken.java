package com.oryx.model.system.ose;

import com.oryx.domain.IEnumLanguage;
import com.oryx.domain.IEnumStatus;
import com.oryx.domain.IEnumUserRole;
import com.oryx.model.*;
import com.oryx.model.basic.ITracableCancelableEntity;
import com.oryx.model.basic.ITracableEntity;
import com.oryx.model.system.ref.Person;
import org.hibernate.annotations.ForeignKey;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/**
 * Created by 241180 on 09/01/2017.
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssoUserTokenVO", namespace = "http://model.ref.ws.oryx.com")
@Entity
//@EntityListeners(UserListener.class)
@Table(
        name = SchemaTableConstantName.T_ASSO_USER_TOKEN
        , uniqueConstraints = {@UniqueConstraint(name = "UC_USER_ID", columnNames = {SchemaColumnConstantName.T_USER_ID}),
        @UniqueConstraint(name = "UC_TOKEN", columnNames = {SchemaColumnConstantName.T_TOKEN})}
)
public class AssoUserToken extends ITracableEntity {
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = SchemaColumnConstantName.T_USER_ID)
    @ForeignKey(name = "FK_TOKEN_REF_USER")
    private User user;

    @Column(name = SchemaColumnConstantName.T_TOKEN, length = SchemaConstantSize.TOKEN/*, nullable = false*/)
    private String token;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}