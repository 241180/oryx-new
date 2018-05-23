
package com.oryx.ws.ref.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Created by 241180 on 09/01/2017.
 * 
 * <p>Classe Java pour FieldProcessParamVO complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="FieldProcessParamVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://model.ref.ws.oryx.com}TracableCancelableEntityVO">
 *       &lt;sequence>
 *         &lt;element name="processCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fieldCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="processRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="processType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="processResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldProcessParamVO", propOrder = {
    "processCode",
    "fieldCode",
    "description",
    "processRef",
    "processType",
    "processResult"
})
public class FieldProcessParamVO
    extends TracableCancelableEntityVO
{

    protected String processCode;
    protected String fieldCode;
    protected String description;
    protected String processRef;
    protected String processType;
    protected String processResult;

    /**
     * Obtient la valeur de la propriété processCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessCode() {
        return processCode;
    }

    /**
     * Définit la valeur de la propriété processCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessCode(String value) {
        this.processCode = value;
    }

    /**
     * Obtient la valeur de la propriété fieldCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldCode() {
        return fieldCode;
    }

    /**
     * Définit la valeur de la propriété fieldCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldCode(String value) {
        this.fieldCode = value;
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
     * Obtient la valeur de la propriété processRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessRef() {
        return processRef;
    }

    /**
     * Définit la valeur de la propriété processRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessRef(String value) {
        this.processRef = value;
    }

    /**
     * Obtient la valeur de la propriété processType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessType() {
        return processType;
    }

    /**
     * Définit la valeur de la propriété processType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessType(String value) {
        this.processType = value;
    }

    /**
     * Obtient la valeur de la propriété processResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessResult() {
        return processResult;
    }

    /**
     * Définit la valeur de la propriété processResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessResult(String value) {
        this.processResult = value;
    }

}
