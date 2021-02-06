/**
 * DocOnlineServicioWebPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ar.com.coninf.doconline.ws.impl;

import java.math.BigDecimal;
import java.rmi.Remote;
import java.rmi.RemoteException;

import ar.com.coninf.doconline.rest.model.request.xsd.RequestAutorizarComprobante;
import ar.com.coninf.doconline.rest.model.request.xsd.RequestConsultarPadronLocal;
import ar.com.coninf.doconline.rest.model.request.xsd.RequestConsultarPadronOnline;
import ar.com.coninf.doconline.rest.model.request.xsd.RequestItemComprobante;
import ar.com.coninf.doconline.rest.model.response.xsd.Response;
import ar.com.coninf.doconline.rest.model.response.xsd.ResponseActualizarItemComprobante;
import ar.com.coninf.doconline.rest.model.response.xsd.ResponseAutenticacion;
import ar.com.coninf.doconline.rest.model.response.xsd.ResponseAutorizarComprobante;
import ar.com.coninf.doconline.rest.model.response.xsd.ResponseConsultarComprobante;
import ar.com.coninf.doconline.rest.model.response.xsd.ResponseConsultarPadronLocal;
import ar.com.coninf.doconline.rest.model.response.xsd.ResponseConsultarPadronOnline;
import ar.com.coninf.doconline.rest.model.response.xsd.ResponseConsultarUltimoComprobante;
import ar.com.coninf.doconline.rest.model.response.xsd.ResponseGenerarQr;
import ar.com.coninf.doconline.rest.model.tx.xsd.ComprobanteAsociado;
import ar.com.coninf.doconline.rest.model.tx.xsd.ControlTransaccion;
import ar.com.coninf.doconline.rest.model.tx.xsd.DatoOpcional;
import ar.com.coninf.doconline.rest.model.tx.xsd.DatoQr;
import ar.com.coninf.doconline.rest.model.tx.xsd.Iva;
import ar.com.coninf.doconline.rest.model.tx.xsd.Tributo;

public interface DocOnlineServicioWebPortType extends Remote {
    public Response 							cerrarSesion(Integer interfaz, String idSesion) throws RemoteException;
    public Response 							scheduleTimerSql(String mensaje) throws RemoteException;
    public Response 							scheduleTimerFews(String mensaje) throws RemoteException;
    public ResponseActualizarItemComprobante 	actualizarItemComprobante(RequestAutorizarComprobante request, RequestItemComprobante requestItemComprobante) throws RemoteException;
    public ResponseConsultarUltimoComprobante 	consultarUltimoComprobante(ControlTransaccion ctx, Integer tipoCbte, Integer ptoVta) throws RemoteException;
    public ResponseConsultarPadronLocal 		consultarPadronLocal(RequestConsultarPadronLocal request) throws RemoteException;
    public ResponseAutenticacion 				iniciarSesion(Integer interfaz, String clave) throws RemoteException;
    public ResponseAutorizarComprobante 		autorizarComprobante(ControlTransaccion ctx, Integer concepto, Integer tipoDoc, Long nroDoc, Integer tipoCbte, Integer ptoVta, Long nroCbte, BigDecimal impTotal, BigDecimal impTotConcNoGrav, BigDecimal impNeto, BigDecimal impIva, BigDecimal impTrib, BigDecimal impOpEx, String fechaCbte, String fechaVencPago, String fechaServDesde, String fechaServHasta, String monedaId, BigDecimal monedaCtz, Tributo[] tributos, Iva[] ivas, ComprobanteAsociado[] comprobanteAsociados, DatoOpcional[] datoOpcionales) throws RemoteException;
    public ResponseConsultarComprobante 		consultarComprobante(ControlTransaccion ctx, Integer tipoCbte, Integer ptoVta, Integer cbte) throws RemoteException;
    public ResponseConsultarPadronOnline 		consultarPadronOnline(RequestConsultarPadronOnline request) throws RemoteException;
    public ResponseAutorizarComprobante 		autorizarComprobanteNuevo(RequestAutorizarComprobante request) throws RemoteException;
    public ResponseGenerarQr 					generarQr(ControlTransaccion ctx, DatoQr datoQr) throws RemoteException;
}
