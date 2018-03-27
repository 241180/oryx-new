package com.oryx.model.system.ref;

import com.oryx.domain.IEnumCivility;
import com.oryx.domain.IEnumGender;
import com.oryx.domain.IEnumLanguage;
import com.oryx.model.*;
import com.oryx.model.basic.ITracableCancelableEntity;
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
@XmlType(name = "XmlPerson", namespace = "http://model.ref.ws.oryx.com")
@Entity
@Table(
        name = SchemaTableConstantName.T_PERSON
        , uniqueConstraints = {@UniqueConstraint(name = "UC_PERSON_UID", columnNames = {SchemaColumnConstantName.T_PERSON_UID})}
)
public class Person extends ITracableCancelableEntity {

    @Column(name = SchemaColumnConstantName.T_PERSON_UID, length = SchemaConstantSize.UID, nullable = false)
    private String defaultUid;

    @Column(name = SchemaColumnConstantName.T_FIRST_NAME, length = SchemaConstantSize.NAME, nullable = false)
    private String firstName;

    @Column(name = SchemaColumnConstantName.T_LAST_NAME, length = SchemaConstantSize.NAME, nullable = false)
    private String lastName;

    @Column(name = SchemaColumnConstantName.T_PHONE_NUMBER, length = SchemaConstantSize.PHONE_NUMBER)
    private String defaultPhoneNumber;

    @Enumerated(EnumType.STRING)
    @Column(name = SchemaColumnConstantName.T_CIVILITY, length = SchemaConstantSize.CODE, nullable = false)
    private IEnumCivility.Types civility;

    @Enumerated(EnumType.STRING)
    @Column(name = SchemaColumnConstantName.T_GENDER, length = SchemaConstantSize.CODE, nullable = false)
    private IEnumGender.Types gender;

    @Enumerated(EnumType.STRING)
    @Column(name = ComSchemaColumnConstantName.T_LANG_CODE, length = ComSchemaConstantSize.LANG_CODE)
    private IEnumLanguage.Types language;

    @Column(name = SchemaColumnConstantName.T_BIRTH_DATE, nullable = false)
    @Temporal(TemporalType.DATE)
    private Date birthDate;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = SchemaColumnConstantName.T_BIRTH_STATE_ID)
    @ForeignKey(name = "FK_PERSON_REF_PBIRTH_STATE")
    private State birthPlace;
    @Transient
    private UUID birthPlaceId;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = SchemaColumnConstantName.T_PERSON_ID)
    @ForeignKey(name = "FK_PERSON_REF_UID")
    private Set<Uid> uidSet;
    @Transient
    private List<UUID> uidIds;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = SchemaTableConstantName.T_ASSO_PERSON_ADRESS,
            joinColumns = {
                    @JoinColumn(name = SchemaColumnConstantName.T_PERSON_ID, referencedColumnName = ComSchemaColumnConstantName.T_ID)
            },
            inverseJoinColumns = {
                    @JoinColumn(name = SchemaColumnConstantName.T_ADRESS_ID, referencedColumnName = ComSchemaColumnConstantName.T_ID)
            }
    )
    @ForeignKey(name = "FK_PERSON", inverseName = "FK_ADRESS")
    private Set<Adress> adressSet;
    @Transient
    private List<UUID> adressIds;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = SchemaTableConstantName.T_ASSO_PERSON_CONTACT,
            joinColumns = {
                    @JoinColumn(name = SchemaColumnConstantName.T_PERSON_ID, referencedColumnName = ComSchemaColumnConstantName.T_ID)
            },
            inverseJoinColumns = {
                    @JoinColumn(name = SchemaColumnConstantName.T_CONTACT_ID, referencedColumnName = ComSchemaColumnConstantName.T_ID)
            }
    )
    @ForeignKey(name = "FK_PERSONT", inverseName = "FK_CONTACT")
    private Set<Contact> contactSet;
    @Transient
    private List<UUID> contactIds;


    public Person() {

    }

    public Person(String firstName, String secondName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String defaultUid, String firstName, String lastName, String defaultPhoneNumber, IEnumCivility.Types civility, IEnumGender.Types gender, IEnumLanguage.Types language, Date birthDate, State birthPlace, UUID birthPlaceId, Set<Uid> uidSet, List<UUID> uidIds, Set<Adress> adressSet, List<UUID> adressIds, Set<Contact> contactSet, List<UUID> contactIds) {
        this.defaultUid = defaultUid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.defaultPhoneNumber = defaultPhoneNumber;
        this.civility = civility;
        this.gender = gender;
        this.language = language;
        this.birthDate = birthDate;
        this.birthPlace = birthPlace;
        this.birthPlaceId = birthPlaceId;
        this.uidSet = uidSet;
        this.uidIds = uidIds;
        this.adressSet = adressSet;
        this.adressIds = adressIds;
        this.contactSet = contactSet;
        this.contactIds = contactIds;
    }

    @Override
    public Object newInstance() {
        return new Person();
    }

    @Override
    public Object newXmlInstance() {
        return new Person();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public IEnumCivility.Types getCivility() {
        return civility;
    }

    public void setCivility(IEnumCivility.Types civility) {
        this.civility = civility;
    }

    public IEnumGender.Types getGender() {
        return gender;
    }

    public void setGender(IEnumGender.Types gender) {
        this.gender = gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Set<Adress> getAdressSet() {
        return adressSet;
    }

    public void setAdressSet(Set<Adress> adressSet) {
        this.adressSet = adressSet;
    }

    public List<UUID> getAdressIds() {
        return adressIds;
    }

    public void setAdressIds(List<UUID> adressIds) {
        this.adressIds = adressIds;
    }

    public Set<Uid> getUidSet() {
        return uidSet;
    }

    public void setUidSet(Set<Uid> uidSet) {
        this.uidSet = uidSet;
    }

    public List<UUID> getUidIds() {
        return uidIds;
    }

    public void setUidIds(List<UUID> uidIds) {
        this.uidIds = uidIds;
    }

    public Set<Contact> getContactSet() {
        return contactSet;
    }

    public void setContactSet(Set<Contact> contactSet) {
        this.contactSet = contactSet;
    }

    public List<UUID> getContactIds() {
        return contactIds;
    }

    public void setContactIds(List<UUID> contactIds) {
        this.contactIds = contactIds;
    }

    public UUID getBirthPlaceId() {
        return birthPlaceId;
    }

    public void setBirthPlaceId(UUID birthPlaceId) {
        this.birthPlaceId = birthPlaceId;
    }

    public String getDefaultUid() {
        return defaultUid;
    }

    public void setDefaultUid(String defaultUid) {
        this.defaultUid = defaultUid;
    }

    public String getDefaultPhoneNumber() {
        return defaultPhoneNumber;
    }

    public void setDefaultPhoneNumber(String defaultPhoneNumber) {
        this.defaultPhoneNumber = defaultPhoneNumber;
    }

    public State getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(State birthPlace) {
        this.birthPlace = birthPlace;
    }

    public IEnumLanguage.Types getLanguage() {
        return language;
    }

    public void setLanguage(IEnumLanguage.Types language) {
        this.language = language;
    }
}
