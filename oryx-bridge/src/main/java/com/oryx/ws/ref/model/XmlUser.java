package com.oryx.ws.ref.model;

import com.oryx.ws.ref.domain.XmlRole;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour XmlUser complex type.
 * <p>
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;complexType name="XmlUser">
 *   &lt;complexContent>
 *     &lt;extension base="{http://model.ref.ws.oryx.com}XmlTracableCancelableEntity">
 *       &lt;sequence>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="role" type="{http://domain.ref.ws.oryx.com}XmlRole" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "User", propOrder = {
        "email",
        "name",
        "enabled",
        "password",
        "role"
})
public class XmlUser
        extends XmlTracableCancelableEntity {

    protected String email;
    protected String name;
    protected String enabled;
    protected String password;
    @XmlSchemaType(name = "string")
    protected XmlRole role;

    /**
     * Obtient la valeur de la propriété email.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEmail() {
        return email;
    }

    /**
     * Définit la valeur de la propriété email.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtient la valeur de la propriété name.
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Définit la valeur de la propriété name.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtient la valeur de la propriété enabled.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEnabled() {
        return enabled;
    }

    /**
     * Définit la valeur de la propriété enabled.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEnabled(String value) {
        this.enabled = value;
    }

    /**
     * Obtient la valeur de la propriété password.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPassword() {
        return password;
    }

    /**
     * Définit la valeur de la propriété password.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Obtient la valeur de la propriété role.
     *
     * @return possible object is
     * {@link XmlRole }
     */
    public XmlRole getRole() {
        return role;
    }

    /**
     * Définit la valeur de la propriété role.
     *
     * @param value allowed object is
     *              {@link XmlRole }
     */
    public void setRole(XmlRole value) {
        this.role = value;
    }

}
