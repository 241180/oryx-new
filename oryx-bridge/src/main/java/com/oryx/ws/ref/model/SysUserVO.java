
package com.oryx.ws.ref.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.oryx.ws.ref.domain.EnumLanguageVO;
import com.oryx.ws.ref.domain.EnumStatusVO;
import com.oryx.ws.ref.domain.EnumUserRoleVO;


/**
 * Created by 241180 on 09/01/2017.
 * 
 * <p>Classe Java pour SysUserVO complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SysUserVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://model.ref.ws.oryx.com}TracableCancelableEntityVO">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="language" type="{http://domain.ref.ws.oryx.com}EnumLanguageVO" minOccurs="0"/>
 *         &lt;element name="lastConnection" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="role" type="{http://domain.ref.ws.oryx.com}EnumUserRoleVO" minOccurs="0"/>
 *         &lt;element name="status" type="{http://domain.ref.ws.oryx.com}EnumStatusVO" minOccurs="0"/>
 *         &lt;element name="person" type="{http://model.ref.ws.oryx.com}PersonVO" minOccurs="0"/>
 *         &lt;element name="personId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roleSet" type="{http://model.ref.ws.oryx.com}RoleInfoVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="roleIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SysUserVO", propOrder = {
    "code",
    "email",
    "login",
    "password",
    "startDate",
    "endDate",
    "language",
    "lastConnection",
    "role",
    "status",
    "person",
    "personId",
    "roleSet",
    "roleIds"
})
public class SysUserVO
    extends TracableCancelableEntityVO
{

    protected String code;
    protected String email;
    protected String login;
    protected String password;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlSchemaType(name = "string")
    protected EnumLanguageVO language;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastConnection;
    @XmlSchemaType(name = "string")
    protected EnumUserRoleVO role;
    @XmlSchemaType(name = "string")
    protected EnumStatusVO status;
    protected PersonVO person;
    protected String personId;
    @XmlElement(nillable = true)
    protected List<RoleInfoVO> roleSet;
    @XmlElement(nillable = true)
    protected List<String> roleIds;

    /**
     * Obtient la valeur de la propriété code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Définit la valeur de la propriété code.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Obtient la valeur de la propriété email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Définit la valeur de la propriété email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtient la valeur de la propriété login.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogin() {
        return login;
    }

    /**
     * Définit la valeur de la propriété login.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogin(String value) {
        this.login = value;
    }

    /**
     * Obtient la valeur de la propriété password.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Définit la valeur de la propriété password.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Obtient la valeur de la propriété startDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Définit la valeur de la propriété startDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Obtient la valeur de la propriété endDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Définit la valeur de la propriété endDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
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
     * Obtient la valeur de la propriété lastConnection.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastConnection() {
        return lastConnection;
    }

    /**
     * Définit la valeur de la propriété lastConnection.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastConnection(XMLGregorianCalendar value) {
        this.lastConnection = value;
    }

    /**
     * Obtient la valeur de la propriété role.
     * 
     * @return
     *     possible object is
     *     {@link EnumUserRoleVO }
     *     
     */
    public EnumUserRoleVO getRole() {
        return role;
    }

    /**
     * Définit la valeur de la propriété role.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumUserRoleVO }
     *     
     */
    public void setRole(EnumUserRoleVO value) {
        this.role = value;
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
     * Obtient la valeur de la propriété person.
     * 
     * @return
     *     possible object is
     *     {@link PersonVO }
     *     
     */
    public PersonVO getPerson() {
        return person;
    }

    /**
     * Définit la valeur de la propriété person.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonVO }
     *     
     */
    public void setPerson(PersonVO value) {
        this.person = value;
    }

    /**
     * Obtient la valeur de la propriété personId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * Définit la valeur de la propriété personId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonId(String value) {
        this.personId = value;
    }

    /**
     * Gets the value of the roleSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roleSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoleSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoleInfoVO }
     * 
     * 
     */
    public List<RoleInfoVO> getRoleSet() {
        if (roleSet == null) {
            roleSet = new ArrayList<RoleInfoVO>();
        }
        return this.roleSet;
    }

    /**
     * Gets the value of the roleIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roleIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoleIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRoleIds() {
        if (roleIds == null) {
            roleIds = new ArrayList<String>();
        }
        return this.roleIds;
    }

}
