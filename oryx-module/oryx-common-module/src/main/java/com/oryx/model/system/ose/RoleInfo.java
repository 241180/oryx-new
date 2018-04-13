package com.oryx.model.system.ose;

import com.oryx.domain.IEnumStatus;
import com.oryx.model.*;
import com.oryx.model.basic.ITracableCancelableEntity;
import org.hibernate.annotations.ForeignKey;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.List;
import java.util.Set;

/**
 * Created by 241180 on 09/01/2017.
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoleInfoVO", namespace = "http://model.ref.ws.oryx.com")
@Entity
@Table(
        name = SchemaTableConstantName.T_ROLE_INFO
        , uniqueConstraints = {@UniqueConstraint(name = "UC_ROLE_NAME", columnNames = {SchemaColumnConstantName.T_ROLE_NAME})}
)
public class RoleInfo extends ITracableCancelableEntity {
    @Column(name = SchemaColumnConstantName.T_ROLE_NAME, length = SchemaConstantSize.NAME, nullable = false)
    private String name;

    @Column(name = SchemaColumnConstantName.T_DESCRIPTION, length = SchemaConstantSize.M_DESCRIPTION)
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = SchemaColumnConstantName.T_STATUS, length = SchemaConstantSize.CODE, nullable = false)
    private IEnumStatus.Types status;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = SchemaTableConstantName.T_ASSO_ROLE_MENU,
            joinColumns = {
                    @JoinColumn(name = SchemaColumnConstantName.T_ROLE_ID, referencedColumnName = ComSchemaColumnConstantName.T_ID)
            },
            inverseJoinColumns = {
                    @JoinColumn(name = SchemaColumnConstantName.T_MENU_ID, referencedColumnName = ComSchemaColumnConstantName.T_ID)
            }
    )
    @ForeignKey(name = "FK_ROLE", inverseName = "FK_MENU")
    private Set<Menu> menuSet;

    @Transient
    private List<String> menuIds;

    @Override
    public Object newInstance() {
        return new RoleInfo();
    }

    @Override
    public Object newXmlInstance() {
        return new RoleInfo();
    }

    public Set<Menu> getMenuSet() {
        return menuSet;
    }

    public void setMenuSet(Set<Menu> menuSet) {
        this.menuSet = menuSet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IEnumStatus.Types getStatus() {
        return status;
    }

    public void setStatus(IEnumStatus.Types status) {
        this.status = status;
    }

    public Set<Menu> getMenus() {
        return menuSet;
    }

    public void setMenus(Set<Menu> menuSet) {
        this.menuSet = menuSet;
    }

    public List<String> getMenuIds() {
        return menuIds;
    }

    public void setMenuIds(List<String> menuIds) {
        this.menuIds = menuIds;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}