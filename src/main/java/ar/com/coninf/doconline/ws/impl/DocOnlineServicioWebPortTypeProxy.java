package ar.com.coninf.doconline.ws.impl;

public class DocOnlineServicioWebPortTypeProxy implements ar.com.coninf.doconline.ws.impl.DocOnlineServicioWebPortType {
  private String _endpoint = null;
  private ar.com.coninf.doconline.ws.impl.DocOnlineServicioWebPortType docOnlineServicioWebPortType = null;
  
  public DocOnlineServicioWebPortTypeProxy() {
    _initDocOnlineServicioWebPortTypeProxy();
  }
  
  public DocOnlineServicioWebPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initDocOnlineServicioWebPortTypeProxy();
  }
  
  private void _initDocOnlineServicioWebPortTypeProxy() {
    try {
      docOnlineServicioWebPortType = (new ar.com.coninf.doconline.ws.impl.DocOnlineServicioWebLocator()).getDocOnlineServicioWebHttpSoap11Endpoint();
      if (docOnlineServicioWebPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)docOnlineServicioWebPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)docOnlineServicioWebPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (docOnlineServicioWebPortType != null)
      ((javax.xml.rpc.Stub)docOnlineServicioWebPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ar.com.coninf.doconline.ws.impl.DocOnlineServicioWebPortType getDocOnlineServicioWebPortType() {
    if (docOnlineServicioWebPortType == null)
      _initDocOnlineServicioWebPortTypeProxy();
    return docOnlineServicioWebPortType;
  }
  
  public ar.com.coninf.doconline.rest.model.response.xsd.Response cerrarSesion(java.lang.Integer interfaz, java.lang.String idSesion) throws java.rmi.RemoteException{
    if (docOnlineServicioWebPortType == null)
      _initDocOnlineServicioWebPortTypeProxy();
    return docOnlineServicioWebPortType.cerrarSesion(interfaz, idSesion);
  }
  
  public ar.com.coninf.doconline.rest.model.response.xsd.Response scheduleTimerSql(java.lang.String mensaje) throws java.rmi.RemoteException{
    if (docOnlineServicioWebPortType == null)
      _initDocOnlineServicioWebPortTypeProxy();
    return docOnlineServicioWebPortType.scheduleTimerSql(mensaje);
  }
  
  public ar.com.coninf.doconline.rest.model.response.xsd.Response scheduleTimerFews(java.lang.String mensaje) throws java.rmi.RemoteException{
	    if (docOnlineServicioWebPortType == null)
	      _initDocOnlineServicioWebPortTypeProxy();
	    return docOnlineServicioWebPortType.scheduleTimerFews(mensaje);
	  }

  public ar.com.coninf.doconline.rest.model.response.xsd.ResponseActualizarItemComprobante actualizarItemComprobante(ar.com.coninf.doconline.rest.model.request.xsd.RequestAutorizarComprobante request, ar.com.coninf.doconline.rest.model.request.xsd.RequestItemComprobante requestItemComprobante) throws java.rmi.RemoteException{
    if (docOnlineServicioWebPortType == null)
      _initDocOnlineServicioWebPortTypeProxy();
    return docOnlineServicioWebPortType.actualizarItemComprobante(request, requestItemComprobante);
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
  
  public ar.com.coninf.doconline.rest.model.response.xsd.ResponseAutorizarComprobante autorizarComprobanteNuevo(ar.com.coninf.doconline.rest.model.request.xsd.RequestAutorizarComprobante request) throws java.rmi.RemoteException{
    if (docOnlineServicioWebPortType == null)
      _initDocOnlineServicioWebPortTypeProxy();
    return docOnlineServicioWebPortType.autorizarComprobanteNuevo(request);
  }
  
  
}