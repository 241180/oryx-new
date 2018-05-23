
package com.oryx.ws.ref.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.oryx.ws.ref.domain.EnumLanguageVO;


/**
 * Created by 241180 on 09/01/2017.
 * 
 * <p>Classe Java pour ErrorMessageVO complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ErrorMessageVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://model.ref.ws.oryx.com}TracableCancelableEntityVO">
 *       &lt;sequence>
 *         &lt;element name="messageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="language" type="{http://domain.ref.ws.oryx.com}EnumLanguageVO" minOccurs="0"/>
 *         &lt;element name="meaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorMessageVO", propOrder = {
    "messageCode",
    "language",
    "meaning"
})
public class ErrorMessageVO
    extends TracableCancelableEntityVO
{

    protected String messageCode;
    @XmlSchemaType(name = "string")
    protected EnumLanguageVO language;
    protected String meaning;

    /**
     * Obtient la valeur de la propriété messageCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageCode() {
        return messageCode;
    }

    /**
     * Définit la valeur de la propriété messageCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageCode(String value) {
        this.messageCode = value;
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
     * Obtient la valeur de la propriété meaning.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeaning() {
        return meaning;
    }

    /**
     * Définit la valeur de la propriété meaning.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeaning(String value) {
        this.meaning = value;
    }

}
