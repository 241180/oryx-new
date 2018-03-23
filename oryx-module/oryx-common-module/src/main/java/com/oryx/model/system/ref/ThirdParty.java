package com.oryx.model.system.ref;

import com.oryx.domain.EnumLanguage;
import com.oryx.listener.system.ref.ThirdPartyListener;
import com.oryx.model.*;
import com.oryx.model.basic.ITracableCancelableEntity;
import org.hibernate.annotations.ForeignKey;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/**
 * Created by 241180 on 09/01/2017.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XmlThirdParty", namespace = "http://model.ref.ws.oryx.com")
@Entity
@EntityListeners(ThirdPartyListener.class)
@Table(
        name = SchemaTableConstantName.T_THIRD_PARTY
        , uniqueConstraints = {
        @UniqueConstraint(name = "UC_NAME"
                , columnNames = {SchemaColumnConstantName.T_NAME}),
}

)
public class ThirdParty extends ITracableCancelableEntity {
    @Column(name = SchemaColumnConstantName.T_NAME, nullable = false)
    private String name;

    @Column(name = SchemaColumnConstantName.T_REFERENCE, nullable = false)
    private String reference;

    @Column(name = SchemaColumnConstantName.T_DESCRIPTION, length = ComSchemaConstantSize.M_DESCRIPTION, nullable = false)
    private String descriptionTextArea;

    @Enumerated(EnumType.STRING)
    @Column(name = ComSchemaColumnConstantName.T_LANG_CODE, length = ComSchemaConstantSize.LANG_CODE)
    private EnumLanguage language;

    @Column(name = SchemaColumnConstantName.T_PHONE_NUMBER, length = SchemaConstantSize.PHONE_NUMBER)
    private String defaultPhoneNumber;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = SchemaTableConstantName.T_ASSO_THIRD_PARTY_ADRESS,
            joinColumns = {
                    @JoinColumn(name = SchemaColumnConstantName.T_THIRD_PARTY_ID, referencedColumnName = ComSchemaColumnConstantName.T_ID)
            },
            inverseJoinColumns = {
                    @JoinColumn(name = SchemaColumnConstantName.T_ADRESS_ID, referencedColumnName = ComSchemaColumnConstantName.T_ID)
            }
    )
    @ForeignKey(name = "FK_THIRD_PARTY", inverseName = "FK_ADRESS")
    private Set<Adress> adressSet;
    @Transient
    private List<UUID> adressIds;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = SchemaTableConstantName.T_ASSO_THIRD_PARTY_CONTACT,
            joinColumns = {
                    @JoinColumn(name = SchemaColumnConstantName.T_THIRD_PARTY_ID, referencedColumnName = ComSchemaColumnConstantName.T_ID)
            },
            inverseJoinColumns = {
                    @JoinColumn(name = SchemaColumnConstantName.T_CONTACT_ID, referencedColumnName = ComSchemaColumnConstantName.T_ID)
            }
    )
    @ForeignKey(name = "FK_THIRD_PARTY", inverseName = "FK_CONTACT")
    private Set<Contact> contactSet;
    @Transient
    private List<UUID> contactIds;

    @Override
    public Object newInstance() {
        return new ThirdParty();
    }

    @Override
    public Object newXmlInstance() {
        return new ThirdParty();
    }
}