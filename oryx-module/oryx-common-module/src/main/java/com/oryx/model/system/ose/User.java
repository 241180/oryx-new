package com.oryx.model.system.ose;

import com.oryx.domain.EnumLanguage;
import com.oryx.domain.EnumStatus;
import com.oryx.domain.EnumUserRole;
import com.oryx.listener.system.ref.UserListener;
import com.oryx.model.*;
import com.oryx.model.basic.ITracableCancelableEntity;
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
@XmlType(name = "XmlSysUser", namespace = "http://model.ref.ws.oryx.com")
@Entity
@EntityListeners(UserListener.class)
@Table(
        name = SchemaTableConstantName.T_USER
        , uniqueConstraints = {@UniqueConstraint(name = "UC_USER_CODE", columnNames = {SchemaColumnConstantName.T_CODE}),
        @UniqueConstraint(name = "UC_USER_EMAIL", columnNames = {SchemaColumnConstantName.T_EMAIL}),
        @UniqueConstraint(name = "UC_USER_PERSON_ID", columnNames = {SchemaColumnConstantName.T_PERSON_ID}),
        @UniqueConstraint(name = "UC_USER_LOGIN", columnNames = {SchemaColumnConstantName.T_LOGIN})}
)
public class User extends ITracableCancelableEntity {
    @Column(name = ComSchemaColumnConstantName.T_CODE, length = ComSchemaConstantSize.CODE, updatable = false/*, nullable = false*/)
    private String userCode;

    @Column(name = SchemaColumnConstantName.T_EMAIL, length = SchemaConstantSize.EMAIL/*, nullable = false*/)
    private String email;

    @Column(name = SchemaColumnConstantName.T_LOGIN, length = SchemaConstantSize.LOGIN/*, nullable = false*/)
    private String userLogin;

    @Column(name = SchemaColumnConstantName.T_USER_PASSWORD, length = SchemaConstantSize.PASS_WORD/*, nullable = false*/)
    private String userPassword;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = SchemaColumnConstantName.T_START_DATE)
    private Date startDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = SchemaColumnConstantName.T_END_DATE)
    private Date endDate;

    @Enumerated(EnumType.STRING)
    @Column(name = ComSchemaColumnConstantName.T_LANG_CODE, length = ComSchemaConstantSize.LANG_CODE)
    private EnumLanguage language;

    @Column(name = SchemaColumnConstantName.T_LAST_CONNECTION)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastConnection;

    @Enumerated(EnumType.STRING)
    @Column(name = SchemaColumnConstantName.T_USER_ROLE, length = SchemaConstantSize.CODE/*, nullable = false*/)
    private EnumUserRole role;

    @Enumerated(EnumType.STRING)
    @Column(name = SchemaColumnConstantName.T_STATUS, length = SchemaConstantSize.CODE/*, nullable = false*/)
    private EnumStatus status;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = SchemaColumnConstantName.T_PERSON_ID)
    @ForeignKey(name = "FK_USER_REF_PERSON")
    private Person person;
    @Transient
    private UUID personId;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = SchemaTableConstantName.T_ASSO_USER_ROLE,
            joinColumns = {
                    @JoinColumn(name = SchemaColumnConstantName.T_USER_ID, referencedColumnName = ComSchemaColumnConstantName.T_ID)
            },
            inverseJoinColumns = {
                    @JoinColumn(name = SchemaColumnConstantName.T_ROLE_ID, referencedColumnName = ComSchemaColumnConstantName.T_ID)
            }
    )
    @ForeignKey(name = "FK_USER", inverseName = "FK_ROLE")
    private Set<RoleInfo> roleSet;
    @Transient
    private List<String> roleIds;

    @Override
    public Object newInstance() {
        return new User();
    }

    @Override
    public Object newXmlInstance() {
        return new User();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Date getLastConnection() {
        return lastConnection;
    }

    public void setLastConnection(Date lastConnection) {
        this.lastConnection = lastConnection;
    }

    public EnumUserRole getRole() {
        return role;
    }

    public void setRole(EnumUserRole role) {
        this.role = role;
    }

    public EnumStatus getStatus() {
        return status;
    }

    public void setStatus(EnumStatus status) {
        this.status = status;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public UUID getPersonId() {
        return personId;
    }

    public void setPersonId(UUID personId) {
        this.personId = personId;
    }

    public Set<RoleInfo> getRoles() {
        return roleSet;
    }

    public void setRoles(Set<RoleInfo> roleSet) {
        this.roleSet = roleSet;
    }

    public List<String> getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(List<String> roleIds) {
        this.roleIds = roleIds;
    }

    public Set<RoleInfo> getRoleSet() {
        return roleSet;
    }

    public void setRoleSet(Set<RoleInfo> roleSet) {
        this.roleSet = roleSet;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public EnumLanguage getLanguage() {
        return language;
    }

    public void setLanguage(EnumLanguage language) {
        this.language = language;
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
}