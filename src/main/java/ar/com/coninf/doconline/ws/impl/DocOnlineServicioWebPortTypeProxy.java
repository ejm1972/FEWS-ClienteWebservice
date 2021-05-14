package ar.com.coninf.doconline.ws.impl;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import ar.com.coninf.doconline.rest.model.request.xsd.RequestAutorizarComprobante;
import ar.com.coninf.doconline.rest.model.response.xsd.Response;
import ar.com.coninf.doconline.rest.model.response.xsd.ResponseGenerarQr;
import ar.com.coninf.doconline.rest.model.tx.xsd.ControlTransaccion;
import ar.com.coninf.doconline.rest.model.tx.xsd.DatoQr;

public class DocOnlineServicioWebPortTypeProxy implements DocOnlineServicioWebPortType {
	private String _endpoint = null;
	private DocOnlineServicioWebPortType docOnlineServicioWebPortType = null;

	public DocOnlineServicioWebPortTypeProxy() {
		_initDocOnlineServicioWebPortTypeProxy();
	}

	public DocOnlineServicioWebPortTypeProxy(String endpoint) {
		_endpoint = endpoint;
		_initDocOnlineServicioWebPortTypeProxy();
	}

	private void _initDocOnlineServicioWebPortTypeProxy() {
		try {
			docOnlineServicioWebPortType = (new DocOnlineServicioWebLocator()).getDocOnlineServicioWebHttpSoap11Endpoint();
			if (docOnlineServicioWebPortType != null) {
				if (_endpoint != null)
					((javax.xml.rpc.Stub)docOnlineServicioWebPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
				else
					_endpoint = (String)((javax.xml.rpc.Stub)docOnlineServicioWebPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
			}

		}
		catch (ServiceException serviceException) {}
	}

	public String getEndpoint() {
		return _endpoint;
	}

	public void setEndpoint(String endpoint) {
		_endpoint = endpoint;
		if (docOnlineServicioWebPortType != null)
			((javax.xml.rpc.Stub)docOnlineServicioWebPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);

	}

	public DocOnlineServicioWebPortType getDocOnlineServicioWebPortType() {
		if (docOnlineServicioWebPortType == null)
			_initDocOnlineServicioWebPortTypeProxy();
		return docOnlineServicioWebPortType;
	}

	public Response cerrarSesion(java.lang.Integer interfaz, java.lang.String idSesion) throws RemoteException{
		if (docOnlineServicioWebPortType == null)
			_initDocOnlineServicioWebPortTypeProxy();
		return docOnlineServicioWebPortType.cerrarSesion(interfaz, idSesion);
	}
	
	public ar.com.coninf.doconline.rest.model.response.xsd.ResponseConsultarUltimoComprobante consultarUltimoComprobante(ar.com.coninf.doconline.rest.model.tx.xsd.ControlTransaccion ctx, java.lang.Integer tipoCbte, java.lang.Integer ptoVta) throws java.rmi.RemoteException{
		if (docOnlineServicioWebPortType == null)
			_initDocOnlineServicioWebPortTypeProxy();
		return docOnlineServicioWebPortType.consultarUltimoComprobante(ctx, tipoCbte, ptoVta);
	}

	public ar.com.coninf.doconline.rest.model.response.xsd.ResponseConsultarPadronLocal consultarPadronLocal(ar.com.coninf.doconline.rest.model.request.xsd.RequestConsultarPadronLocal request) throws java.rmi.RemoteException{
		if (docOnlineServicioWebPortType == null)
			_initDocOnlineServicioWebPortTypeProxy();
		return docOnlineServicioWebPortType.consultarPadronLocal(request);
	}

	public ar.com.coninf.doconline.rest.model.response.xsd.ResponseAutenticacion iniciarSesion(java.lang.Integer interfaz, java.lang.String clave) throws java.rmi.RemoteException{
		if (docOnlineServicioWebPortType == null)
			_initDocOnlineServicioWebPortTypeProxy();
		return docOnlineServicioWebPortType.iniciarSesion(interfaz, clave);
	}

	public ar.com.coninf.doconline.rest.model.response.xsd.ResponseAutorizarComprobante autorizarComprobante(ar.com.coninf.doconline.rest.model.tx.xsd.ControlTransaccion ctx, java.lang.Integer concepto, java.lang.Integer tipoDoc, java.lang.Long nroDoc, java.lang.Integer tipoCbte, java.lang.Integer ptoVta, java.lang.Long nroCbte, java.math.BigDecimal impTotal, java.math.BigDecimal impTotConcNoGrav, java.math.BigDecimal impNeto, java.math.BigDecimal impIva, java.math.BigDecimal impTrib, java.math.BigDecimal impOpEx, java.lang.String fechaCbte, java.lang.String fechaVencPago, java.lang.String fechaServDesde, java.lang.String fechaServHasta, java.lang.String monedaId, java.math.BigDecimal monedaCtz, ar.com.coninf.doconline.rest.model.tx.xsd.Tributo[] tributos, ar.com.coninf.doconline.rest.model.tx.xsd.Iva[] ivas, ar.com.coninf.doconline.rest.model.tx.xsd.ComprobanteAsociado[] args21, ar.com.coninf.doconline.rest.model.tx.xsd.DatoOpcional[] args22) throws java.rmi.RemoteException{
		if (docOnlineServicioWebPortType == null)
			_initDocOnlineServicioWebPortTypeProxy();
		return docOnlineServicioWebPortType.autorizarComprobante(ctx, concepto, tipoDoc, nroDoc, tipoCbte, ptoVta, nroCbte, impTotal, impTotConcNoGrav, impNeto, impIva, impTrib, impOpEx, fechaCbte, fechaVencPago, fechaServDesde, fechaServHasta, monedaId, monedaCtz, tributos, ivas, args21, args22);
	}

	public ar.com.coninf.doconline.rest.model.response.xsd.ResponseConsultarComprobante consultarComprobante(ar.com.coninf.doconline.rest.model.tx.xsd.ControlTransaccion ctx, java.lang.Integer tipoCbte, java.lang.Integer ptoVta, java.lang.Integer cbte) throws java.rmi.RemoteException{
		if (docOnlineServicioWebPortType == null)
			_initDocOnlineServicioWebPortTypeProxy();
		return docOnlineServicioWebPortType.consultarComprobante(ctx, tipoCbte, ptoVta, cbte);
	}

	public ar.com.coninf.doconline.rest.model.response.xsd.ResponseConsultarPadronOnline consultarPadronOnline(ar.com.coninf.doconline.rest.model.request.xsd.RequestConsultarPadronOnline request) throws java.rmi.RemoteException{
		if (docOnlineServicioWebPortType == null)
			_initDocOnlineServicioWebPortTypeProxy();
		return docOnlineServicioWebPortType.consultarPadronOnline(request);
	}

	public ar.com.coninf.doconline.rest.model.response.xsd.ResponseAutorizarComprobante autorizarComprobanteNuevo(RequestAutorizarComprobante request) throws java.rmi.RemoteException{
		if (docOnlineServicioWebPortType == null)
			_initDocOnlineServicioWebPortTypeProxy();
		return docOnlineServicioWebPortType.autorizarComprobanteNuevo(request);
	}

	@Override
	public ResponseGenerarQr generarQr(ControlTransaccion ctx, DatoQr datoQr) throws RemoteException {
		if (docOnlineServicioWebPortType == null)
			_initDocOnlineServicioWebPortTypeProxy();
		return docOnlineServicioWebPortType.generarQr(ctx, datoQr);
	}

}
