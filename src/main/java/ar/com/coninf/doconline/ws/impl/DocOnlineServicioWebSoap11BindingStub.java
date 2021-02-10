/**
 * DocOnlineServicioWebSoap11BindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ar.com.coninf.doconline.ws.impl;

import java.rmi.RemoteException;

import ar.com.coninf.doconline.rest.model.response.xsd.ResponseGenerarQr;
import ar.com.coninf.doconline.rest.model.tx.xsd.ControlTransaccion;
import ar.com.coninf.doconline.rest.model.tx.xsd.DatoQr;

@SuppressWarnings("rawtypes")
public class DocOnlineServicioWebSoap11BindingStub extends org.apache.axis.client.Stub implements ar.com.coninf.doconline.ws.impl.DocOnlineServicioWebPortType {

	private java.util.Vector cachedSerClasses = new java.util.Vector();
	private java.util.Vector cachedSerQNames = new java.util.Vector();
	private java.util.Vector cachedSerFactories = new java.util.Vector();
	private java.util.Vector cachedDeserFactories = new java.util.Vector();

	static org.apache.axis.description.OperationDesc [] _operations;

	static {
		_operations = new org.apache.axis.description.OperationDesc[10];
		_initOperationDesc1();
	}

	private static void _initOperationDesc1(){
		org.apache.axis.description.OperationDesc oper;
		org.apache.axis.description.ParameterDesc param;
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("cerrarSesion");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "interfaz"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "idSesion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		param.setNillable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://response.model.rest.doconline.coninf.com.ar/xsd", "Response"));
		oper.setReturnClass(ar.com.coninf.doconline.rest.model.response.xsd.Response.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "return"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[0] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("actualizarItemComprobante");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://request.model.rest.doconline.coninf.com.ar/xsd", "RequestAutorizarComprobante"), ar.com.coninf.doconline.rest.model.request.xsd.RequestAutorizarComprobante.class, false, false);
		param.setOmittable(true);
		param.setNillable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "requestItemComprobante"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://request.model.rest.doconline.coninf.com.ar/xsd", "RequestItemComprobante"), ar.com.coninf.doconline.rest.model.request.xsd.RequestItemComprobante.class, false, false);
		param.setOmittable(true);
		param.setNillable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://response.model.rest.doconline.coninf.com.ar/xsd", "ResponseActualizarItemComprobante"));
		oper.setReturnClass(ar.com.coninf.doconline.rest.model.response.xsd.ResponseActualizarItemComprobante.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "return"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[1] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("consultarUltimoComprobante");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "ctx"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tx.model.rest.doconline.coninf.com.ar/xsd", "ControlTransaccion"), ar.com.coninf.doconline.rest.model.tx.xsd.ControlTransaccion.class, false, false);
		param.setOmittable(true);
		param.setNillable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "tipoCbte"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "ptoVta"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://response.model.rest.doconline.coninf.com.ar/xsd", "ResponseConsultarUltimoComprobante"));
		oper.setReturnClass(ar.com.coninf.doconline.rest.model.response.xsd.ResponseConsultarUltimoComprobante.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "return"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[2] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("consultarPadronLocal");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://request.model.rest.doconline.coninf.com.ar/xsd", "RequestConsultarPadronLocal"), ar.com.coninf.doconline.rest.model.request.xsd.RequestConsultarPadronLocal.class, false, false);
		param.setOmittable(true);
		param.setNillable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://response.model.rest.doconline.coninf.com.ar/xsd", "ResponseConsultarPadronLocal"));
		oper.setReturnClass(ar.com.coninf.doconline.rest.model.response.xsd.ResponseConsultarPadronLocal.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "return"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[3] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("iniciarSesion");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "interfaz"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "clave"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		param.setNillable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://response.model.rest.doconline.coninf.com.ar/xsd", "ResponseAutenticacion"));
		oper.setReturnClass(ar.com.coninf.doconline.rest.model.response.xsd.ResponseAutenticacion.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "return"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[4] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("autorizarComprobante");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "ctx"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tx.model.rest.doconline.coninf.com.ar/xsd", "ControlTransaccion"), ar.com.coninf.doconline.rest.model.tx.xsd.ControlTransaccion.class, false, false);
		param.setOmittable(true);
		param.setNillable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "concepto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "tipoDoc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "nroDoc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "tipoCbte"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "ptoVta"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "nroCbte"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "impTotal"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"), java.math.BigDecimal.class, false, false);
		param.setOmittable(true);
		param.setNillable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "impTotConcNoGrav"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"), java.math.BigDecimal.class, false, false);
		param.setOmittable(true);
		param.setNillable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "impNeto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"), java.math.BigDecimal.class, false, false);
		param.setOmittable(true);
		param.setNillable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "impIva"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"), java.math.BigDecimal.class, false, false);
		param.setOmittable(true);
		param.setNillable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "impTrib"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"), java.math.BigDecimal.class, false, false);
		param.setOmittable(true);
		param.setNillable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "impOpEx"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"), java.math.BigDecimal.class, false, false);
		param.setOmittable(true);
		param.setNillable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "fechaCbte"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		param.setNillable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "fechaVencPago"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		param.setNillable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "fechaServDesde"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		param.setNillable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "fechaServHasta"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		param.setNillable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "monedaId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		param.setNillable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "monedaCtz"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"), java.math.BigDecimal.class, false, false);
		param.setOmittable(true);
		param.setNillable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "tributos"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tx.model.rest.doconline.coninf.com.ar/xsd", "Tributo"), ar.com.coninf.doconline.rest.model.tx.xsd.Tributo[].class, false, false);
		param.setOmittable(true);
		param.setNillable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "ivas"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tx.model.rest.doconline.coninf.com.ar/xsd", "Iva"), ar.com.coninf.doconline.rest.model.tx.xsd.Iva[].class, false, false);
		param.setOmittable(true);
		param.setNillable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "args21"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tx.model.rest.doconline.coninf.com.ar/xsd", "ComprobanteAsociado"), ar.com.coninf.doconline.rest.model.tx.xsd.ComprobanteAsociado[].class, false, false);
		param.setOmittable(true);
		param.setNillable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "args22"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tx.model.rest.doconline.coninf.com.ar/xsd", "DatoOpcional"), ar.com.coninf.doconline.rest.model.tx.xsd.DatoOpcional[].class, false, false);
		param.setOmittable(true);
		param.setNillable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://response.model.rest.doconline.coninf.com.ar/xsd", "ResponseAutorizarComprobante"));
		oper.setReturnClass(ar.com.coninf.doconline.rest.model.response.xsd.ResponseAutorizarComprobante.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "return"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[5] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("consultarComprobante");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "ctx"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tx.model.rest.doconline.coninf.com.ar/xsd", "ControlTransaccion"), ar.com.coninf.doconline.rest.model.tx.xsd.ControlTransaccion.class, false, false);
		param.setOmittable(true);
		param.setNillable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "tipoCbte"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "ptoVta"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "cbte"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://response.model.rest.doconline.coninf.com.ar/xsd", "ResponseConsultarComprobante"));
		oper.setReturnClass(ar.com.coninf.doconline.rest.model.response.xsd.ResponseConsultarComprobante.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "return"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[6] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("consultarPadronOnline");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://request.model.rest.doconline.coninf.com.ar/xsd", "RequestConsultarPadronOnline"), ar.com.coninf.doconline.rest.model.request.xsd.RequestConsultarPadronOnline.class, false, false);
		param.setOmittable(true);
		param.setNillable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://response.model.rest.doconline.coninf.com.ar/xsd", "ResponseConsultarPadronOnline"));
		oper.setReturnClass(ar.com.coninf.doconline.rest.model.response.xsd.ResponseConsultarPadronOnline.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "return"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[7] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("autorizarComprobanteNuevo");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://request.model.rest.doconline.coninf.com.ar/xsd", "RequestAutorizarComprobante"), ar.com.coninf.doconline.rest.model.request.xsd.RequestAutorizarComprobante.class, false, false);
		param.setOmittable(true);
		param.setNillable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://response.model.rest.doconline.coninf.com.ar/xsd", "ResponseAutorizarComprobante"));
		oper.setReturnClass(ar.com.coninf.doconline.rest.model.response.xsd.ResponseAutorizarComprobante.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "return"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[8] = oper;
		
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("generarQr");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "ctx"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tx.model.rest.doconline.coninf.com.ar/xsd", "ControlTransaccion"), ar.com.coninf.doconline.rest.model.tx.xsd.ControlTransaccion.class, false, false);
		param.setOmittable(true);
		param.setNillable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "datoQr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tx.model.rest.doconline.coninf.com.ar/xsd", "DatoQr"), ar.com.coninf.doconline.rest.model.tx.xsd.DatoQr.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://response.model.rest.doconline.coninf.com.ar/xsd", "ResponseGenerarQr"));
		oper.setReturnClass(ar.com.coninf.doconline.rest.model.response.xsd.ResponseGenerarQr.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "return"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[9] = oper;
		
	}

	public DocOnlineServicioWebSoap11BindingStub() throws org.apache.axis.AxisFault {
		this(null);
	}

	public DocOnlineServicioWebSoap11BindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
		this(service);
		super.cachedEndpoint = endpointURL;
	}

	@SuppressWarnings({ "unchecked", "unused" })
	public DocOnlineServicioWebSoap11BindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
		if (service == null) {
			super.service = new org.apache.axis.client.Service();
		} else {
			super.service = service;
		}
		((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
		java.lang.Class cls;
		javax.xml.namespace.QName qName;
		javax.xml.namespace.QName qName2;
		java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
		java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
		java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
		java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
		java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
		java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
		java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
		java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
		java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
		java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
		qName = new javax.xml.namespace.QName("http://request.model.rest.doconline.coninf.com.ar/xsd", "Request");
		cachedSerQNames.add(qName);
		cls = ar.com.coninf.doconline.rest.model.request.xsd.Request.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://request.model.rest.doconline.coninf.com.ar/xsd", "RequestAutorizarComprobante");
		cachedSerQNames.add(qName);
		cls = ar.com.coninf.doconline.rest.model.request.xsd.RequestAutorizarComprobante.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://request.model.rest.doconline.coninf.com.ar/xsd", "RequestConsultarPadronLocal");
		cachedSerQNames.add(qName);
		cls = ar.com.coninf.doconline.rest.model.request.xsd.RequestConsultarPadronLocal.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://request.model.rest.doconline.coninf.com.ar/xsd", "RequestConsultarPadronOnline");
		cachedSerQNames.add(qName);
		cls = ar.com.coninf.doconline.rest.model.request.xsd.RequestConsultarPadronOnline.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://request.model.rest.doconline.coninf.com.ar/xsd", "RequestItemComprobante");
		cachedSerQNames.add(qName);
		cls = ar.com.coninf.doconline.rest.model.request.xsd.RequestItemComprobante.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://response.model.rest.doconline.coninf.com.ar/xsd", "Response");
		cachedSerQNames.add(qName);
		cls = ar.com.coninf.doconline.rest.model.response.xsd.Response.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://response.model.rest.doconline.coninf.com.ar/xsd", "ResponseActualizarItemComprobante");
		cachedSerQNames.add(qName);
		cls = ar.com.coninf.doconline.rest.model.response.xsd.ResponseActualizarItemComprobante.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://response.model.rest.doconline.coninf.com.ar/xsd", "ResponseAutenticacion");
		cachedSerQNames.add(qName);
		cls = ar.com.coninf.doconline.rest.model.response.xsd.ResponseAutenticacion.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://response.model.rest.doconline.coninf.com.ar/xsd", "ResponseAutorizarComprobante");
		cachedSerQNames.add(qName);
		cls = ar.com.coninf.doconline.rest.model.response.xsd.ResponseAutorizarComprobante.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://response.model.rest.doconline.coninf.com.ar/xsd", "ResponseConsultarComprobante");
		cachedSerQNames.add(qName);
		cls = ar.com.coninf.doconline.rest.model.response.xsd.ResponseConsultarComprobante.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://response.model.rest.doconline.coninf.com.ar/xsd", "ResponseConsultarPadronLocal");
		cachedSerQNames.add(qName);
		cls = ar.com.coninf.doconline.rest.model.response.xsd.ResponseConsultarPadronLocal.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://response.model.rest.doconline.coninf.com.ar/xsd", "ResponseConsultarPadronOnline");
		cachedSerQNames.add(qName);
		cls = ar.com.coninf.doconline.rest.model.response.xsd.ResponseConsultarPadronOnline.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://response.model.rest.doconline.coninf.com.ar/xsd", "ResponseConsultarUltimoComprobante");
		cachedSerQNames.add(qName);
		cls = ar.com.coninf.doconline.rest.model.response.xsd.ResponseConsultarUltimoComprobante.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://tx.model.rest.doconline.coninf.com.ar/xsd", "ComprobanteAsociado");
		cachedSerQNames.add(qName);
		cls = ar.com.coninf.doconline.rest.model.tx.xsd.ComprobanteAsociado.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://tx.model.rest.doconline.coninf.com.ar/xsd", "ControlTransaccion");
		cachedSerQNames.add(qName);
		cls = ar.com.coninf.doconline.rest.model.tx.xsd.ControlTransaccion.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://tx.model.rest.doconline.coninf.com.ar/xsd", "DatoOpcional");
		cachedSerQNames.add(qName);
		cls = ar.com.coninf.doconline.rest.model.tx.xsd.DatoOpcional.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://tx.model.rest.doconline.coninf.com.ar/xsd", "Iva");
		cachedSerQNames.add(qName);
		cls = ar.com.coninf.doconline.rest.model.tx.xsd.Iva.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://tx.model.rest.doconline.coninf.com.ar/xsd", "TipoIva");
		cachedSerQNames.add(qName);
		cls = ar.com.coninf.doconline.rest.model.tx.xsd.TipoIva.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://tx.model.rest.doconline.coninf.com.ar/xsd", "Tributo");
		cachedSerQNames.add(qName);
		cls = ar.com.coninf.doconline.rest.model.tx.xsd.Tributo.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://tx.model.rest.doconline.coninf.com.ar/xsd", "DatoQr");
		cachedSerQNames.add(qName);
		cls = ar.com.coninf.doconline.rest.model.tx.xsd.DatoQr.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://request.model.rest.doconline.coninf.com.ar/xsd", "RequestGenerarQr");
		cachedSerQNames.add(qName);
		cls = ar.com.coninf.doconline.rest.model.request.xsd.RequestGenerarQr.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://response.model.rest.doconline.coninf.com.ar/xsd", "ResponseGenerarQr");
		cachedSerQNames.add(qName);
		cls = ar.com.coninf.doconline.rest.model.response.xsd.ResponseGenerarQr.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
	}

	protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
		try {
			org.apache.axis.client.Call _call = super._createCall();
			if (super.maintainSessionSet) {
				_call.setMaintainSession(super.maintainSession);
			}
			if (super.cachedUsername != null) {
				_call.setUsername(super.cachedUsername);
			}
			if (super.cachedPassword != null) {
				_call.setPassword(super.cachedPassword);
			}
			if (super.cachedEndpoint != null) {
				_call.setTargetEndpointAddress(super.cachedEndpoint);
			}
			if (super.cachedTimeout != null) {
				_call.setTimeout(super.cachedTimeout);
			}
			if (super.cachedPortName != null) {
				_call.setPortName(super.cachedPortName);
			}
			java.util.Enumeration keys = super.cachedProperties.keys();
			while (keys.hasMoreElements()) {
				java.lang.String key = (java.lang.String) keys.nextElement();
				_call.setProperty(key, super.cachedProperties.get(key));
			}
			// All the type mapping information is registered
			// when the first call is made.
			// The type mapping information is actually registered in
			// the TypeMappingRegistry of the service, which
			// is the reason why registration is only needed for the first call.
			synchronized (this) {
				if (firstCall()) {
					// must set encoding style before registering serializers
					_call.setEncodingStyle(null);
					for (int i = 0; i < cachedSerFactories.size(); ++i) {
						java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
						javax.xml.namespace.QName qName =
								(javax.xml.namespace.QName) cachedSerQNames.get(i);
						java.lang.Object x = cachedSerFactories.get(i);
						if (x instanceof Class) {
							java.lang.Class sf = (java.lang.Class)
									cachedSerFactories.get(i);
							java.lang.Class df = (java.lang.Class)
									cachedDeserFactories.get(i);
							_call.registerTypeMapping(cls, qName, sf, df, false);
						}
						else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
							org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
									cachedSerFactories.get(i);
							org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
									cachedDeserFactories.get(i);
							_call.registerTypeMapping(cls, qName, sf, df, false);
						}
					}
				}
			}
			return _call;
		}
		catch (java.lang.Throwable _t) {
			throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
		}
	}

	public ar.com.coninf.doconline.rest.model.response.xsd.Response cerrarSesion(java.lang.Integer interfaz, java.lang.String idSesion) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[0]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("urn:cerrarSesion");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "cerrarSesion"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {interfaz, idSesion});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (ar.com.coninf.doconline.rest.model.response.xsd.Response) _resp;
			} catch (java.lang.Exception _exception) {
				return (ar.com.coninf.doconline.rest.model.response.xsd.Response) org.apache.axis.utils.JavaUtils.convert(_resp, ar.com.coninf.doconline.rest.model.response.xsd.Response.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}
	
	public ar.com.coninf.doconline.rest.model.response.xsd.ResponseActualizarItemComprobante actualizarItemComprobante(ar.com.coninf.doconline.rest.model.request.xsd.RequestAutorizarComprobante request, ar.com.coninf.doconline.rest.model.request.xsd.RequestItemComprobante requestItemComprobante) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[1]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("urn:actualizarItemComprobante");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "actualizarItemComprobante"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request, requestItemComprobante});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (ar.com.coninf.doconline.rest.model.response.xsd.ResponseActualizarItemComprobante) _resp;
			} catch (java.lang.Exception _exception) {
				return (ar.com.coninf.doconline.rest.model.response.xsd.ResponseActualizarItemComprobante) org.apache.axis.utils.JavaUtils.convert(_resp, ar.com.coninf.doconline.rest.model.response.xsd.ResponseActualizarItemComprobante.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public ar.com.coninf.doconline.rest.model.response.xsd.ResponseConsultarUltimoComprobante consultarUltimoComprobante(ar.com.coninf.doconline.rest.model.tx.xsd.ControlTransaccion ctx, java.lang.Integer tipoCbte, java.lang.Integer ptoVta) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[2]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("urn:consultarUltimoComprobante");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "consultarUltimoComprobante"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ctx, tipoCbte, ptoVta});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (ar.com.coninf.doconline.rest.model.response.xsd.ResponseConsultarUltimoComprobante) _resp;
			} catch (java.lang.Exception _exception) {
				return (ar.com.coninf.doconline.rest.model.response.xsd.ResponseConsultarUltimoComprobante) org.apache.axis.utils.JavaUtils.convert(_resp, ar.com.coninf.doconline.rest.model.response.xsd.ResponseConsultarUltimoComprobante.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public ar.com.coninf.doconline.rest.model.response.xsd.ResponseConsultarPadronLocal consultarPadronLocal(ar.com.coninf.doconline.rest.model.request.xsd.RequestConsultarPadronLocal request) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[3]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("urn:consultarPadronLocal");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "consultarPadronLocal"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (ar.com.coninf.doconline.rest.model.response.xsd.ResponseConsultarPadronLocal) _resp;
			} catch (java.lang.Exception _exception) {
				return (ar.com.coninf.doconline.rest.model.response.xsd.ResponseConsultarPadronLocal) org.apache.axis.utils.JavaUtils.convert(_resp, ar.com.coninf.doconline.rest.model.response.xsd.ResponseConsultarPadronLocal.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public ar.com.coninf.doconline.rest.model.response.xsd.ResponseAutenticacion iniciarSesion(java.lang.Integer interfaz, java.lang.String clave) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[4]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("urn:iniciarSesion");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "iniciarSesion"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {interfaz, clave});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (ar.com.coninf.doconline.rest.model.response.xsd.ResponseAutenticacion) _resp;
			} catch (java.lang.Exception _exception) {
				return (ar.com.coninf.doconline.rest.model.response.xsd.ResponseAutenticacion) org.apache.axis.utils.JavaUtils.convert(_resp, ar.com.coninf.doconline.rest.model.response.xsd.ResponseAutenticacion.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public ar.com.coninf.doconline.rest.model.response.xsd.ResponseAutorizarComprobante autorizarComprobante(ar.com.coninf.doconline.rest.model.tx.xsd.ControlTransaccion ctx, java.lang.Integer concepto, java.lang.Integer tipoDoc, java.lang.Long nroDoc, java.lang.Integer tipoCbte, java.lang.Integer ptoVta, java.lang.Long nroCbte, java.math.BigDecimal impTotal, java.math.BigDecimal impTotConcNoGrav, java.math.BigDecimal impNeto, java.math.BigDecimal impIva, java.math.BigDecimal impTrib, java.math.BigDecimal impOpEx, java.lang.String fechaCbte, java.lang.String fechaVencPago, java.lang.String fechaServDesde, java.lang.String fechaServHasta, java.lang.String monedaId, java.math.BigDecimal monedaCtz, ar.com.coninf.doconline.rest.model.tx.xsd.Tributo[] tributos, ar.com.coninf.doconline.rest.model.tx.xsd.Iva[] ivas, ar.com.coninf.doconline.rest.model.tx.xsd.ComprobanteAsociado[] args21, ar.com.coninf.doconline.rest.model.tx.xsd.DatoOpcional[] args22) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[5]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("urn:autorizarComprobante");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "autorizarComprobante"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ctx, concepto, tipoDoc, nroDoc, tipoCbte, ptoVta, nroCbte, impTotal, impTotConcNoGrav, impNeto, impIva, impTrib, impOpEx, fechaCbte, fechaVencPago, fechaServDesde, fechaServHasta, monedaId, monedaCtz, tributos, ivas, args21, args22});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (ar.com.coninf.doconline.rest.model.response.xsd.ResponseAutorizarComprobante) _resp;
			} catch (java.lang.Exception _exception) {
				return (ar.com.coninf.doconline.rest.model.response.xsd.ResponseAutorizarComprobante) org.apache.axis.utils.JavaUtils.convert(_resp, ar.com.coninf.doconline.rest.model.response.xsd.ResponseAutorizarComprobante.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public ar.com.coninf.doconline.rest.model.response.xsd.ResponseConsultarComprobante consultarComprobante(ar.com.coninf.doconline.rest.model.tx.xsd.ControlTransaccion ctx, java.lang.Integer tipoCbte, java.lang.Integer ptoVta, java.lang.Integer cbte) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[6]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("urn:consultarComprobante");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "consultarComprobante"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ctx, tipoCbte, ptoVta, cbte});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (ar.com.coninf.doconline.rest.model.response.xsd.ResponseConsultarComprobante) _resp;
			} catch (java.lang.Exception _exception) {
				return (ar.com.coninf.doconline.rest.model.response.xsd.ResponseConsultarComprobante) org.apache.axis.utils.JavaUtils.convert(_resp, ar.com.coninf.doconline.rest.model.response.xsd.ResponseConsultarComprobante.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public ar.com.coninf.doconline.rest.model.response.xsd.ResponseConsultarPadronOnline consultarPadronOnline(ar.com.coninf.doconline.rest.model.request.xsd.RequestConsultarPadronOnline request) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[7]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("urn:consultarPadronOnline");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "consultarPadronOnline"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (ar.com.coninf.doconline.rest.model.response.xsd.ResponseConsultarPadronOnline) _resp;
			} catch (java.lang.Exception _exception) {
				return (ar.com.coninf.doconline.rest.model.response.xsd.ResponseConsultarPadronOnline) org.apache.axis.utils.JavaUtils.convert(_resp, ar.com.coninf.doconline.rest.model.response.xsd.ResponseConsultarPadronOnline.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public ar.com.coninf.doconline.rest.model.response.xsd.ResponseAutorizarComprobante autorizarComprobanteNuevo(ar.com.coninf.doconline.rest.model.request.xsd.RequestAutorizarComprobante request) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[8]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("urn:autorizarComprobanteNuevo");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "autorizarComprobanteNuevo"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (ar.com.coninf.doconline.rest.model.response.xsd.ResponseAutorizarComprobante) _resp;
			} catch (java.lang.Exception _exception) {
				return (ar.com.coninf.doconline.rest.model.response.xsd.ResponseAutorizarComprobante) org.apache.axis.utils.JavaUtils.convert(_resp, ar.com.coninf.doconline.rest.model.response.xsd.ResponseAutorizarComprobante.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public ResponseGenerarQr generarQr(ControlTransaccion ctx, DatoQr datoQr) throws RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[9]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("urn:generarQr");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://impl.ws.doconline.coninf.com.ar", "generarQr"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ctx, datoQr});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (ar.com.coninf.doconline.rest.model.response.xsd.ResponseGenerarQr) _resp;
			} catch (java.lang.Exception _exception) {
				return (ar.com.coninf.doconline.rest.model.response.xsd.ResponseGenerarQr) org.apache.axis.utils.JavaUtils.convert(_resp, ar.com.coninf.doconline.rest.model.response.xsd.ResponseGenerarQr.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}
}
