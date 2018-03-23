package com.oryx.model;

import com.oryx.domain.IEnumCrudOperation;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.xml.bind.annotation.XmlType;
import java.util.UUID;

/**
 * Created by smbarki on 22/03/2018.
 */

@XmlType(name = "XmlEntity", namespace = "http://model.ref.ws.oryx.com")
@MappedSuperclass
public class IEntity {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = ComSchemaColumnConstantName.T_ID, updatable = false, nullable = false, columnDefinition = ComSchemaColumnConstantName.ID_COL_DEFINITION)
    private UUID id;

    @Column(name = ComSchemaColumnConstantName.T_VERSION)
    private Integer version;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
