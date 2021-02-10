/**
 * ResponseConsultarComprobante.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ar.com.coninf.doconline.rest.model.response.xsd;

public class ResponseConsultarComprobante  extends ar.com.coninf.doconline.rest.model.response.xsd.Response  implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private java.lang.String cae;

    private java.lang.String errMsg;

    private java.lang.String excepcionWsaa;

    private java.lang.String excepcionWsfev1;

    private java.lang.String fechaCbte;

    private java.lang.String fechaVencimiento;

    private java.lang.String impTotal;

    private java.lang.String obs;

    private java.lang.String xmlRequest;

    private java.lang.String xmlResponse;

    public ResponseConsultarComprobante() {
    }

    public ResponseConsultarComprobante(
           java.lang.Integer codigo,
           java.lang.String descripcion,
           java.lang.Boolean esReintento,
           java.lang.String observacion,
           java.lang.String cae,
           java.lang.String errMsg,
           java.lang.String excepcionWsaa,
           java.lang.String excepcionWsfev1,
           java.lang.String fechaCbte,
           java.lang.String fechaVencimiento,
           java.lang.String impTotal,
           java.lang.String obs,
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
        this.fechaCbte = fechaCbte;
        this.fechaVencimiento = fechaVencimiento;
        this.impTotal = impTotal;
        this.obs = obs;
        this.xmlRequest = xmlRequest;
        this.xmlResponse = xmlResponse;
    }


    /**
     * Gets the cae value for this ResponseConsultarComprobante.
     * 
     * @return cae
     */
    public java.lang.String getCae() {
        return cae;
    }


    /**
     * Sets the cae value for this ResponseConsultarComprobante.
     * 
     * @param cae
     */
    public void setCae(java.lang.String cae) {
        this.cae = cae;
    }


    /**
     * Gets the errMsg value for this ResponseConsultarComprobante.
     * 
     * @return errMsg
     */
    public java.lang.String getErrMsg() {
        return errMsg;
    }


    /**
     * Sets the errMsg value for this ResponseConsultarComprobante.
     * 
     * @param errMsg
     */
    public void setErrMsg(java.lang.String errMsg) {
        this.errMsg = errMsg;
    }


    /**
     * Gets the excepcionWsaa value for this ResponseConsultarComprobante.
     * 
     * @return excepcionWsaa
     */
    public java.lang.String getExcepcionWsaa() {
        return excepcionWsaa;
    }


    /**
     * Sets the excepcionWsaa value for this ResponseConsultarComprobante.
     * 
     * @param excepcionWsaa
     */
    public void setExcepcionWsaa(java.lang.String excepcionWsaa) {
        this.excepcionWsaa = excepcionWsaa;
    }


    /**
     * Gets the excepcionWsfev1 value for this ResponseConsultarComprobante.
     * 
     * @return excepcionWsfev1
     */
    public java.lang.String getExcepcionWsfev1() {
        return excepcionWsfev1;
    }


    /**
     * Sets the excepcionWsfev1 value for this ResponseConsultarComprobante.
     * 
     * @param excepcionWsfev1
     */
    public void setExcepcionWsfev1(java.lang.String excepcionWsfev1) {
        this.excepcionWsfev1 = excepcionWsfev1;
    }


    /**
     * Gets the fechaCbte value for this ResponseConsultarComprobante.
     * 
     * @return fechaCbte
     */
    public java.lang.String getFechaCbte() {
        return fechaCbte;
    }


    /**
     * Sets the fechaCbte value for this ResponseConsultarComprobante.
     * 
     * @param fechaCbte
     */
    public void setFechaCbte(java.lang.String fechaCbte) {
        this.fechaCbte = fechaCbte;
    }


    /**
     * Gets the fechaVencimiento value for this ResponseConsultarComprobante.
     * 
     * @return fechaVencimiento
     */
    public java.lang.String getFechaVencimiento() {
        return fechaVencimiento;
    }


    /**
     * Sets the fechaVencimiento value for this ResponseConsultarComprobante.
     * 
     * @param fechaVencimiento
     */
    public void setFechaVencimiento(java.lang.String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }


    /**
     * Gets the impTotal value for this ResponseConsultarComprobante.
     * 
     * @return impTotal
     */
    public java.lang.String getImpTotal() {
        return impTotal;
    }


    /**
     * Sets the impTotal value for this ResponseConsultarComprobante.
     * 
     * @param impTotal
     */
    public void setImpTotal(java.lang.String impTotal) {
        this.impTotal = impTotal;
    }


    /**
     * Gets the obs value for this ResponseConsultarComprobante.
     * 
     * @return obs
     */
    public java.lang.String getObs() {
        return obs;
    }


    /**
     * Sets the obs value for this ResponseConsultarComprobante.
     * 
     * @param obs
     */
    public void setObs(java.lang.String obs) {
        this.obs = obs;
    }


    /**
     * Gets the xmlRequest value for this ResponseConsultarComprobante.
     * 
     * @return xmlRequest
     */
    public java.lang.String getXmlRequest() {
        return xmlRequest;
    }


    /**
     * Sets the xmlRequest value for this ResponseConsultarComprobante.
     * 
     * @param xmlRequest
     */
    public void setXmlRequest(java.lang.String xmlRequest) {
        this.xmlRequest = xmlRequest;
    }


    /**
     * Gets the xmlResponse value for this ResponseConsultarComprobante.
     * 
     * @return xmlResponse
     */
    public java.lang.String getXmlResponse() {
        return xmlResponse;
    }


    /**
     * Sets the xmlResponse value for this ResponseConsultarComprobante.
     * 
     * @param xmlResponse
     */
    public void setXmlResponse(java.lang.String xmlResponse) {
        this.xmlResponse = xmlResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponseConsultarComprobante)) return false;
        ResponseConsultarComprobante other = (ResponseConsultarComprobante) obj;
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
            ((this.fechaCbte==null && other.getFechaCbte()==null) || 
             (this.fechaCbte!=null &&
              this.fechaCbte.equals(other.getFechaCbte()))) &&
            ((this.fechaVencimiento==null && other.getFechaVencimiento()==null) || 
             (this.fechaVencimiento!=null &&
              this.fechaVencimiento.equals(other.getFechaVencimiento()))) &&
            ((this.impTotal==null && other.getImpTotal()==null) || 
             (this.impTotal!=null &&
              this.impTotal.equals(other.getImpTotal()))) &&
            ((this.obs==null && other.getObs()==null) || 
             (this.obs!=null &&
              this.obs.equals(other.getObs()))) &&
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
        if (getFechaCbte() != null) {
            _hashCode += getFechaCbte().hashCode();
        }
        if (getFechaVencimiento() != null) {
            _hashCode += getFechaVencimiento().hashCode();
        }
        if (getImpTotal() != null) {
            _hashCode += getImpTotal().hashCode();
        }
        if (getObs() != null) {
            _hashCode += getObs().hashCode();
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
        new org.apache.axis.description.TypeDesc(ResponseConsultarComprobante.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://response.model.rest.doconline.coninf.com.ar/xsd", "ResponseConsultarComprobante"));
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
        elemField.setFieldName("fechaCbte");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.model.rest.doconline.coninf.com.ar/xsd", "fechaCbte"));
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
        elemField.setFieldName("impTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.model.rest.doconline.coninf.com.ar/xsd", "impTotal"));
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
