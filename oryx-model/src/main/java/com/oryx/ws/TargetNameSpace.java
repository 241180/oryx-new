package com.oryx.ws;

/**
 * Created by 241180 on 06/03/2017.
 */
public interface TargetNameSpace {
    static final String REQUEST_LOCAL_PORT = "wsRequest";
    static final String TARGET_NAMESPACE_BASE = "http://com/oryx/ws/";

    static final String TARGET_NAMESPACE_CONTACT = TARGET_NAMESPACE_BASE + "contactservice";
    static final String TARGET_NAMESPACE_USER = TARGET_NAMESPACE_BASE + "userservice";
}
