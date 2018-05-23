
package com.oryx.ws.ref.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Created by 241180 on 09/01/2017.
 * 
 * <p>Classe Java pour CountryVO complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CountryVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://model.ref.ws.oryx.com}TracableCancelableEntityVO">
 *       &lt;sequence>
 *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="polCapital" type="{http://model.ref.ws.oryx.com}StateVO" minOccurs="0"/>
 *         &lt;element name="polCapitalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ecoCapital" type="{http://model.ref.ws.oryx.com}StateVO" minOccurs="0"/>
 *         &lt;element name="ecoCapitalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountryVO", propOrder = {
    "countryCode",
    "language",
    "name",
    "polCapital",
    "polCapitalId",
    "ecoCapital",
    "ecoCapitalId"
})
public class CountryVO
    extends TracableCancelableEntityVO
{

    protected String countryCode;
    protected String language;
    protected String name;
    protected StateVO polCapital;
    protected String polCapitalId;
    protected StateVO ecoCapital;
    protected String ecoCapitalId;

    /**
     * Obtient la valeur de la propriété countryCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Définit la valeur de la propriété countryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Obtient la valeur de la propriété language.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Définit la valeur de la propriété language.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

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
     * Obtient la valeur de la propriété polCapital.
     * 
     * @return
     *     possible object is
     *     {@link StateVO }
     *     
     */
    public StateVO getPolCapital() {
        return polCapital;
    }

    /**
     * Définit la valeur de la propriété polCapital.
     * 
     * @param value
     *     allowed object is
     *     {@link StateVO }
     *     
     */
    public void setPolCapital(StateVO value) {
        this.polCapital = value;
    }

    /**
     * Obtient la valeur de la propriété polCapitalId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolCapitalId() {
        return polCapitalId;
    }

    /**
     * Définit la valeur de la propriété polCapitalId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolCapitalId(String value) {
        this.polCapitalId = value;
    }

    /**
     * Obtient la valeur de la propriété ecoCapital.
     * 
     * @return
     *     possible object is
     *     {@link StateVO }
     *     
     */
    public StateVO getEcoCapital() {
        return ecoCapital;
    }

    /**
     * Définit la valeur de la propriété ecoCapital.
     * 
     * @param value
     *     allowed object is
     *     {@link StateVO }
     *     
     */
    public void setEcoCapital(StateVO value) {
        this.ecoCapital = value;
    }

    /**
     * Obtient la valeur de la propriété ecoCapitalId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEcoCapitalId() {
        return ecoCapitalId;
    }

    /**
     * Définit la valeur de la propriété ecoCapitalId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEcoCapitalId(String value) {
        this.ecoCapitalId = value;
    }

}
