package com.oryx.ws;

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
public class UserServiceEndpoint {

    final static Logger logger = Logger.getLogger(UserServiceEndpoint.class);

    @PayloadRoot(localPart = TargetNameSpace.REQUEST_LOCAL_PORT, namespace = TargetNameSpace.TARGET_NAMESPACE_USER)
    public
    @ResponsePayload
    WsResponse ws(@RequestPayload WsRequest request) {
        return null;
    }
}