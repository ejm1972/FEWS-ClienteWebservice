/**
 * ControlTransaccion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ar.com.coninf.doconline.rest.model.tx.xsd;

public class ControlTransaccion  implements java.io.Serializable {
    private java.lang.String idSesion;

    private java.lang.Integer interfaz;

    private java.lang.Long nroTransaccion;

    public ControlTransaccion() {
    }

    public ControlTransaccion(
           java.lang.String idSesion,
           java.lang.Integer interfaz,
           java.lang.Long nroTransaccion) {
           this.idSesion = idSesion;
           this.interfaz = interfaz;
           this.nroTransaccion = nroTransaccion;
    }


    /**
     * Gets the idSesion value for this ControlTransaccion.
     * 
     * @return idSesion
     */
    public java.lang.String getIdSesion() {
        return idSesion;
    }


    /**
     * Sets the idSesion value for this ControlTransaccion.
     * 
     * @param idSesion
     */
    public void setIdSesion(java.lang.String idSesion) {
        this.idSesion = idSesion;
    }


    /**
     * Gets the interfaz value for this ControlTransaccion.
     * 
     * @return interfaz
     */
    public java.lang.Integer getInterfaz() {
        return interfaz;
    }


    /**
     * Sets the interfaz value for this ControlTransaccion.
     * 
     * @param interfaz
     */
    public void setInterfaz(java.lang.Integer interfaz) {
        this.interfaz = interfaz;
    }


    /**
     * Gets the nroTransaccion value for this ControlTransaccion.
     * 
     * @return nroTransaccion
     */
    public java.lang.Long getNroTransaccion() {
        return nroTransaccion;
    }


    /**
     * Sets the nroTransaccion value for this ControlTransaccion.
     * 
     * @param nroTransaccion
     */
    public void setNroTransaccion(java.lang.Long nroTransaccion) {
        this.nroTransaccion = nroTransaccion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ControlTransaccion)) return false;
        ControlTransaccion other = (ControlTransaccion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idSesion==null && other.getIdSesion()==null) || 
             (this.idSesion!=null &&
              this.idSesion.equals(other.getIdSesion()))) &&
            ((this.interfaz==null && other.getInterfaz()==null) || 
             (this.interfaz!=null &&
              this.interfaz.equals(other.getInterfaz()))) &&
            ((this.nroTransaccion==null && other.getNroTransaccion()==null) || 
             (this.nroTransaccion!=null &&
              this.nroTransaccion.equals(other.getNroTransaccion())));
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
        if (getIdSesion() != null) {
            _hashCode += getIdSesion().hashCode();
        }
        if (getInterfaz() != null) {
            _hashCode += getInterfaz().hashCode();
        }
        if (getNroTransaccion() != null) {
            _hashCode += getNroTransaccion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ControlTransaccion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tx.model.rest.doconline.coninf.com.ar/xsd", "ControlTransaccion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idSesion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tx.model.rest.doconline.coninf.com.ar/xsd", "idSesion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interfaz");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tx.model.rest.doconline.coninf.com.ar/xsd", "interfaz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroTransaccion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tx.model.rest.doconline.coninf.com.ar/xsd", "nroTransaccion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
