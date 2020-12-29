/**
 * Tributo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ar.com.coninf.doconline.rest.model.tx.xsd;

public class Tributo  implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.math.BigDecimal tributoAlic;

    private java.math.BigDecimal tributoBaseImp;

    private java.lang.String tributoDesc;

    private java.lang.Integer tributoId;

    private java.math.BigDecimal tributoImporte;

    public Tributo() {
    }

    public Tributo(
           java.math.BigDecimal tributoAlic,
           java.math.BigDecimal tributoBaseImp,
           java.lang.String tributoDesc,
           java.lang.Integer tributoId,
           java.math.BigDecimal tributoImporte) {
           this.tributoAlic = tributoAlic;
           this.tributoBaseImp = tributoBaseImp;
           this.tributoDesc = tributoDesc;
           this.tributoId = tributoId;
           this.tributoImporte = tributoImporte;
    }


    /**
     * Gets the tributoAlic value for this Tributo.
     * 
     * @return tributoAlic
     */
    public java.math.BigDecimal getTributoAlic() {
        return tributoAlic;
    }


    /**
     * Sets the tributoAlic value for this Tributo.
     * 
     * @param tributoAlic
     */
    public void setTributoAlic(java.math.BigDecimal tributoAlic) {
        this.tributoAlic = tributoAlic;
    }


    /**
     * Gets the tributoBaseImp value for this Tributo.
     * 
     * @return tributoBaseImp
     */
    public java.math.BigDecimal getTributoBaseImp() {
        return tributoBaseImp;
    }


    /**
     * Sets the tributoBaseImp value for this Tributo.
     * 
     * @param tributoBaseImp
     */
    public void setTributoBaseImp(java.math.BigDecimal tributoBaseImp) {
        this.tributoBaseImp = tributoBaseImp;
    }


    /**
     * Gets the tributoDesc value for this Tributo.
     * 
     * @return tributoDesc
     */
    public java.lang.String getTributoDesc() {
        return tributoDesc;
    }


    /**
     * Sets the tributoDesc value for this Tributo.
     * 
     * @param tributoDesc
     */
    public void setTributoDesc(java.lang.String tributoDesc) {
        this.tributoDesc = tributoDesc;
    }


    /**
     * Gets the tributoId value for this Tributo.
     * 
     * @return tributoId
     */
    public java.lang.Integer getTributoId() {
        return tributoId;
    }


    /**
     * Sets the tributoId value for this Tributo.
     * 
     * @param tributoId
     */
    public void setTributoId(java.lang.Integer tributoId) {
        this.tributoId = tributoId;
    }


    /**
     * Gets the tributoImporte value for this Tributo.
     * 
     * @return tributoImporte
     */
    public java.math.BigDecimal getTributoImporte() {
        return tributoImporte;
    }


    /**
     * Sets the tributoImporte value for this Tributo.
     * 
     * @param tributoImporte
     */
    public void setTributoImporte(java.math.BigDecimal tributoImporte) {
        this.tributoImporte = tributoImporte;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Tributo)) return false;
        Tributo other = (Tributo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tributoAlic==null && other.getTributoAlic()==null) || 
             (this.tributoAlic!=null &&
              this.tributoAlic.equals(other.getTributoAlic()))) &&
            ((this.tributoBaseImp==null && other.getTributoBaseImp()==null) || 
             (this.tributoBaseImp!=null &&
              this.tributoBaseImp.equals(other.getTributoBaseImp()))) &&
            ((this.tributoDesc==null && other.getTributoDesc()==null) || 
             (this.tributoDesc!=null &&
              this.tributoDesc.equals(other.getTributoDesc()))) &&
            ((this.tributoId==null && other.getTributoId()==null) || 
             (this.tributoId!=null &&
              this.tributoId.equals(other.getTributoId()))) &&
            ((this.tributoImporte==null && other.getTributoImporte()==null) || 
             (this.tributoImporte!=null &&
              this.tributoImporte.equals(other.getTributoImporte())));
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
        if (getTributoAlic() != null) {
            _hashCode += getTributoAlic().hashCode();
        }
        if (getTributoBaseImp() != null) {
            _hashCode += getTributoBaseImp().hashCode();
        }
        if (getTributoDesc() != null) {
            _hashCode += getTributoDesc().hashCode();
        }
        if (getTributoId() != null) {
            _hashCode += getTributoId().hashCode();
        }
        if (getTributoImporte() != null) {
            _hashCode += getTributoImporte().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Tributo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tx.model.rest.doconline.coninf.com.ar/xsd", "Tributo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tributoAlic");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tx.model.rest.doconline.coninf.com.ar/xsd", "tributoAlic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tributoBaseImp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tx.model.rest.doconline.coninf.com.ar/xsd", "tributoBaseImp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tributoDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tx.model.rest.doconline.coninf.com.ar/xsd", "tributoDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tributoId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tx.model.rest.doconline.coninf.com.ar/xsd", "tributoId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tributoImporte");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tx.model.rest.doconline.coninf.com.ar/xsd", "tributoImporte"));
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
