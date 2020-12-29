/**
 * ComprobanteAsociado.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ar.com.coninf.doconline.rest.model.tx.xsd;

public class ComprobanteAsociado  implements java.io.Serializable {
    private java.lang.Integer cbteNro;

    private java.lang.String cuit;

    private java.lang.String fechaCbte;

    private java.lang.Integer puntoVta;

    private java.lang.Integer tipoCbte;

    public ComprobanteAsociado() {
    }

    public ComprobanteAsociado(
           java.lang.Integer cbteNro,
           java.lang.String cuit,
           java.lang.String fechaCbte,
           java.lang.Integer puntoVta,
           java.lang.Integer tipoCbte) {
           this.cbteNro = cbteNro;
           this.cuit = cuit;
           this.fechaCbte = fechaCbte;
           this.puntoVta = puntoVta;
           this.tipoCbte = tipoCbte;
    }


    /**
     * Gets the cbteNro value for this ComprobanteAsociado.
     * 
     * @return cbteNro
     */
    public java.lang.Integer getCbteNro() {
        return cbteNro;
    }


    /**
     * Sets the cbteNro value for this ComprobanteAsociado.
     * 
     * @param cbteNro
     */
    public void setCbteNro(java.lang.Integer cbteNro) {
        this.cbteNro = cbteNro;
    }


    /**
     * Gets the cuit value for this ComprobanteAsociado.
     * 
     * @return cuit
     */
    public java.lang.String getCuit() {
        return cuit;
    }


    /**
     * Sets the cuit value for this ComprobanteAsociado.
     * 
     * @param cuit
     */
    public void setCuit(java.lang.String cuit) {
        this.cuit = cuit;
    }


    /**
     * Gets the fechaCbte value for this ComprobanteAsociado.
     * 
     * @return fechaCbte
     */
    public java.lang.String getFechaCbte() {
        return fechaCbte;
    }


    /**
     * Sets the fechaCbte value for this ComprobanteAsociado.
     * 
     * @param fechaCbte
     */
    public void setFechaCbte(java.lang.String fechaCbte) {
        this.fechaCbte = fechaCbte;
    }


    /**
     * Gets the puntoVta value for this ComprobanteAsociado.
     * 
     * @return puntoVta
     */
    public java.lang.Integer getPuntoVta() {
        return puntoVta;
    }


    /**
     * Sets the puntoVta value for this ComprobanteAsociado.
     * 
     * @param puntoVta
     */
    public void setPuntoVta(java.lang.Integer puntoVta) {
        this.puntoVta = puntoVta;
    }


    /**
     * Gets the tipoCbte value for this ComprobanteAsociado.
     * 
     * @return tipoCbte
     */
    public java.lang.Integer getTipoCbte() {
        return tipoCbte;
    }


    /**
     * Sets the tipoCbte value for this ComprobanteAsociado.
     * 
     * @param tipoCbte
     */
    public void setTipoCbte(java.lang.Integer tipoCbte) {
        this.tipoCbte = tipoCbte;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ComprobanteAsociado)) return false;
        ComprobanteAsociado other = (ComprobanteAsociado) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cbteNro==null && other.getCbteNro()==null) || 
             (this.cbteNro!=null &&
              this.cbteNro.equals(other.getCbteNro()))) &&
            ((this.cuit==null && other.getCuit()==null) || 
             (this.cuit!=null &&
              this.cuit.equals(other.getCuit()))) &&
            ((this.fechaCbte==null && other.getFechaCbte()==null) || 
             (this.fechaCbte!=null &&
              this.fechaCbte.equals(other.getFechaCbte()))) &&
            ((this.puntoVta==null && other.getPuntoVta()==null) || 
             (this.puntoVta!=null &&
              this.puntoVta.equals(other.getPuntoVta()))) &&
            ((this.tipoCbte==null && other.getTipoCbte()==null) || 
             (this.tipoCbte!=null &&
              this.tipoCbte.equals(other.getTipoCbte())));
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
        if (getCbteNro() != null) {
            _hashCode += getCbteNro().hashCode();
        }
        if (getCuit() != null) {
            _hashCode += getCuit().hashCode();
        }
        if (getFechaCbte() != null) {
            _hashCode += getFechaCbte().hashCode();
        }
        if (getPuntoVta() != null) {
            _hashCode += getPuntoVta().hashCode();
        }
        if (getTipoCbte() != null) {
            _hashCode += getTipoCbte().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ComprobanteAsociado.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tx.model.rest.doconline.coninf.com.ar/xsd", "ComprobanteAsociado"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cbteNro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tx.model.rest.doconline.coninf.com.ar/xsd", "cbteNro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cuit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tx.model.rest.doconline.coninf.com.ar/xsd", "cuit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaCbte");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tx.model.rest.doconline.coninf.com.ar/xsd", "fechaCbte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("puntoVta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tx.model.rest.doconline.coninf.com.ar/xsd", "puntoVta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoCbte");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tx.model.rest.doconline.coninf.com.ar/xsd", "tipoCbte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
