package com.oryx.model.system.msg;

import com.oryx.domain.IEnumLanguage;
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
@XmlType(name = "XmlErrorMessage", namespace = "http://model.ref.ws.oryx.com")
@Entity
@Table(
        name = SchemaTableConstantName.T_ERROR_MESSAGE
        , uniqueConstraints = {@UniqueConstraint(name = "UC_ERR_MSG_CODE_LANG_CODE"
        , columnNames = {SchemaColumnConstantName.T_CODE, SchemaColumnConstantName.T_LANGUAGE_CODE})}
)
public class ErrorMessage extends ITracableCancelableEntity {
    @Column(name = SchemaColumnConstantName.T_CODE, length = SchemaConstantSize.CODE, nullable = false)
    private String messageCode;

    @Enumerated(EnumType.STRING)
    @Column(name = SchemaColumnConstantName.T_LANGUAGE_CODE, length = SchemaConstantSize.LANG_CODE, nullable = false)
    private IEnumLanguage.Types language;

    @Column(name = SchemaColumnConstantName.T_MEANING, length = SchemaConstantSize.L_DESCRIPTION, nullable = false)
    private String meaning;

    @Override
    public Object newInstance() {
        return new ErrorMessage();
    }

    @Override
    public Object newXmlInstance() {
        return new ErrorMessage();
    }

    public IEnumLanguage.Types getLanguage() {
        return language;
    }

    public void setLanguage(IEnumLanguage.Types language) {
        this.language = language;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public String getMessageCode() {
        return messageCode;
    }

    public void setMessageCode(String messageCode) {
        this.messageCode = messageCode;
    }
}