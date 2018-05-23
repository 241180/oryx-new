
package com.oryx.ws.ref.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.oryx.ws.ref.domain.EnumContactVO;


/**
 * <p>Classe Java pour SysContactVO complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SysContactVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://model.ref.ws.oryx.com}TracableCancelableEntityVO">
 *       &lt;sequence>
 *         &lt;element name="contactType" type="{http://domain.ref.ws.oryx.com}EnumContactVO" minOccurs="0"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SysContactVO", propOrder = {
    "contactType",
    "value"
})
public class SysContactVO
    extends TracableCancelableEntityVO
{

    @XmlSchemaType(name = "string")
    protected EnumContactVO contactType;
    protected String value;

    /**
     * Obtient la valeur de la propriété contactType.
     * 
     * @return
     *     possible object is
     *     {@link EnumContactVO }
     *     
     */
    public EnumContactVO getContactType() {
        return contactType;
    }

    /**
     * Définit la valeur de la propriété contactType.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumContactVO }
     *     
     */
    public void setContactType(EnumContactVO value) {
        this.contactType = value;
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

}
