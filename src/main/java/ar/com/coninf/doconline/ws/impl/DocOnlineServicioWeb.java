/**
 * DocOnlineServicioWeb.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */
package ar.com.coninf.doconline.ws.impl;

public interface DocOnlineServicioWeb extends javax.xml.rpc.Service {
    
	public void setDocOnlineServicioWebHttpSoap11EndpointAddress(java.lang.String docOnlineServicioWebHttpSoap11Endpoint_address);
    
	public java.lang.String getDocOnlineServicioWebHttpSoap11EndpointAddress();
	
    public ar.com.coninf.doconline.ws.impl.DocOnlineServicioWebPortType getDocOnlineServicioWebHttpSoap11Endpoint() throws javax.xml.rpc.ServiceException;
    public ar.com.coninf.doconline.ws.impl.DocOnlineServicioWebPortType getDocOnlineServicioWebHttpSoap11Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;

}
