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
@XmlType(name = "MenuVO", namespace = "http://model.ref.ws.oryx.com")
@Entity
@Table(
        name = SchemaTableConstantName.T_MENU
        , uniqueConstraints = {@UniqueConstraint(name = "UC_MENU_NAME", columnNames = {SchemaColumnConstantName.T_NAME})}
)
public class Menu extends ITracableCancelableEntity {
    @Column(name = SchemaColumnConstantName.T_NAME, length = SchemaConstantSize.NAME, nullable = false)
    private String name;

    @Column(name = SchemaColumnConstantName.T_DESCRIPTION, length = SchemaConstantSize.M_DESCRIPTION)
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = SchemaColumnConstantName.T_STATUS, length = SchemaConstantSize.CODE, nullable = false)
    private IEnumStatus.Types status;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = SchemaTableConstantName.T_ASSO_MENU_TASK,
            joinColumns = {
                    @JoinColumn(name = SchemaColumnConstantName.T_MENU_ID, referencedColumnName = ComSchemaColumnConstantName.T_ID)
            },
            inverseJoinColumns = {
                    @JoinColumn(name = SchemaColumnConstantName.T_TASK_ID, referencedColumnName = ComSchemaColumnConstantName.T_ID)
            }
    )
    @ForeignKey(name = "FK_MENU", inverseName = "FK_TASK")
    private Set<Task> taskSet;
    @Transient
    private List<String> taskIds;

    @Override
    public Object newInstance() {
        return new Menu();
    }

    @Override
    public Object newXmlInstance() {
        return new Menu();
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

    public Set<Task> getTasks() {
        return taskSet;
    }

    public void setTasks(Set<Task> taskSet) {
        this.taskSet = taskSet;
    }

    public List<String> getTaskIds() {
        return taskIds;
    }

    public void setTaskIds(List<String> taskIds) {
        this.taskIds = taskIds;
    }

    public Set<Task> getTaskSet() {
        return taskSet;
    }

    public void setTaskSet(Set<Task> taskSet) {
        this.taskSet = taskSet;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
