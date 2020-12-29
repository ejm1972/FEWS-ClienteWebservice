/**
 * ResponseActualizarItemComprobante.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ar.com.coninf.doconline.rest.model.response.xsd;

public class ResponseActualizarItemComprobante  extends ar.com.coninf.doconline.rest.model.response.xsd.Response  implements java.io.Serializable {
    private java.lang.String cae;

    private java.lang.String errMsg;

    private java.lang.String excepcionWsaa;

    private java.lang.String excepcionWsfev1;

    private java.lang.String fechaVencimiento;

    private java.lang.String obs;

    private java.lang.String resultado;

    private java.lang.String xmlRequest;

    private java.lang.String xmlResponse;

    public ResponseActualizarItemComprobante() {
    }

    public ResponseActualizarItemComprobante(
           java.lang.Integer codigo,
           java.lang.String descripcion,
           java.lang.Boolean esReintento,
           java.lang.String observacion,
           java.lang.String cae,
           java.lang.String errMsg,
           java.lang.String excepcionWsaa,
           java.lang.String excepcionWsfev1,
           java.lang.String fechaVencimiento,
           java.lang.String obs,
           java.lang.String resultado,
           java.lang.String xmlRequest,
           java.lang.String xmlResponse) {
        super(
            codigo,
            descripcion,
            esReintento,
            observacion);
        this.cae = cae;
        this.errMsg = errMsg;
        this.excepcionWsaa = excepcionWsaa;
        this.excepcionWsfev1 = excepcionWsfev1;
        this.fechaVencimiento = fechaVencimiento;
        this.obs = obs;
        this.resultado = resultado;
        this.xmlRequest = xmlRequest;
        this.xmlResponse = xmlResponse;
    }


    /**
     * Gets the cae value for this ResponseActualizarItemComprobante.
     * 
     * @return cae
     */
    public java.lang.String getCae() {
        return cae;
    }


    /**
     * Sets the cae value for this ResponseActualizarItemComprobante.
     * 
     * @param cae
     */
    public void setCae(java.lang.String cae) {
        this.cae = cae;
    }


    /**
     * Gets the errMsg value for this ResponseActualizarItemComprobante.
     * 
     * @return errMsg
     */
    public java.lang.String getErrMsg() {
        return errMsg;
    }


    /**
     * Sets the errMsg value for this ResponseActualizarItemComprobante.
     * 
     * @param errMsg
     */
    public void setErrMsg(java.lang.String errMsg) {
        this.errMsg = errMsg;
    }


    /**
     * Gets the excepcionWsaa value for this ResponseActualizarItemComprobante.
     * 
     * @return excepcionWsaa
     */
    public java.lang.String getExcepcionWsaa() {
        return excepcionWsaa;
    }


    /**
     * Sets the excepcionWsaa value for this ResponseActualizarItemComprobante.
     * 
     * @param excepcionWsaa
     */
    public void setExcepcionWsaa(java.lang.String excepcionWsaa) {
        this.excepcionWsaa = excepcionWsaa;
    }


    /**
     * Gets the excepcionWsfev1 value for this ResponseActualizarItemComprobante.
     * 
     * @return excepcionWsfev1
     */
    public java.lang.String getExcepcionWsfev1() {
        return excepcionWsfev1;
    }


    /**
     * Sets the excepcionWsfev1 value for this ResponseActualizarItemComprobante.
     * 
     * @param excepcionWsfev1
     */
    public void setExcepcionWsfev1(java.lang.String excepcionWsfev1) {
        this.excepcionWsfev1 = excepcionWsfev1;
    }


    /**
     * Gets the fechaVencimiento value for this ResponseActualizarItemComprobante.
     * 
     * @return fechaVencimiento
     */
    public java.lang.String getFechaVencimiento() {
        return fechaVencimiento;
    }


    /**
     * Sets the fechaVencimiento value for this ResponseActualizarItemComprobante.
     * 
     * @param fechaVencimiento
     */
    public void setFechaVencimiento(java.lang.String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }


    /**
     * Gets the obs value for this ResponseActualizarItemComprobante.
     * 
     * @return obs
     */
    public java.lang.String getObs() {
        return obs;
    }


    /**
     * Sets the obs value for this ResponseActualizarItemComprobante.
     * 
     * @param obs
     */
    public void setObs(java.lang.String obs) {
        this.obs = obs;
    }


    /**
     * Gets the resultado value for this ResponseActualizarItemComprobante.
     * 
     * @return resultado
     */
    public java.lang.String getResultado() {
        return resultado;
    }


    /**
     * Sets the resultado value for this ResponseActualizarItemComprobante.
     * 
     * @param resultado
     */
    public void setResultado(java.lang.String resultado) {
        this.resultado = resultado;
    }


    /**
     * Gets the xmlRequest value for this ResponseActualizarItemComprobante.
     * 
     * @return xmlRequest
     */
    public java.lang.String getXmlRequest() {
        return xmlRequest;
    }


    /**
     * Sets the xmlRequest value for this ResponseActualizarItemComprobante.
     * 
     * @param xmlRequest
     */
    public void setXmlRequest(java.lang.String xmlRequest) {
        this.xmlRequest = xmlRequest;
    }


    /**
     * Gets the xmlResponse value for this ResponseActualizarItemComprobante.
     * 
     * @return xmlResponse
     */
    public java.lang.String getXmlResponse() {
        return xmlResponse;
    }


    /**
     * Sets the xmlResponse value for this ResponseActualizarItemComprobante.
     * 
     * @param xmlResponse
     */
    public void setXmlResponse(java.lang.String xmlResponse) {
        this.xmlResponse = xmlResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponseActualizarItemComprobante)) return false;
        ResponseActualizarItemComprobante other = (ResponseActualizarItemComprobante) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.cae==null && other.getCae()==null) || 
             (this.cae!=null &&
              this.cae.equals(other.getCae()))) &&
            ((this.errMsg==null && other.getErrMsg()==null) || 
             (this.errMsg!=null &&
              this.errMsg.equals(other.getErrMsg()))) &&
            ((this.excepcionWsaa==null && other.getExcepcionWsaa()==null) || 
             (this.excepcionWsaa!=null &&
              this.excepcionWsaa.equals(other.getExcepcionWsaa()))) &&
            ((this.excepcionWsfev1==null && other.getExcepcionWsfev1()==null) || 
             (this.excepcionWsfev1!=null &&
              this.excepcionWsfev1.equals(other.getExcepcionWsfev1()))) &&
            ((this.fechaVencimiento==null && other.getFechaVencimiento()==null) || 
             (this.fechaVencimiento!=null &&
              this.fechaVencimiento.equals(other.getFechaVencimiento()))) &&
            ((this.obs==null && other.getObs()==null) || 
             (this.obs!=null &&
              this.obs.equals(other.getObs()))) &&
            ((this.resultado==null && other.getResultado()==null) || 
             (this.resultado!=null &&
              this.resultado.equals(other.getResultado()))) &&
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
        if (getCae() != null) {
            _hashCode += getCae().hashCode();
        }
        if (getErrMsg() != null) {
            _hashCode += getErrMsg().hashCode();
        }
        if (getExcepcionWsaa() != null) {
            _hashCode += getExcepcionWsaa().hashCode();
        }
        if (getExcepcionWsfev1() != null) {
            _hashCode += getExcepcionWsfev1().hashCode();
        }
        if (getFechaVencimiento() != null) {
            _hashCode += getFechaVencimiento().hashCode();
        }
        if (getObs() != null) {
            _hashCode += getObs().hashCode();
        }
        if (getResultado() != null) {
            _hashCode += getResultado().hashCode();
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
        new org.apache.axis.description.TypeDesc(ResponseActualizarItemComprobante.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://response.model.rest.doconline.coninf.com.ar/xsd", "ResponseActualizarItemComprobante"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cae");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.model.rest.doconline.coninf.com.ar/xsd", "cae"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("fechaVencimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.model.rest.doconline.coninf.com.ar/xsd", "fechaVencimiento"));
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
        elemField.setFieldName("resultado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.model.rest.doconline.coninf.com.ar/xsd", "resultado"));
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
