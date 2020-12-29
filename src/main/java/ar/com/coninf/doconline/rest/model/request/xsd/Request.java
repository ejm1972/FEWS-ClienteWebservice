/**
 * Request.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ar.com.coninf.doconline.rest.model.request.xsd;

public class Request  implements java.io.Serializable {
    private ar.com.coninf.doconline.rest.model.tx.xsd.ControlTransaccion controlTransaccion;

    public Request() {
    }

    public Request(
           ar.com.coninf.doconline.rest.model.tx.xsd.ControlTransaccion controlTransaccion) {
           this.controlTransaccion = controlTransaccion;
    }


    /**
     * Gets the controlTransaccion value for this Request.
     * 
     * @return controlTransaccion
     */
    public ar.com.coninf.doconline.rest.model.tx.xsd.ControlTransaccion getControlTransaccion() {
        return controlTransaccion;
    }


    /**
     * Sets the controlTransaccion value for this Request.
     * 
     * @param controlTransaccion
     */
    public void setControlTransaccion(ar.com.coninf.doconline.rest.model.tx.xsd.ControlTransaccion controlTransaccion) {
        this.controlTransaccion = controlTransaccion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Request)) return false;
        Request other = (Request) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.controlTransaccion==null && other.getControlTransaccion()==null) || 
             (this.controlTransaccion!=null &&
              this.controlTransaccion.equals(other.getControlTransaccion())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getControlTransaccion() != null) {
            _hashCode += getControlTransaccion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Request.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://request.model.rest.doconline.coninf.com.ar/xsd", "Request"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("controlTransaccion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.model.rest.doconline.coninf.com.ar/xsd", "controlTransaccion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tx.model.rest.doconline.coninf.com.ar/xsd", "ControlTransaccion"));
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
