
package com.oryx.ws.ref.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.oryx.ws.ref.domain.EnumLanguageVO;


/**
 * Created by 241180 on 09/01/2017.
 * 
 * <p>Classe Java pour ThirdPartyVO complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ThirdPartyVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://model.ref.ws.oryx.com}TracableCancelableEntityVO">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="language" type="{http://domain.ref.ws.oryx.com}EnumLanguageVO" minOccurs="0"/>
 *         &lt;element name="defaultPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ThirdPartyVO", propOrder = {
    "name",
    "reference",
    "description",
    "language",
    "defaultPhoneNumber",
    "adressSet",
    "adressIds",
    "contactSet",
    "contactIds"
})
public class ThirdPartyVO
    extends TracableCancelableEntityVO
{

    protected String name;
    protected String reference;
    protected String description;
    @XmlSchemaType(name = "string")
    protected EnumLanguageVO language;
    protected String defaultPhoneNumber;
    @XmlElement(nillable = true)
    protected List<AdressVO> adressSet;
    @XmlElement(nillable = true)
    protected List<String> adressIds;
    @XmlElement(nillable = true)
    protected List<SysContactVO> contactSet;
    @XmlElement(nillable = true)
    protected List<String> contactIds;

    /**
     * Obtient la valeur de la propriété name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Définit la valeur de la propriété name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtient la valeur de la propriété reference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Définit la valeur de la propriété reference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

    /**
     * Obtient la valeur de la propriété description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Définit la valeur de la propriété description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
