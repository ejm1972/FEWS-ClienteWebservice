/**
 * TipoIva.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ar.com.coninf.doconline.rest.model.tx.xsd;

public class TipoIva  implements java.io.Serializable {
    private java.math.BigDecimal ivaBaseImp;

    private java.lang.Integer ivaId;

    private java.math.BigDecimal ivaImporte;

    public TipoIva() {
    }

    public TipoIva(
           java.math.BigDecimal ivaBaseImp,
           java.lang.Integer ivaId,
           java.math.BigDecimal ivaImporte) {
           this.ivaBaseImp = ivaBaseImp;
           this.ivaId = ivaId;
           this.ivaImporte = ivaImporte;
    }


    /**
     * Gets the ivaBaseImp value for this TipoIva.
     * 
     * @return ivaBaseImp
     */
    public java.math.BigDecimal getIvaBaseImp() {
        return ivaBaseImp;
    }


    /**
     * Sets the ivaBaseImp value for this TipoIva.
     * 
     * @param ivaBaseImp
     */
    public void setIvaBaseImp(java.math.BigDecimal ivaBaseImp) {
        this.ivaBaseImp = ivaBaseImp;
    }


    /**
     * Gets the ivaId value for this TipoIva.
     * 
     * @return ivaId
     */
    public java.lang.Integer getIvaId() {
        return ivaId;
    }


    /**
     * Sets the ivaId value for this TipoIva.
     * 
     * @param ivaId
     */
    public void setIvaId(java.lang.Integer ivaId) {
        this.ivaId = ivaId;
    }


    /**
     * Gets the ivaImporte value for this TipoIva.
     * 
     * @return ivaImporte
     */
    public java.math.BigDecimal getIvaImporte() {
        return ivaImporte;
    }


    /**
     * Sets the ivaImporte value for this TipoIva.
     * 
     * @param ivaImporte
     */
    public void setIvaImporte(java.math.BigDecimal ivaImporte) {
        this.ivaImporte = ivaImporte;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TipoIva)) return false;
        TipoIva other = (TipoIva) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ivaBaseImp==null && other.getIvaBaseImp()==null) || 
             (this.ivaBaseImp!=null &&
              this.ivaBaseImp.equals(other.getIvaBaseImp()))) &&
            ((this.ivaId==null && other.getIvaId()==null) || 
             (this.ivaId!=null &&
              this.ivaId.equals(other.getIvaId()))) &&
            ((this.ivaImporte==null && other.getIvaImporte()==null) || 
             (this.ivaImporte!=null &&
              this.ivaImporte.equals(other.getIvaImporte())));
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
        if (getIvaBaseImp() != null) {
            _hashCode += getIvaBaseImp().hashCode();
        }
        if (getIvaId() != null) {
            _hashCode += getIvaId().hashCode();
        }
        if (getIvaImporte() != null) {
            _hashCode += getIvaImporte().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TipoIva.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tx.model.rest.doconline.coninf.com.ar/xsd", "TipoIva"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ivaBaseImp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tx.model.rest.doconline.coninf.com.ar/xsd", "ivaBaseImp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ivaId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tx.model.rest.doconline.coninf.com.ar/xsd", "ivaId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ivaImporte");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tx.model.rest.doconline.coninf.com.ar/xsd", "ivaImporte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
