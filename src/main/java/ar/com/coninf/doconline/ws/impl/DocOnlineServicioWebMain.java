package ar.com.coninf.doconline.ws.impl;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import org.apache.axis.AxisFault;
import org.apache.log4j.Logger;

import ar.com.coninf.doconline.rest.model.response.xsd.ResponseAutenticacion;
import ar.com.coninf.doconline.rest.model.response.xsd.ResponseConsultarUltimoComprobante;
import ar.com.coninf.doconline.rest.model.tx.xsd.ControlTransaccion;

public class DocOnlineServicioWebMain {

	private static Logger logger = Logger.getLogger(DocOnlineServicioWebMain.class);

	public static void main(String[] args) {
		
		try {
			DocOnlineServicioWeb w = new DocOnlineServicioWebLocator();
			DocOnlineServicioWebPortType ws = new DocOnlineServicioWebSoap11BindingStub(new URL(w.getDocOnlineServicioWebHttpSoap11EndpointAddress()),w);
			
			Integer interfaz = 9901;
			String clave = "1234";
			ResponseAutenticacion respA = ws.iniciarSesion(interfaz, clave);
			
			logger.debug("Codigo:"+respA.getCodigo());
			logger.debug("Descripcion:"+respA.getDescripcion());
			logger.debug("Observacion:"+respA.getObservacion());
			logger.debug("EsReintento:"+respA.getEsReintento());
			logger.debug("IdSesion:"+respA.getIdSesion());
			
			String idSesion = respA.getIdSesion();
			Long nroTransaccion = System.currentTimeMillis();
			nroTransaccion = nroTransaccion - (nroTransaccion/1000000000)*1000000000;
			ControlTransaccion ctx = new ControlTransaccion(idSesion, interfaz, nroTransaccion) ;
			Integer tipoCbte = 1;
			Integer ptoVta = 1;
			ResponseConsultarUltimoComprobante respU = ws.consultarUltimoComprobante(ctx, tipoCbte, ptoVta);
			
			logger.debug("Codigo:"+respU.getCodigo());
			logger.debug("Descripcion:"+respU.getDescripcion());
			logger.debug("Observacion:"+respU.getObservacion());
			logger.debug("EsReintento:"+respU.getEsReintento());

			logger.debug("ExcepcionWSAA:"+respU.getExcepcionWsaa());
			logger.debug("ExcepcionWSFEV1:"+respU.getExcepcionWsfev1());
			logger.debug("ErrMsg:"+respU.getErrMsg());
			logger.debug("Obs:"+respU.getObs());
			logger.debug("XMLRequest:"+respU.getXmlRequest());
			logger.debug("XMLResponse:"+respU.getXmlResponse());

		} catch (AxisFault|MalformedURLException e) {
			logger.error("AxisFault|MalformedURLException", e);
		} catch (RemoteException e) {
			logger.error("RemoteException", e);
		}
	}

}
