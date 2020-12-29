/**
 * ResponseAutenticacion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ar.com.coninf.doconline.rest.model.response.xsd;

public class ResponseAutenticacion  extends ar.com.coninf.doconline.rest.model.response.xsd.Response  implements java.io.Serializable {
    private java.lang.String idSesion;

    public ResponseAutenticacion() {
    }

    public ResponseAutenticacion(
           java.lang.Integer codigo,
           java.lang.String descripcion,
           java.lang.Boolean esReintento,
           java.lang.String observacion,
           java.lang.String idSesion) {
        super(
            codigo,
            descripcion,
            esReintento,
            observacion);
        this.idSesion = idSesion;
    }


    /**
     * Gets the idSesion value for this ResponseAutenticacion.
     * 
     * @return idSesion
     */
    public java.lang.String getIdSesion() {
        return idSesion;
    }


    /**
     * Sets the idSesion value for this ResponseAutenticacion.
     * 
     * @param idSesion
     */
    public void setIdSesion(java.lang.String idSesion) {
        this.idSesion = idSesion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponseAutenticacion)) return false;
        ResponseAutenticacion other = (ResponseAutenticacion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.idSesion==null && other.getIdSesion()==null) || 
             (this.idSesion!=null &&
              this.idSesion.equals(other.getIdSesion())));
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
        if (getIdSesion() != null) {
            _hashCode += getIdSesion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResponseAutenticacion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://response.model.rest.doconline.coninf.com.ar/xsd", "ResponseAutenticacion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idSesion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.model.rest.doconline.coninf.com.ar/xsd", "idSesion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
