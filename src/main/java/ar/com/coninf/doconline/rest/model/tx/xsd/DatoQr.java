package ar.com.coninf.doconline.rest.model.tx.xsd;

import java.io.Serializable;

import lombok.Data;

@Data
public class DatoQr implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer ver; 			//Numerico 1 digito								OBLiGATORiO 		Version del formato de los datos del comprobante										1				
	private String  fecha; 			//full-date (RFC3339)							OBLiGATORiO 		Fecha de emision del comprobante														"2020-10-13"	
	private Long 	cuit; 			//Numerico 11 digitos							OBLiGATORiO 		Cuit del Emisor del comprobante															30000000007		
	private Integer ptoVta; 		//Numerico hasta 5 digitos						OBLiGATORiO 		Punto de venta utilizado para emitir el comprobante										10				
	private Integer tipoCmp; 		//Numerico hasta 3 digitos						OBLiGATORiO 		tipo de comprobante (segun Tablas del sistema )											1				
	private Long    nroCmp; 		//Numerico hasta 8 digitos						OBLiGATORiO 		Numero del comprobante																	94				
	private Long    importe; 		//Decimal hasta 13 enteros y 2 decimales		OBLiGATORiO 		importe Total del comprobante (en la moneda en la que fue emitido)						12100			
	private String  moneda; 		//3 caracteres									OBLiGATORiO 		Moneda del comprobante (segun Tablas del sistema )										"DOL"			
	private Long    ctz; 			//Decimal hasta 13 enteros y 6 decimales		OBLiGATORiO 		Cotizacion en pesos argentinos de la moneda utilizada (1 cuando la moneda sea pesos)	65				
	private Integer tipoDocRec; 	//Numerico hasta 2 digitos						DE CORRESPONDER 	Codigo del Tipo de documento del receptor (segun Tablas del sistema )					80				
	private Long    nroDocRec; 		//Numerico hasta 20 digitos						DE CORRESPONDER 	Numero de documento del receptor correspondiente al tipo de documento indicado			20000000001		
	private String  tipoCodAut; 	//string										OBLiGATORiO 		"A" para comprobante autorizado por CAEA, "E" para comprobante autorizado por CAE		"E"				
	private String  codAut; 		//Numerico 14 digitos							OBLiGATORiO 		Codigo de autorizacion otorgado por AFiP para el comprobante							70417054367476	
	
}
