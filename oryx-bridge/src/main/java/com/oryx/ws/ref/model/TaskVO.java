
package com.oryx.ws.ref.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.oryx.ws.ref.domain.EnumPermissionVO;
import com.oryx.ws.ref.domain.EnumStatusVO;


/**
 * Created by 241180 on 09/01/2017.
 * 
 * <p>Classe Java pour TaskVO complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TaskVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://model.ref.ws.oryx.com}TracableCancelableEntityVO">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="permission" type="{http://domain.ref.ws.oryx.com}EnumPermissionVO" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://domain.ref.ws.oryx.com}EnumStatusVO" minOccurs="0"/>
 *         &lt;element name="menuPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskVO", propOrder = {
    "name",
    "permission",
    "description",
    "status",
    "menuPath"
})
public class TaskVO
    extends TracableCancelableEntityVO
{

    protected String name;
    @XmlSchemaType(name = "string")
    protected EnumPermissionVO permission;
    protected String description;
    @XmlSchemaType(name = "string")
    protected EnumStatusVO status;
    protected String menuPath;

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
     * Obtient la valeur de la propriété permission.
     * 
     * @return
     *     possible object is
     *     {@link EnumPermissionVO }
     *     
     */
    public EnumPermissionVO getPermission() {
        return permission;
    }

    /**
     * Définit la valeur de la propriété permission.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumPermissionVO }
     *     
     */
    public void setPermission(EnumPermissionVO value) {
        this.permission = value;
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
     * Obtient la valeur de la propriété menuPath.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMenuPath() {
        return menuPath;
    }

    /**
     * Définit la valeur de la propriété menuPath.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMenuPath(String value) {
        this.menuPath = value;
    }

}
