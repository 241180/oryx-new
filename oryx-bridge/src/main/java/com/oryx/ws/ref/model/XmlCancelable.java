package com.oryx.ws.ref.model;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Created by smbarki on 22/03/2018.
 * <p>
 * <p>Classe Java pour XmlCancelable complex type.
 * <p>
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;complexType name="XmlCancelable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cancelBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cancelDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="checkCancel" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XmlCancelable", propOrder = {
        "cancelBy",
        "cancelDate",
        "checkCancel"
})
@XmlSeeAlso({
        XmlCancelableEntity.class
})
public class XmlCancelable {

    protected String cancelBy;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cancelDate;
    protected boolean checkCancel;

    /**
     * Obtient la valeur de la propriété cancelBy.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCancelBy() {
        return cancelBy;
    }

    /**
     * Définit la valeur de la propriété cancelBy.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCancelBy(String value) {
        this.cancelBy = value;
    }

    /**
     * Obtient la valeur de la propriété cancelDate.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getCancelDate() {
        return cancelDate;
    }

    /**
     * Définit la valeur de la propriété cancelDate.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setCancelDate(XMLGregorianCalendar value) {
        this.cancelDate = value;
    }

    /**
     * Obtient la valeur de la propriété checkCancel.
     */
    public boolean isCheckCancel() {
        return checkCancel;
    }

    /**
     * Définit la valeur de la propriété checkCancel.
     */
    public void setCheckCancel(boolean value) {
        this.checkCancel = value;
    }

}
