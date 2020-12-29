/**
 * ResponseConsultarUltimoComprobante.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ar.com.coninf.doconline.rest.model.response.xsd;

public class ResponseConsultarUltimoComprobante  extends ar.com.coninf.doconline.rest.model.response.xsd.Response  implements java.io.Serializable {
    private java.lang.String errMsg;

    private java.lang.String excepcionWsaa;

    private java.lang.String excepcionWsfev1;

    private java.lang.String obs;

    private java.lang.String ultimoComprobante;

    private java.lang.String xmlRequest;

    private java.lang.String xmlResponse;

    public ResponseConsultarUltimoComprobante() {
    }

    public ResponseConsultarUltimoComprobante(
           java.lang.Integer codigo,
           java.lang.String descripcion,
           java.lang.Boolean esReintento,
           java.lang.String observacion,
           java.lang.String errMsg,
           java.lang.String excepcionWsaa,
           java.lang.String excepcionWsfev1,
           java.lang.String obs,
           java.lang.String ultimoComprobante,
           java.lang.String xmlRequest,
           java.lang.String xmlResponse) {
        super(
            codigo,
            descripcion,
            esReintento,
            observacion);
        this.errMsg = errMsg;
        this.excepcionWsaa = excepcionWsaa;
        this.excepcionWsfev1 = excepcionWsfev1;
        this.obs = obs;
        this.ultimoComprobante = ultimoComprobante;
        this.xmlRequest = xmlRequest;
        this.xmlResponse = xmlResponse;
    }


    /**
     * Gets the errMsg value for this ResponseConsultarUltimoComprobante.
     * 
     * @return errMsg
     */
    public java.lang.String getErrMsg() {
        return errMsg;
    }


    /**
     * Sets the errMsg value for this ResponseConsultarUltimoComprobante.
     * 
     * @param errMsg
     */
    public void setErrMsg(java.lang.String errMsg) {
        this.errMsg = errMsg;
    }


    /**
     * Gets the excepcionWsaa value for this ResponseConsultarUltimoComprobante.
     * 
     * @return excepcionWsaa
     */
    public java.lang.String getExcepcionWsaa() {
        return excepcionWsaa;
    }


    /**
     * Sets the excepcionWsaa value for this ResponseConsultarUltimoComprobante.
     * 
     * @param excepcionWsaa
     */
    public void setExcepcionWsaa(java.lang.String excepcionWsaa) {
        this.excepcionWsaa = excepcionWsaa;
    }


    /**
     * Gets the excepcionWsfev1 value for this ResponseConsultarUltimoComprobante.
     * 
     * @return excepcionWsfev1
     */
    public java.lang.String getExcepcionWsfev1() {
        return excepcionWsfev1;
    }


    /**
     * Sets the excepcionWsfev1 value for this ResponseConsultarUltimoComprobante.
     * 
     * @param excepcionWsfev1
     */
    public void setExcepcionWsfev1(java.lang.String excepcionWsfev1) {
        this.excepcionWsfev1 = excepcionWsfev1;
    }


    /**
     * Gets the obs value for this ResponseConsultarUltimoComprobante.
     * 
     * @return obs
     */
    public java.lang.String getObs() {
        return obs;
    }


    /**
     * Sets the obs value for this ResponseConsultarUltimoComprobante.
     * 
     * @param obs
     */
    public void setObs(java.lang.String obs) {
        this.obs = obs;
    }


    /**
     * Gets the ultimoComprobante value for this ResponseConsultarUltimoComprobante.
     * 
     * @return ultimoComprobante
     */
    public java.lang.String getUltimoComprobante() {
        return ultimoComprobante;
    }


    /**
     * Sets the ultimoComprobante value for this ResponseConsultarUltimoComprobante.
     * 
     * @param ultimoComprobante
     */
    public void setUltimoComprobante(java.lang.String ultimoComprobante) {
        this.ultimoComprobante = ultimoComprobante;
    }


    /**
     * Gets the xmlRequest value for this ResponseConsultarUltimoComprobante.
     * 
     * @return xmlRequest
     */
    public java.lang.String getXmlRequest() {
        return xmlRequest;
    }


    /**
     * Sets the xmlRequest value for this ResponseConsultarUltimoComprobante.
     * 
     * @param xmlRequest
     */
    public void setXmlRequest(java.lang.String xmlRequest) {
        this.xmlRequest = xmlRequest;
    }


    /**
     * Gets the xmlResponse value for this ResponseConsultarUltimoComprobante.
     * 
     * @return xmlResponse
     */
    public java.lang.String getXmlResponse() {
        return xmlResponse;
    }


    /**
     * Sets the xmlResponse value for this ResponseConsultarUltimoComprobante.
     * 
     * @param xmlResponse
     */
    public void setXmlResponse(java.lang.String xmlResponse) {
        this.xmlResponse = xmlResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponseConsultarUltimoComprobante)) return false;
        ResponseConsultarUltimoComprobante other = (ResponseConsultarUltimoComprobante) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.errMsg==null && other.getErrMsg()==null) || 
             (this.errMsg!=null &&
              this.errMsg.equals(other.getErrMsg()))) &&
            ((this.excepcionWsaa==null && other.getExcepcionWsaa()==null) || 
             (this.excepcionWsaa!=null &&
              this.excepcionWsaa.equals(other.getExcepcionWsaa()))) &&
            ((this.excepcionWsfev1==null && other.getExcepcionWsfev1()==null) || 
             (this.excepcionWsfev1!=null &&
              this.excepcionWsfev1.equals(other.getExcepcionWsfev1()))) &&
            ((this.obs==null && other.getObs()==null) || 
             (this.obs!=null &&
              this.obs.equals(other.getObs()))) &&
            ((this.ultimoComprobante==null && other.getUltimoComprobante()==null) || 
             (this.ultimoComprobante!=null &&
              this.ultimoComprobante.equals(other.getUltimoComprobante()))) &&
            ((this.xmlRequest==null && other.getXmlRequest()==null) || 
             (this.xmlRequest!=null &&
              this.xmlRequest.equals(other.getXmlRequest()))) &&
            ((this.xmlResponse==null && other.getXmlResponse()==null) || 
             (this.xmlResponse!=null &&
              this.xmlResponse.equals(other.getXmlResponse())));
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
        if (getErrMsg() != null) {
            _hashCode += getErrMsg().hashCode();
        }
        if (getExcepcionWsaa() != null) {
            _hashCode += getExcepcionWsaa().hashCode();
        }
        if (getExcepcionWsfev1() != null) {
            _hashCode += getExcepcionWsfev1().hashCode();
        }
        if (getObs() != null) {
            _hashCode += getObs().hashCode();
        }
        if (getUltimoComprobante() != null) {
            _hashCode += getUltimoComprobante().hashCode();
        }
        if (getXmlRequest() != null) {
            _hashCode += getXmlRequest().hashCode();
        }
        if (getXmlResponse() != null) {
            _hashCode += getXmlResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResponseConsultarUltimoComprobante.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://response.model.rest.doconline.coninf.com.ar/xsd", "ResponseConsultarUltimoComprobante"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errMsg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.model.rest.doconline.coninf.com.ar/xsd", "errMsg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excepcionWsaa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.model.rest.doconline.coninf.com.ar/xsd", "excepcionWsaa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excepcionWsfev1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.model.rest.doconline.coninf.com.ar/xsd", "excepcionWsfev1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("obs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.model.rest.doconline.coninf.com.ar/xsd", "obs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ultimoComprobante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.model.rest.doconline.coninf.com.ar/xsd", "ultimoComprobante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.model.rest.doconline.coninf.com.ar/xsd", "xmlRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.model.rest.doconline.coninf.com.ar/xsd", "xmlResponse"));
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
