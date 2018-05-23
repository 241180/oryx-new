
package com.oryx.ws.ref.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.oryx.ws.ref.domain.EnumUIDVO;


/**
 * Created by 241180 on 09/01/2017.
 * 
 * <p>Classe Java pour UidVO complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="UidVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://model.ref.ws.oryx.com}TracableCancelableEntityVO">
 *       &lt;sequence>
 *         &lt;element name="uidType" type="{http://domain.ref.ws.oryx.com}EnumUIDVO" minOccurs="0"/>
 *         &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UidVO", propOrder = {
    "uidType",
    "uid"
})
public class UidVO
    extends TracableCancelableEntityVO
{

    @XmlSchemaType(name = "string")
    protected EnumUIDVO uidType;
    protected String uid;

    /**
     * Obtient la valeur de la propriété uidType.
     * 
     * @return
     *     possible object is
     *     {@link EnumUIDVO }
     *     
     */
    public EnumUIDVO getUidType() {
        return uidType;
    }

    /**
     * Définit la valeur de la propriété uidType.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumUIDVO }
     *     
     */
    public void setUidType(EnumUIDVO value) {
        this.uidType = value;
    }

    /**
     * Obtient la valeur de la propriété uid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUid() {
        return uid;
    }

    /**
     * Définit la valeur de la propriété uid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUid(String value) {
        this.uid = value;
    }

}
