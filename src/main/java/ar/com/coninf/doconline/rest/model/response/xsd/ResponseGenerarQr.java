package ar.com.coninf.doconline.rest.model.response.xsd;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class ResponseGenerarQr extends Response {
	private static final long serialVersionUID = 1L;
	
	private String textoQr;
	private byte[] imagenQr;
	
}
