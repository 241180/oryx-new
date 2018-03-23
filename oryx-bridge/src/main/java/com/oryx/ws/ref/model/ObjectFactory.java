
package com.oryx.ws.ref.model;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oryx.ws.ref.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oryx.ws.ref.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link XmlUser }
     * 
     */
    public XmlUser createXmlUser() {
        return new XmlUser();
    }

    /**
     * Create an instance of {@link XmlContact }
     * 
     */
    public XmlContact createXmlContact() {
        return new XmlContact();
    }

    /**
     * Create an instance of {@link XmlTracable }
     * 
     */
    public XmlTracable createXmlTracable() {
        return new XmlTracable();
    }

    /**
     * Create an instance of {@link XmlEntity }
     * 
     */
    public XmlEntity createXmlEntity() {
        return new XmlEntity();
    }

    /**
     * Create an instance of {@link XmlCancelable }
     * 
     */
    public XmlCancelable createXmlCancelable() {
        return new XmlCancelable();
    }

    /**
     * Create an instance of {@link XmlTracableEntity }
     * 
     */
    public XmlTracableEntity createXmlTracableEntity() {
        return new XmlTracableEntity();
    }

    /**
     * Create an instance of {@link XmlEnumAnnex }
     * 
     */
    public XmlEnumAnnex createXmlEnumAnnex() {
        return new XmlEnumAnnex();
    }

    /**
     * Create an instance of {@link XmlTracableCancelableEntity }
     * 
     */
    public XmlTracableCancelableEntity createXmlTracableCancelableEntity() {
        return new XmlTracableCancelableEntity();
    }

    /**
     * Create an instance of {@link XmlCancelableEntity }
     * 
     */
    public XmlCancelableEntity createXmlCancelableEntity() {
        return new XmlCancelableEntity();
    }

}
