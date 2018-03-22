package com.oryx.ws;

import com.oryx.ws.contactservice.*;
import com.oryx.ws.userservice.*;
import org.apache.log4j.Logger;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * The Class UserService.
 */

/*
    http://localhost:8080/oryx/endpoint/ContactService.wsdl
 */
@Endpoint
public class ContactServiceEndpoint {

    final static Logger logger = Logger.getLogger(ContactServiceEndpoint.class);

    @PayloadRoot(localPart = TargetNameSpace.REQUEST_LOCAL_PORT_CONTACT, namespace = TargetNameSpace.TARGET_NAMESPACE_CONTACT)
    public
    @ResponsePayload
    WsContactResponse askContact(@RequestPayload  WsContactRequest request) {
        return null;
    }

    @PayloadRoot(localPart = TargetNameSpace.REQUEST_LOCAL_PORT_USER, namespace = TargetNameSpace.TARGET_NAMESPACE_USER)
    public
    @ResponsePayload
    WsUserResponse askUser(@RequestPayload  WsUserRequest request) {
        return null;
    }
}