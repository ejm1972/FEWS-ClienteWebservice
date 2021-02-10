package ar.com.coninf.doconline.ws.impl;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import org.apache.axis.AxisFault;

import ar.com.coninf.doconline.rest.model.response.xsd.ResponseAutenticacion;
import ar.com.coninf.doconline.rest.model.response.xsd.ResponseGenerarQr;
import ar.com.coninf.doconline.rest.model.tx.xsd.ControlTransaccion;
import ar.com.coninf.doconline.rest.model.tx.xsd.DatoQr;

public class DocOnlineServicioWebMain {

	public static void main(String[] args) {
		
		try {
			DocOnlineServicioWeb w = new DocOnlineServicioWebLocator();
			DocOnlineServicioWebPortType ws = new DocOnlineServicioWebSoap11BindingStub(new URL("http://localhost:8282/doconline-ws/services/DocOnlineServicioWeb.DocOnlineServicioWebHttpSoap11Endpoint/"),w);
			
			Integer interfaz = 9901;
			String clave = "1234";
			ResponseAutenticacion respA = ws.iniciarSesion(interfaz, clave);
			
			System.out.println("Codigo:"+respA.getCodigo());
			System.out.println("Descripcion:"+respA.getDescripcion());
			System.out.println("Observacion:"+respA.getObservacion());
			System.out.println("EsReintento:"+respA.getEsReintento());
			System.out.println("IdSesion:"+respA.getIdSesion());
			
			String idSesion = respA.getIdSesion();
			Long nroTransaccion = System.currentTimeMillis();
			nroTransaccion = nroTransaccion - (nroTransaccion/1000000000)*1000000000;
			ControlTransaccion ctx = new ControlTransaccion(idSesion, interfaz, nroTransaccion) ;
			DatoQr datoQr = new DatoQr();

			ResponseGenerarQr respG = ws.generarQr(ctx, datoQr);
			
			System.out.println("Codigo:"+respG.getCodigo());
			System.out.println("Descripcion:"+respG.getDescripcion());
			System.out.println("Observacion:"+respG.getObservacion());
			System.out.println("EsReintento:"+respG.getEsReintento());

			System.out.println("getTextoQr:"+respG.getTextoQr());
			System.out.println("getImagenQr:"+respG.getImagenQr());

		} catch (AxisFault|MalformedURLException e) {
			System.out.println("AxisFault|MalformedURLException");
			e.printStackTrace();
		} catch (RemoteException e) {
			System.out.println("RemoteException");
			e.printStackTrace();
		}
	}

}
