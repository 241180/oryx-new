
package com.oryx.ws.contactservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import com.oryx.ws.userservice.WsUserRequest;
import com.oryx.ws.userservice.WsUserResponse;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WsService", targetNamespace = "http://com/oryx/ws/contactservice")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    com.oryx.ws.contactservice.ObjectFactory.class,
    com.oryx.ws.ref.model.ObjectFactory.class,
    com.oryx.ws.userservice.ObjectFactory.class,
    com.oryx.ws.ref.domain.ObjectFactory.class
})
public interface WsService {


    /**
     * 
     * @param wsContactRequest
     * @return
     *     returns com.oryx.ws.contactservice.WsContactResponse
     */
    @WebMethod
    @WebResult(name = "wsContactResponse", targetNamespace = "http://com/oryx/ws/contactservice", partName = "wsContactResponse")
    public WsContactResponse wsContact(
        @WebParam(name = "wsContactRequest", targetNamespace = "http://com/oryx/ws/contactservice", partName = "wsContactRequest")
        WsContactRequest wsContactRequest);

    /**
     * 
     * @param wsUserRequest
     * @return
     *     returns com.oryx.ws.userservice.WsUserResponse
     */
    @WebMethod
    @WebResult(name = "wsUserResponse", targetNamespace = "http://com/oryx/ws/userservice", partName = "wsUserResponse")
    public WsUserResponse wsUser(
        @WebParam(name = "wsUserRequest", targetNamespace = "http://com/oryx/ws/userservice", partName = "wsUserRequest")
        WsUserRequest wsUserRequest);

}
