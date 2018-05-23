
package com.oryx.ws.ref.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.oryx.ws.ref.domain.EnumLanguageVO;


/**
 * Created by 241180 on 09/01/2017.
 * 
 * <p>Classe Java pour AnnexVO complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AnnexVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://model.ref.ws.oryx.com}TracableCancelableEntityVO">
 *       &lt;sequence>
 *         &lt;element name="tableCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="langage" type="{http://domain.ref.ws.oryx.com}EnumLanguageVO" minOccurs="0"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnnexVO", propOrder = {
    "tableCode",
    "langage",
    "value",
    "description",
    "reference"
})
public class AnnexVO
    extends TracableCancelableEntityVO
{

    protected String tableCode;
    @XmlSchemaType(name = "string")
    protected EnumLanguageVO langage;
    protected String value;
    protected String description;
    protected String reference;

    /**
     * Obtient la valeur de la propriété tableCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableCode() {
        return tableCode;
    }

    /**
     * Définit la valeur de la propriété tableCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableCode(String value) {
        this.tableCode = value;
    }

    /**
     * Obtient la valeur de la propriété langage.
     * 
     * @return
     *     possible object is
     *     {@link EnumLanguageVO }
     *     
     */
    public EnumLanguageVO getLangage() {
        return langage;
    }

    /**
     * Définit la valeur de la propriété langage.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumLanguageVO }
     *     
     */
    public void setLangage(EnumLanguageVO value) {
        this.langage = value;
    }

    /**
     * Obtient la valeur de la propriété value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Définit la valeur de la propriété value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
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

}
