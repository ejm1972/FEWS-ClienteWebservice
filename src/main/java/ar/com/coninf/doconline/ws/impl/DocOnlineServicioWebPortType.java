/**
 * DocOnlineServicioWebPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ar.com.coninf.doconline.ws.impl;

public interface DocOnlineServicioWebPortType extends java.rmi.Remote {
    public ar.com.coninf.doconline.rest.model.response.xsd.Response cerrarSesion(java.lang.Integer interfaz, java.lang.String idSesion) throws java.rmi.RemoteException;
    public ar.com.coninf.doconline.rest.model.response.xsd.Response scheduleTimerSql(java.lang.String mensaje) throws java.rmi.RemoteException;
    public ar.com.coninf.doconline.rest.model.response.xsd.Response scheduleTimerFews(java.lang.String mensaje) throws java.rmi.RemoteException;
    public ar.com.coninf.doconline.rest.model.response.xsd.ResponseActualizarItemComprobante actualizarItemComprobante(ar.com.coninf.doconline.rest.model.request.xsd.RequestAutorizarComprobante request, ar.com.coninf.doconline.rest.model.request.xsd.RequestItemComprobante requestItemComprobante) throws java.rmi.RemoteException;
    public ar.com.coninf.doconline.rest.model.response.xsd.ResponseConsultarUltimoComprobante consultarUltimoComprobante(ar.com.coninf.doconline.rest.model.tx.xsd.ControlTransaccion ctx, java.lang.Integer tipoCbte, java.lang.Integer ptoVta) throws java.rmi.RemoteException;
    public ar.com.coninf.doconline.rest.model.response.xsd.ResponseConsultarPadronLocal consultarPadronLocal(ar.com.coninf.doconline.rest.model.request.xsd.RequestConsultarPadronLocal request) throws java.rmi.RemoteException;
    public ar.com.coninf.doconline.rest.model.response.xsd.ResponseAutenticacion iniciarSesion(java.lang.Integer interfaz, java.lang.String clave) throws java.rmi.RemoteException;
    public ar.com.coninf.doconline.rest.model.response.xsd.ResponseAutorizarComprobante autorizarComprobante(ar.com.coninf.doconline.rest.model.tx.xsd.ControlTransaccion ctx, java.lang.Integer concepto, java.lang.Integer tipoDoc, java.lang.Long nroDoc, java.lang.Integer tipoCbte, java.lang.Integer ptoVta, java.lang.Long nroCbte, java.math.BigDecimal impTotal, java.math.BigDecimal impTotConcNoGrav, java.math.BigDecimal impNeto, java.math.BigDecimal impIva, java.math.BigDecimal impTrib, java.math.BigDecimal impOpEx, java.lang.String fechaCbte, java.lang.String fechaVencPago, java.lang.String fechaServDesde, java.lang.String fechaServHasta, java.lang.String monedaId, java.math.BigDecimal monedaCtz, ar.com.coninf.doconline.rest.model.tx.xsd.Tributo[] tributos, ar.com.coninf.doconline.rest.model.tx.xsd.Iva[] ivas, ar.com.coninf.doconline.rest.model.tx.xsd.ComprobanteAsociado[] args21, ar.com.coninf.doconline.rest.model.tx.xsd.DatoOpcional[] args22) throws java.rmi.RemoteException;
    public ar.com.coninf.doconline.rest.model.response.xsd.ResponseConsultarComprobante consultarComprobante(ar.com.coninf.doconline.rest.model.tx.xsd.ControlTransaccion ctx, java.lang.Integer tipoCbte, java.lang.Integer ptoVta, java.lang.Integer cbte) throws java.rmi.RemoteException;
    public ar.com.coninf.doconline.rest.model.response.xsd.ResponseConsultarPadronOnline consultarPadronOnline(ar.com.coninf.doconline.rest.model.request.xsd.RequestConsultarPadronOnline request) throws java.rmi.RemoteException;
    public ar.com.coninf.doconline.rest.model.response.xsd.ResponseAutorizarComprobante autorizarComprobanteNuevo(ar.com.coninf.doconline.rest.model.request.xsd.RequestAutorizarComprobante request) throws java.rmi.RemoteException;
}
