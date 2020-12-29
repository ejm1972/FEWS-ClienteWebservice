/**
 * DatoOpcional.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ar.com.coninf.doconline.rest.model.tx.xsd;

public class DatoOpcional  implements java.io.Serializable {
    private java.lang.Integer opcionalId;

    private java.lang.String valor;

    public DatoOpcional() {
    }

    public DatoOpcional(
           java.lang.Integer opcionalId,
           java.lang.String valor) {
           this.opcionalId = opcionalId;
           this.valor = valor;
    }


    /**
     * Gets the opcionalId value for this DatoOpcional.
     * 
     * @return opcionalId
     */
    public java.lang.Integer getOpcionalId() {
        return opcionalId;
    }


    /**
     * Sets the opcionalId value for this DatoOpcional.
     * 
     * @param opcionalId
     */
    public void setOpcionalId(java.lang.Integer opcionalId) {
        this.opcionalId = opcionalId;
    }


    /**
     * Gets the valor value for this DatoOpcional.
     * 
     * @return valor
     */
    public java.lang.String getValor() {
        return valor;
    }


    /**
     * Sets the valor value for this DatoOpcional.
     * 
     * @param valor
     */
    public void setValor(java.lang.String valor) {
        this.valor = valor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatoOpcional)) return false;
        DatoOpcional other = (DatoOpcional) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.opcionalId==null && other.getOpcionalId()==null) || 
             (this.opcionalId!=null &&
              this.opcionalId.equals(other.getOpcionalId()))) &&
            ((this.valor==null && other.getValor()==null) || 
             (this.valor!=null &&
              this.valor.equals(other.getValor())));
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
        if (getOpcionalId() != null) {
            _hashCode += getOpcionalId().hashCode();
        }
        if (getValor() != null) {
            _hashCode += getValor().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DatoOpcional.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tx.model.rest.doconline.coninf.com.ar/xsd", "DatoOpcional"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opcionalId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tx.model.rest.doconline.coninf.com.ar/xsd", "opcionalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tx.model.rest.doconline.coninf.com.ar/xsd", "valor"));
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
