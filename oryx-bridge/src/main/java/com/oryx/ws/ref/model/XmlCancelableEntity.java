package com.oryx.ws.ref.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Created by smbarki on 22/03/2018.
 * <p>
 * <p>Classe Java pour XmlCancelableEntity complex type.
 * <p>
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;complexType name="XmlCancelableEntity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://model.ref.ws.oryx.com}XmlCancelable">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelableEntity", propOrder = {
        "id",
        "version"
})
public class XmlCancelableEntity
        extends XmlCancelable {

    protected String id;
    protected Integer version;

    /**
     * Obtient la valeur de la propriété id.
     *
     * @return possible object is
     * {@link String }
     */
    public String getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété version.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * Définit la valeur de la propriété version.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setVersion(Integer value) {
        this.version = value;
    }

}
