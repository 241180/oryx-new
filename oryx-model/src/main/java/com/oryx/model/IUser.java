package com.oryx.model;

import com.oryx.domain.Role;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XmlUser", namespace = "http://model.ref.ws.oryx.com")
@Entity
@Table(
        name = SchemaTableConstantName.T_USER
        /*, uniqueConstraints = {
        @UniqueConstraint(name = "UC_DATE_HOST"
                , columnNames = {SchemaTableConstantName.T_RDV_DATE, SchemaTableConstantName.T_HOST_ID}),
        @UniqueConstraint(name = "UC_DATE_GUEST"
                , columnNames = {SchemaTableConstantName.T_RDV_DATE, SchemaTableConstantName.T_GUEST_ID})}
                */
)
public class IUser extends ITracableCancelableEntity{
    private String email;
    private String name;
    private String enabled;
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "user_role")
    private Role role;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }
}