package com.oryx.model.system.ose;

import com.oryx.model.basic.ITracableCancelableEntity;
import com.oryx.model.SchemaColumnConstantName;
import com.oryx.model.SchemaConstantSize;
import com.oryx.model.SchemaTableConstantName;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by 241180 on 09/01/2017.
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XmlFieldProcessParam", namespace = "http://model.ref.ws.oryx.com")
@Entity
@Table(
        name = SchemaTableConstantName.T_FIELD_PROCESS_PARAM
        , uniqueConstraints = {@UniqueConstraint(name = "UC_FPP_CODE_FIELD_REF_TYPE", columnNames = {SchemaColumnConstantName.T_PROCESS_CODE
        , SchemaColumnConstantName.T_FIELD_CODE
        , SchemaColumnConstantName.T_PROCESS_REF
        , SchemaColumnConstantName.T_PROCESS_TYPE})}
)
public class FieldProcessParam extends ITracableCancelableEntity {

    @Column(name = SchemaColumnConstantName.T_PROCESS_CODE, length = SchemaConstantSize.CODE, nullable = false)
    private String processCode;

    @Column(name = SchemaColumnConstantName.T_FIELD_CODE, length = SchemaConstantSize.M_VALUE, nullable = false)
    private String fieldCode;

    @Column(name = SchemaColumnConstantName.T_DESCRIPTION, length = SchemaConstantSize.M_DESCRIPTION)
    private String description;

    @Column(name = SchemaColumnConstantName.T_PROCESS_REF, length = SchemaConstantSize.CODE/* , nullable = false */)
    private String processRef;

    @Column(name = SchemaColumnConstantName.T_PROCESS_TYPE, length = SchemaConstantSize.CODE/* , nullable = false */)
    private String processType;

    @Column(name = SchemaColumnConstantName.T_PROCESS_RESULT, length = SchemaConstantSize.CODE/* , nullable = false */)
    private String processResult;

    @Override
    public Object newInstance() {
        return new FieldProcessParam();
    }

    @Override
    public Object newXmlInstance() {
        return new FieldProcessParam();
    }

    public String getProcessCode() {
        return processCode;
    }

    public void setProcessCode(String processCode) {
        this.processCode = processCode;
    }

    public String getFieldCode() {
        return fieldCode;
    }

    public void setFieldCode(String fieldCode) {
        this.fieldCode = fieldCode;
    }

    public String getProcessRef() {
        return processRef;
    }

    public void setProcessRef(String processRef) {
        this.processRef = processRef;
    }

    public String getProcessType() {
        return processType;
    }

    public void setProcessType(String processType) {
        this.processType = processType;
    }

    public String getProcessResult() {
        return processResult;
    }

    public void setProcessResult(String processResult) {
        this.processResult = processResult;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
