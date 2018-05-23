
package com.oryx.ws.ref.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour CancelableEntityVO complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CancelableEntityVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://model.ref.ws.oryx.com}EntityVO">
 *       &lt;sequence>
 *         &lt;element name="cancelDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="canceledBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="checkCancel" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelableEntityVO", propOrder = {
    "cancelDate",
    "canceledBy",
    "checkCancel"
})
@XmlSeeAlso({
    TracableCancelableEntityVO.class
})
public class CancelableEntityVO
    extends EntityVO
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cancelDate;
    protected String canceledBy;
    protected boolean checkCancel;

    /**
     * Obtient la valeur de la propriété cancelDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCancelDate() {
        return cancelDate;
    }

    /**
     * Définit la valeur de la propriété cancelDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCancelDate(XMLGregorianCalendar value) {
        this.cancelDate = value;
    }

    /**
     * Obtient la valeur de la propriété canceledBy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanceledBy() {
        return canceledBy;
    }

    /**
     * Définit la valeur de la propriété canceledBy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanceledBy(String value) {
        this.canceledBy = value;
    }

    /**
     * Obtient la valeur de la propriété checkCancel.
     * 
     */
    public boolean isCheckCancel() {
        return checkCancel;
    }

    /**
     * Définit la valeur de la propriété checkCancel.
     * 
     */
    public void setCheckCancel(boolean value) {
        this.checkCancel = value;
    }

}
