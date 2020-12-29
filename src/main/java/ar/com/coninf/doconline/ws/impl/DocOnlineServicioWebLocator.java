/**
 * DocOnlineServicioWebLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ar.com.coninf.doconline.ws.impl;

import org.springframework.stereotype.Component;

@Component(value = "webserviceclient.DocOnlineServicioWebLocator")
public class DocOnlineServicioWebLocator extends org.apache.axis.client.Service implements ar.com.coninf.doconline.ws.impl.DocOnlineServicioWeb {
	private static final long serialVersionUID = 1L;
	
	public DocOnlineServicioWebLocator() {
    }

	public DocOnlineServicioWebLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DocOnlineServicioWebLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DocOnlineServicioWebHttpSoap11Endpoint		Acá iría el URL WebService y el PORT WebService ???? 
    private java.lang.String docOnlineServicioWebHttpSoap11EndpointAddress = "http://localhost:8080/doconline-ws/services/DocOnlineServicioWeb.DocOnlineServicioWebHttpSoap11Endpoint/";

    public void setDocOnlineServicioWebHttpSoap11EndpointAddress(java.lang.String address) {
		docOnlineServicioWebHttpSoap11EndpointAddress = address;
	}

    public void setDocOnlineServicioWebHttpSoap11EndpointEndpointAddress(java.lang.String address) {
    	setDocOnlineServicioWebHttpSoap11EndpointAddress(address);
    }

    public java.lang.String getDocOnlineServicioWebHttpSoap11EndpointAddress() {
        return docOnlineServicioWebHttpSoap11EndpointAddress;
    }

	// The WSDD service name defaults to the port name.
    private java.lang.String docOnlineServicioWebHttpSoap11EndpointWSDDServiceName = "DocOnlineServicioWebHttpSoap11Endpoint";

    public java.lang.String getDocOnlineServicioWebHttpSoap11EndpointWSDDServiceName() {
        return docOnlineServicioWebHttpSoap11EndpointWSDDServiceName;
    }

    public void setDocOnlineServicioWebHttpSoap11EndpointWSDDServiceName(java.lang.String name) {
        docOnlineServicioWebHttpSoap11EndpointWSDDServiceName = name;
    }

    public ar.com.coninf.doconline.ws.impl.DocOnlineServicioWebPortType getDocOnlineServicioWebHttpSoap11Endpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(docOnlineServicioWebHttpSoap11EndpointAddress);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDocOnlineServicioWebHttpSoap11Endpoint(endpoint);
    }

    public ar.com.coninf.doconline.ws.impl.DocOnlineServicioWebPortType getDocOnlineServicioWebHttpSoap11Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ar.com.coninf.doconline.ws.impl.DocOnlineServicioWebSoap11BindingStub stub = new ar.com.coninf.doconline.ws.impl.DocOnlineServicioWebSoap11BindingStub(portAddress, this);
            stub.setPortName(getDocOnlineServicioWebHttpSoap11EndpointWSDDServiceName());
            return stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    @SuppressWarnings("rawtypes")
	public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ar.com.coninf.doconline.ws.impl.DocOnlineServicioWebPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                ar.com.coninf.doconline.ws.impl.DocOnlineServicioWebSoap11BindingStub stub = new ar.com.coninf.doconline.ws.impl.DocOnlineServicioWebSoap11BindingStub(new java.net.URL(docOnlineServicioWebHttpSoap11EndpointAddress), this);
                stub.setPortName(getDocOnlineServicioWebHttpSoap11EndpointWSDDServiceName());
                return stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    @SuppressWarnings("rawtypes")
	public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("DocOnlineServicioWebHttpSoap11Endpoint".equals(inputPortName)) {
            return getDocOnlineServicioWebHttpSoap11Endpoint();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "DocOnlineServicioWeb");
    }

    @SuppressWarnings("rawtypes")
	private java.util.HashSet ports = null;

    @SuppressWarnings({ "unchecked", "rawtypes" })
	public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "DocOnlineServicioWebHttpSoap11Endpoint"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DocOnlineServicioWebHttpSoap11Endpoint".equals(portName)) {
            setDocOnlineServicioWebHttpSoap11EndpointEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
