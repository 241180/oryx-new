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
@XmlType(name = "TranslationVO", namespace = "http://model.ref.ws.oryx.com")
@Entity
@Table(
        name = SchemaTableConstantName.T_TRANSLATION
        , uniqueConstraints = {@UniqueConstraint(name = "UC_TRAN_CODE_LANG_CODE", columnNames = {SchemaColumnConstantName.T_BUNDLE, SchemaColumnConstantName.T_LANGUAGE_CODE, SchemaColumnConstantName.T_TEXT})
}
)
public class Translation extends ITracableCancelableEntity {
    @Column(name = SchemaColumnConstantName.T_BUNDLE, nullable = false, length = SchemaConstantSize.M_DESCRIPTION)
    private String bundleOrigin;

    @Enumerated(EnumType.STRING)
    @Column(name = SchemaColumnConstantName.T_LANGUAGE_CODE, length = SchemaConstantSize.LANG_CODE, nullable = false)
    private IEnumLanguage.Types language;

    @Column(name = SchemaColumnConstantName.T_TEXT, length = SchemaConstantSize.M_DESCRIPTION, nullable = false)
    private String text;

    @Column(name = SchemaColumnConstantName.T_TEXT_TRANSLATION, length = SchemaConstantSize.M_DESCRIPTION, nullable = false)
    private String translation;

    @Override
    public Object newInstance() {
        return new Translation();
    }

    @Override
    public Object newXmlInstance() {
        return new Translation();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public String getBundleOrigin() {
        return bundleOrigin;
    }

    public void setBundleOrigin(String bundleOrigin) {
        this.bundleOrigin = bundleOrigin;
    }

    public IEnumLanguage.Types getLanguage() {
        return language;
    }

    public void setLanguage(IEnumLanguage.Types language) {
        this.language = language;
    }
}