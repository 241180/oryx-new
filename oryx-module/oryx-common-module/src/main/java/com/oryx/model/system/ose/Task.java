package com.oryx.model.system.ose;

import com.oryx.domain.EnumPermission;
import com.oryx.domain.EnumStatus;
import com.oryx.model.basic.ITracableCancelableEntity;
import com.oryx.model.SchemaColumnConstantName;
import com.oryx.model.SchemaConstantSize;
import com.oryx.model.SchemaTableConstantName;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by 241180 on 09/01/2017.
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XmlTask", namespace = "http://model.ref.ws.oryx.com")
@Entity
@Table(
        name = SchemaTableConstantName.T_TASK
        , uniqueConstraints = {@UniqueConstraint(name = "UC_TASK_NAME_PERMISSION", columnNames = {SchemaColumnConstantName.T_NAME, SchemaColumnConstantName.T_PERMISSION})}
)
public class Task extends ITracableCancelableEntity {
    @Column(name = SchemaColumnConstantName.T_NAME, length = SchemaConstantSize.NAME, nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = SchemaColumnConstantName.T_PERMISSION, length = SchemaConstantSize.CODE, nullable = false)
    private EnumPermission permission;

    @Column(name = SchemaColumnConstantName.T_DESCRIPTION, length = SchemaConstantSize.M_DESCRIPTION)
    private String descriptionTextArea;

    @Enumerated(EnumType.STRING)
    @Column(name = SchemaColumnConstantName.T_STATUS, length = SchemaConstantSize.CODE, nullable = false)
    private EnumStatus status;

    @Column(name = SchemaColumnConstantName.T_MENU_PATH, length = SchemaConstantSize.L_DESCRIPTION)
    private String menuPath;

    @Override
    public Object newInstance() {
        return new Task();
    }

    @Override
    public Object newXmlInstance() {
        return new Task();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnumStatus getStatus() {
        return status;
    }

    public void setStatus(EnumStatus status) {
        this.status = status;
    }

    public String getDescription() {
        return descriptionTextArea;
    }

    public void setDescription(String description) {
        this.descriptionTextArea = description;
    }

    public EnumPermission getPermission() {
        return permission;
    }

    public void setPermission(EnumPermission permission) {
        this.permission = permission;
    }

    public String getDescriptionTextArea() {
        return descriptionTextArea;
    }

    public void setDescriptionTextArea(String descriptionTextArea) {
        this.descriptionTextArea = descriptionTextArea;
    }

    public String getMenuPath() {
        return menuPath;
    }

    public void setMenuPath(String menuPath) {
        this.menuPath = menuPath;
    }
}
