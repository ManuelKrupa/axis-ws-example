/**
 * AdditionServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.mkrupa.webservices.call;

public interface AdditionServiceService extends javax.xml.rpc.Service {
    public java.lang.String getAdditionServiceAddress();

    public com.mkrupa.webservices.call.AdditionService_PortType getAdditionService() throws javax.xml.rpc.ServiceException;

    public com.mkrupa.webservices.call.AdditionService_PortType getAdditionService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
