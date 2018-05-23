
package com.oryx.ws.ref.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.oryx.ws.ref.domain.EnumCivilityVO;
import com.oryx.ws.ref.domain.EnumGenderVO;
import com.oryx.ws.ref.domain.EnumLanguageVO;


/**
 * Created by 241180 on 09/01/2017.
 * 
 * <p>Classe Java pour PersonVO complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PersonVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://model.ref.ws.oryx.com}TracableCancelableEntityVO">
 *       &lt;sequence>
 *         &lt;element name="defaultUid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="defaultPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="civility" type="{http://domain.ref.ws.oryx.com}EnumCivilityVO" minOccurs="0"/>
 *         &lt;element name="gender" type="{http://domain.ref.ws.oryx.com}EnumGenderVO" minOccurs="0"/>
 *         &lt;element name="language" type="{http://domain.ref.ws.oryx.com}EnumLanguageVO" minOccurs="0"/>
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="birthPlace" type="{http://model.ref.ws.oryx.com}StateVO" minOccurs="0"/>
 *         &lt;element name="birthPlaceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uidSet" type="{http://model.ref.ws.oryx.com}UidVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="uidIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="adressSet" type="{http://model.ref.ws.oryx.com}AdressVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="adressIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contactSet" type="{http://model.ref.ws.oryx.com}SysContactVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contactIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonVO", propOrder = {
    "defaultUid",
    "firstName",
    "lastName",
    "defaultPhoneNumber",
    "civility",
    "gender",
    "language",
    "birthDate",
    "birthPlace",
    "birthPlaceId",
    "uidSet",
    "uidIds",
    "adressSet",
    "adressIds",
    "contactSet",
    "contactIds"
})
public class PersonVO
    extends TracableCancelableEntityVO
{

    protected String defaultUid;
    protected String firstName;
    protected String lastName;
    protected String defaultPhoneNumber;
    @XmlSchemaType(name = "string")
    protected EnumCivilityVO civility;
    @XmlSchemaType(name = "string")
    protected EnumGenderVO gender;
    @XmlSchemaType(name = "string")
    protected EnumLanguageVO language;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthDate;
    protected StateVO birthPlace;
    protected String birthPlaceId;
    @XmlElement(nillable = true)
    protected List<UidVO> uidSet;
    @XmlElement(nillable = true)
    protected List<String> uidIds;
    @XmlElement(nillable = true)
    protected List<AdressVO> adressSet;
    @XmlElement(nillable = true)
    protected List<String> adressIds;
    @XmlElement(nillable = true)
    protected List<SysContactVO> contactSet;
    @XmlElement(nillable = true)
    protected List<String> contactIds;

    /**
     * Obtient la valeur de la propriété defaultUid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultUid() {
        return defaultUid;
    }

    /**
     * Définit la valeur de la propriété defaultUid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultUid(String value) {
        this.defaultUid = value;
    }

    /**
     * Obtient la valeur de la propriété firstName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Définit la valeur de la propriété firstName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Obtient la valeur de la propriété lastName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Définit la valeur de la propriété lastName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Obtient la valeur de la propriété defaultPhoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultPhoneNumber() {
        return defaultPhoneNumber;
    }

    /**
     * Définit la valeur de la propriété defaultPhoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultPhoneNumber(String value) {
        this.defaultPhoneNumber = value;
    }

    /**
     * Obtient la valeur de la propriété civility.
     * 
     * @return
     *     possible object is
     *     {@link EnumCivilityVO }
     *     
     */
    public EnumCivilityVO getCivility() {
        return civility;
    }

    /**
     * Définit la valeur de la propriété civility.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumCivilityVO }
     *     
     */
    public void setCivility(EnumCivilityVO value) {
        this.civility = value;
    }

    /**
     * Obtient la valeur de la propriété gender.
     * 
     * @return
     *     possible object is
     *     {@link EnumGenderVO }
     *     
     */
    public EnumGenderVO getGender() {
        return gender;
    }

    /**
     * Définit la valeur de la propriété gender.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumGenderVO }
     *     
     */
    public void setGender(EnumGenderVO value) {
        this.gender = value;
    }

    /**
     * Obtient la valeur de la propriété language.
     * 
     * @return
     *     possible object is
     *     {@link EnumLanguageVO }
     *     
     */
    public EnumLanguageVO getLanguage() {
        return language;
    }

    /**
     * Définit la valeur de la propriété language.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumLanguageVO }
     *     
     */
    public void setLanguage(EnumLanguageVO value) {
        this.language = value;
    }

    /**
     * Obtient la valeur de la propriété birthDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Définit la valeur de la propriété birthDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * Obtient la valeur de la propriété birthPlace.
     * 
     * @return
     *     possible object is
     *     {@link StateVO }
     *     
     */
    public StateVO getBirthPlace() {
        return birthPlace;
    }

    /**
     * Définit la valeur de la propriété birthPlace.
     * 
     * @param value
     *     allowed object is
     *     {@link StateVO }
     *     
     */
    public void setBirthPlace(StateVO value) {
        this.birthPlace = value;
    }

    /**
     * Obtient la valeur de la propriété birthPlaceId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthPlaceId() {
        return birthPlaceId;
    }

    /**
     * Définit la valeur de la propriété birthPlaceId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthPlaceId(String value) {
        this.birthPlaceId = value;
    }

    /**
     * Gets the value of the uidSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uidSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUidSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UidVO }
     * 
     * 
     */
    public List<UidVO> getUidSet() {
        if (uidSet == null) {
            uidSet = new ArrayList<UidVO>();
        }
        return this.uidSet;
    }

    /**
     * Gets the value of the uidIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uidIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUidIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUidIds() {
        if (uidIds == null) {
            uidIds = new ArrayList<String>();
        }
        return this.uidIds;
    }

    /**
     * Gets the value of the adressSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adressSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdressSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdressVO }
     * 
     * 
     */
    public List<AdressVO> getAdressSet() {
        if (adressSet == null) {
            adressSet = new ArrayList<AdressVO>();
        }
        return this.adressSet;
    }

    /**
     * Gets the value of the adressIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adressIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdressIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAdressIds() {
        if (adressIds == null) {
            adressIds = new ArrayList<String>();
        }
        return this.adressIds;
    }

    /**
     * Gets the value of the contactSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SysContactVO }
     * 
     * 
     */
    public List<SysContactVO> getContactSet() {
        if (contactSet == null) {
            contactSet = new ArrayList<SysContactVO>();
        }
        return this.contactSet;
    }

    /**
     * Gets the value of the contactIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getContactIds() {
        if (contactIds == null) {
            contactIds = new ArrayList<String>();
        }
        return this.contactIds;
    }

}
