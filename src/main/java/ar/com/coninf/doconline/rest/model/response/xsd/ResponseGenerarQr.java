/**
 * ResponseConsultarComprobante.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ar.com.coninf.doconline.rest.model.response.xsd;

public class ResponseGenerarQr  extends ar.com.coninf.doconline.rest.model.response.xsd.Response  implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private String textoQr;
	private byte[] imagenQr;
	
    public ResponseGenerarQr() {
    }

    public ResponseGenerarQr(
           java.lang.Integer codigo,
           java.lang.String descripcion,
           java.lang.Boolean esReintento,
           java.lang.String observacion,
           java.lang.String textoQr,
           byte[] imagenQr) {
        super(
            codigo,
            descripcion,
            esReintento,
            observacion);
        this.textoQr = textoQr;
        this.imagenQr = imagenQr;
    }


    /**
     * Gets the cae value for this ResponseConsultarComprobante.
     * 
     * @return cae
     */
    public java.lang.String getTextoQr() {
        return textoQr;
    }


    /**
     * Sets the cae value for this ResponseConsultarComprobante.
     * 
     * @param cae
     */
    public void setTextoQr(java.lang.String textoQr) {
        this.textoQr = textoQr;
    }


    /**
     * Gets the errMsg value for this ResponseConsultarComprobante.
     * 
     * @return errMsg
     */
    public byte[] getImagenQr() {
        return imagenQr;
    }


    /**
     * Sets the errMsg value for this ResponseConsultarComprobante.
     * 
     * @param errMsg
     */
    public void setImagenQr(byte[] imagenQr) {
        this.imagenQr = imagenQr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponseGenerarQr)) return false;
        ResponseGenerarQr other = (ResponseGenerarQr) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.textoQr==null && other.getTextoQr()==null) || 
             (this.textoQr!=null &&
              this.textoQr.equals(other.getTextoQr()))) &&
            ((this.imagenQr==null && other.getImagenQr()==null) || 
             (this.imagenQr!=null &&
              this.imagenQr.equals(other.getImagenQr())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getTextoQr() != null) {
            _hashCode += getTextoQr().hashCode();
        }
        if (getImagenQr() != null) {
            _hashCode += getImagenQr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResponseGenerarQr.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://response.model.rest.doconline.coninf.com.ar/xsd", "ResponseGenerarQr"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textoQr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.model.rest.doconline.coninf.com.ar/xsd", "textoQr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imagenQr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.model.rest.doconline.coninf.com.ar/xsd", "imagenQr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "byte[]"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
