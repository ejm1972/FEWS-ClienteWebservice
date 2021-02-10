package ar.com.coninf.doconline.ws.impl;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import org.apache.axis.AxisFault;
import org.apache.log4j.Logger;

import ar.com.coninf.doconline.rest.model.response.xsd.ResponseAutenticacion;
import ar.com.coninf.doconline.rest.model.response.xsd.ResponseConsultarComprobante;
import ar.com.coninf.doconline.rest.model.response.xsd.ResponseConsultarUltimoComprobante;
import ar.com.coninf.doconline.rest.model.response.xsd.ResponseGenerarQr;
import ar.com.coninf.doconline.rest.model.tx.xsd.ControlTransaccion;
import ar.com.coninf.doconline.rest.model.tx.xsd.DatoQr;

public class DocOnlineServicioWebMain {
	private static Logger logger = Logger.getLogger(DocOnlineServicioWebMain.class);

	public static void main(String[] args) {
		
		try {
			DocOnlineServicioWeb w = new DocOnlineServicioWebLocator();
			DocOnlineServicioWebPortType ws = new DocOnlineServicioWebSoap11BindingStub(new URL("http://localhost:8282/doconline-ws/services/DocOnlineServicioWeb.DocOnlineServicioWebHttpSoap11Endpoint/"),w);
			
			Integer interfaz = 9901;
			String clave = "1234";
			ResponseAutenticacion respA = ws.iniciarSesion(interfaz, clave);
			
			logger.debug("Codigo:"+respA.getCodigo());
			logger.debug("Descripcion:"+respA.getDescripcion());
			logger.debug("Observacion:"+respA.getObservacion());
			logger.debug("EsReintento:"+respA.getEsReintento());
			logger.debug("IdSesion:"+respA.getIdSesion());

			System.out.println("Codigo:"+respA.getCodigo());
			System.out.println("Descripcion:"+respA.getDescripcion());
			System.out.println("Observacion:"+respA.getObservacion());
			System.out.println("EsReintento:"+respA.getEsReintento());
			System.out.println("IdSesion:"+respA.getIdSesion());
			
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
			
			tipoCbte = 1;
			ptoVta = 1;
			Integer nroCbte = 60;
			ResponseConsultarComprobante respC = ws.consultarComprobante(ctx, tipoCbte, ptoVta, nroCbte);
			
			logger.debug("Codigo:"+respC.getCodigo());
			logger.debug("Descripcion:"+respC.getDescripcion());
			logger.debug("Observacion:"+respC.getObservacion());
			logger.debug("EsReintento:"+respC.getEsReintento());

			logger.debug("ExcepcionWSAA:"+respC.getExcepcionWsaa());
			logger.debug("ExcepcionWSFEV1:"+respC.getExcepcionWsfev1());
			logger.debug("ErrMsg:"+respC.getErrMsg());
			logger.debug("Obs:"+respC.getObs());
			logger.debug("XMLRequest:"+respC.getXmlRequest());
			logger.debug("XMLResponse:"+respC.getXmlResponse());
			
			logger.debug("XMLResponse:"+respC.getCae());
			logger.debug("XMLResponse:"+respC.getFechaCbte());
			logger.debug("XMLResponse:"+respC.getFechaVencimiento());
			logger.debug("XMLResponse:"+respC.getImpTotal());
			
			DatoQr datoQr = new DatoQr();
			datoQr.setCodAut("11111111111111");
			datoQr.setCtz(100L);
			datoQr.setCuit(20000000001L);
			datoQr.setFecha("2021-02-01");
			datoQr.setImporte(100000L);
			datoQr.setMoneda("PES");
			datoQr.setNroCmp(1L);
			datoQr.setNroDocRec(11111111L);
			datoQr.setPtoVta(1);
			datoQr.setTipoCmp(1);
			datoQr.setTipoCodAut("E");
			datoQr.setTipoDocRec(96);
			datoQr.setVer(1);
			ResponseGenerarQr respG = ws.generarQr(ctx, datoQr);
			
			System.out.println("Codigo:"+respG.getCodigo());
			System.out.println("Descripcion:"+respG.getDescripcion());
			System.out.println("Observacion:"+respG.getObservacion());
			System.out.println("EsReintento:"+respG.getEsReintento());

			System.out.println("getTextoQr:"+respG.getTextoQr());
			System.out.println("getImagenQr:"+respG.getImagenQr().toString());
			
			

		} catch (AxisFault|MalformedURLException e) {
			System.out.println("AxisFault|MalformedURLException");
			e.printStackTrace();
		} catch (RemoteException e) {
			System.out.println("RemoteException");
			e.printStackTrace();
		}
	}

}
