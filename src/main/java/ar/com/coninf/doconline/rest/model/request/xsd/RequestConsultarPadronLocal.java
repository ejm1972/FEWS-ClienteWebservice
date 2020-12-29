/**
 * RequestConsultarPadronLocal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ar.com.coninf.doconline.rest.model.request.xsd;

public class RequestConsultarPadronLocal  extends ar.com.coninf.doconline.rest.model.request.xsd.Request  implements java.io.Serializable {
    private java.lang.Integer cbte;

    private java.lang.String cuit;

    private java.lang.Integer ptoVta;

    private java.lang.Integer tipoCbte;

    public RequestConsultarPadronLocal() {
    }

    public RequestConsultarPadronLocal(
           ar.com.coninf.doconline.rest.model.tx.xsd.ControlTransaccion controlTransaccion,
           java.lang.Integer cbte,
           java.lang.String cuit,
           java.lang.Integer ptoVta,
           java.lang.Integer tipoCbte) {
        super(
            controlTransaccion);
        this.cbte = cbte;
        this.cuit = cuit;
        this.ptoVta = ptoVta;
        this.tipoCbte = tipoCbte;
    }


    /**
     * Gets the cbte value for this RequestConsultarPadronLocal.
     * 
     * @return cbte
     */
    public java.lang.Integer getCbte() {
        return cbte;
    }


    /**
     * Sets the cbte value for this RequestConsultarPadronLocal.
     * 
     * @param cbte
     */
    public void setCbte(java.lang.Integer cbte) {
        this.cbte = cbte;
    }


    /**
     * Gets the cuit value for this RequestConsultarPadronLocal.
     * 
     * @return cuit
     */
    public java.lang.String getCuit() {
        return cuit;
    }


    /**
     * Sets the cuit value for this RequestConsultarPadronLocal.
     * 
     * @param cuit
     */
    public void setCuit(java.lang.String cuit) {
        this.cuit = cuit;
    }


    /**
     * Gets the ptoVta value for this RequestConsultarPadronLocal.
     * 
     * @return ptoVta
     */
    public java.lang.Integer getPtoVta() {
        return ptoVta;
    }


    /**
     * Sets the ptoVta value for this RequestConsultarPadronLocal.
     * 
     * @param ptoVta
     */
    public void setPtoVta(java.lang.Integer ptoVta) {
        this.ptoVta = ptoVta;
    }


    /**
     * Gets the tipoCbte value for this RequestConsultarPadronLocal.
     * 
     * @return tipoCbte
     */
    public java.lang.Integer getTipoCbte() {
        return tipoCbte;
    }


    /**
     * Sets the tipoCbte value for this RequestConsultarPadronLocal.
     * 
     * @param tipoCbte
     */
    public void setTipoCbte(java.lang.Integer tipoCbte) {
        this.tipoCbte = tipoCbte;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestConsultarPadronLocal)) return false;
        RequestConsultarPadronLocal other = (RequestConsultarPadronLocal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.cbte==null && other.getCbte()==null) || 
             (this.cbte!=null &&
              this.cbte.equals(other.getCbte()))) &&
            ((this.cuit==null && other.getCuit()==null) || 
             (this.cuit!=null &&
              this.cuit.equals(other.getCuit()))) &&
            ((this.ptoVta==null && other.getPtoVta()==null) || 
             (this.ptoVta!=null &&
              this.ptoVta.equals(other.getPtoVta()))) &&
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
        int _hashCode = super.hashCode();
        if (getCbte() != null) {
            _hashCode += getCbte().hashCode();
        }
        if (getCuit() != null) {
            _hashCode += getCuit().hashCode();
        }
        if (getPtoVta() != null) {
            _hashCode += getPtoVta().hashCode();
        }
        if (getTipoCbte() != null) {
            _hashCode += getTipoCbte().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestConsultarPadronLocal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://request.model.rest.doconline.coninf.com.ar/xsd", "RequestConsultarPadronLocal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cbte");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.model.rest.doconline.coninf.com.ar/xsd", "cbte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cuit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.model.rest.doconline.coninf.com.ar/xsd", "cuit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ptoVta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.model.rest.doconline.coninf.com.ar/xsd", "ptoVta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoCbte");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.model.rest.doconline.coninf.com.ar/xsd", "tipoCbte"));
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
