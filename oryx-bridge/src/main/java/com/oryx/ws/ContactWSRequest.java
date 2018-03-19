
package com.oryx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.oryx.ws.ref.model.XmlContact;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="conact" type="{http://model.ref.ws.oryx.com}XmlContact"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "request",
    "conact"
})
@XmlRootElement(name = "ContactWSRequest")
public class ContactWSRequest {

    @XmlElement(required = true)
    protected String request;
    @XmlElement(required = true)
    protected XmlContact conact;

    /**
     * Obtient la valeur de la propriété request.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequest() {
        return request;
    }

    /**
     * Définit la valeur de la propriété request.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequest(String value) {
        this.request = value;
    }

    /**
     * Obtient la valeur de la propriété conact.
     * 
     * @return
     *     possible object is
     *     {@link XmlContact }
     *     
     */
    public XmlContact getConact() {
        return conact;
    }

    /**
     * Définit la valeur de la propriété conact.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlContact }
     *     
     */
    public void setConact(XmlContact value) {
        this.conact = value;
    }

}
