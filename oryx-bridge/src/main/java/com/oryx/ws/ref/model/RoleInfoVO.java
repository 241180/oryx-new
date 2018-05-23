
package com.oryx.ws.ref.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.oryx.ws.ref.domain.EnumStatusVO;


/**
 * Created by 241180 on 09/01/2017.
 * 
 * <p>Classe Java pour RoleInfoVO complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="RoleInfoVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://model.ref.ws.oryx.com}TracableCancelableEntityVO">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://domain.ref.ws.oryx.com}EnumStatusVO" minOccurs="0"/>
 *         &lt;element name="menuSet" type="{http://model.ref.ws.oryx.com}MenuVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="menuIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoleInfoVO", propOrder = {
    "name",
    "description",
    "status",
    "menuSet",
    "menuIds"
})
public class RoleInfoVO
    extends TracableCancelableEntityVO
{

    protected String name;
    protected String description;
    @XmlSchemaType(name = "string")
    protected EnumStatusVO status;
    @XmlElement(nillable = true)
    protected List<MenuVO> menuSet;
    @XmlElement(nillable = true)
    protected List<String> menuIds;

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
     * Obtient la valeur de la propriété status.
     * 
     * @return
     *     possible object is
     *     {@link EnumStatusVO }
     *     
     */
    public EnumStatusVO getStatus() {
        return status;
    }

    /**
     * Définit la valeur de la propriété status.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumStatusVO }
     *     
     */
    public void setStatus(EnumStatusVO value) {
        this.status = value;
    }

    /**
     * Gets the value of the menuSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the menuSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMenuSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MenuVO }
     * 
     * 
     */
    public List<MenuVO> getMenuSet() {
        if (menuSet == null) {
            menuSet = new ArrayList<MenuVO>();
        }
        return this.menuSet;
    }

    /**
     * Gets the value of the menuIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the menuIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMenuIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMenuIds() {
        if (menuIds == null) {
            menuIds = new ArrayList<String>();
        }
        return this.menuIds;
    }

}
