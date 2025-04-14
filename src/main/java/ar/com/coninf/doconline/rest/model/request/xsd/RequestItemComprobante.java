/**
 * RequestItemComprobante.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ar.com.coninf.doconline.rest.model.request.xsd;

public class RequestItemComprobante  extends ar.com.coninf.doconline.rest.model.request.xsd.Request  implements java.io.Serializable {
    private java.lang.Integer concepto;

    private java.lang.String cuit;

    private java.lang.String fechaCbte;

    private java.lang.String fechaServDesde;

    private java.lang.String fechaServHasta;

    private java.lang.String fechaVencPago;

    private java.math.BigDecimal impIva;

    private java.math.BigDecimal impNeto;

    private java.math.BigDecimal impOpEx;

    private java.math.BigDecimal impTotConcNoGrav;

    private java.math.BigDecimal impTotal;

    private java.math.BigDecimal impTrib;

    private ar.com.coninf.doconline.rest.model.tx.xsd.Iva[] ivas;

    private java.math.BigDecimal monedaCtz;

    private java.lang.String monedaId;

    private java.lang.Long nroCbte;

    private java.lang.Long nroDoc;

    private java.lang.Integer ptoVta;

    private java.lang.Integer tipoCbte;

    private java.lang.Integer tipoDoc;

    private ar.com.coninf.doconline.rest.model.tx.xsd.Tributo[] tributos;

    public RequestItemComprobante() {
    }

    public RequestItemComprobante(
           ar.com.coninf.doconline.rest.model.tx.xsd.ControlTransaccion controlTransaccion,
           java.lang.Integer concepto,
           java.lang.String cuit,
           java.lang.String fechaCbte,
           java.lang.String fechaServDesde,
           java.lang.String fechaServHasta,
           java.lang.String fechaVencPago,
           java.math.BigDecimal impIva,
           java.math.BigDecimal impNeto,
           java.math.BigDecimal impOpEx,
           java.math.BigDecimal impTotConcNoGrav,
           java.math.BigDecimal impTotal,
           java.math.BigDecimal impTrib,
           ar.com.coninf.doconline.rest.model.tx.xsd.Iva[] ivas,
           java.math.BigDecimal monedaCtz,
           java.lang.String monedaId,
           java.lang.Long nroCbte,
           java.lang.Long nroDoc,
           java.lang.Integer ptoVta,
           java.lang.Integer tipoCbte,
           java.lang.Integer tipoDoc,
           ar.com.coninf.doconline.rest.model.tx.xsd.Tributo[] tributos) {
        super(
            controlTransaccion);
        this.concepto = concepto;
        this.cuit = cuit;
        this.fechaCbte = fechaCbte;
        this.fechaServDesde = fechaServDesde;
        this.fechaServHasta = fechaServHasta;
        this.fechaVencPago = fechaVencPago;
        this.impIva = impIva;
        this.impNeto = impNeto;
        this.impOpEx = impOpEx;
        this.impTotConcNoGrav = impTotConcNoGrav;
        this.impTotal = impTotal;
        this.impTrib = impTrib;
        this.ivas = ivas;
        this.monedaCtz = monedaCtz;
        this.monedaId = monedaId;
        this.nroCbte = nroCbte;
        this.nroDoc = nroDoc;
        this.ptoVta = ptoVta;
        this.tipoCbte = tipoCbte;
        this.tipoDoc = tipoDoc;
        this.tributos = tributos;
    }


    /**
     * Gets the concepto value for this RequestItemComprobante.
     * 
     * @return concepto
     */
    public java.lang.Integer getConcepto() {
        return concepto;
    }


    /**
     * Sets the concepto value for this RequestItemComprobante.
     * 
     * @param concepto
     */
    public void setConcepto(java.lang.Integer concepto) {
        this.concepto = concepto;
    }


    /**
     * Gets the cuit value for this RequestItemComprobante.
     * 
     * @return cuit
     */
    public java.lang.String getCuit() {
        return cuit;
    }


    /**
     * Sets the cuit value for this RequestItemComprobante.
     * 
     * @param cuit
     */
    public void setCuit(java.lang.String cuit) {
        this.cuit = cuit;
    }


    /**
     * Gets the fechaCbte value for this RequestItemComprobante.
     * 
     * @return fechaCbte
     */
    public java.lang.String getFechaCbte() {
        return fechaCbte;
    }


    /**
     * Sets the fechaCbte value for this RequestItemComprobante.
     * 
     * @param fechaCbte
     */
    public void setFechaCbte(java.lang.String fechaCbte) {
        this.fechaCbte = fechaCbte;
    }


    /**
     * Gets the fechaServDesde value for this RequestItemComprobante.
     * 
     * @return fechaServDesde
     */
    public java.lang.String getFechaServDesde() {
        return fechaServDesde;
    }


    /**
     * Sets the fechaServDesde value for this RequestItemComprobante.
     * 
     * @param fechaServDesde
     */
    public void setFechaServDesde(java.lang.String fechaServDesde) {
        this.fechaServDesde = fechaServDesde;
    }


    /**
     * Gets the fechaServHasta value for this RequestItemComprobante.
     * 
     * @return fechaServHasta
     */
    public java.lang.String getFechaServHasta() {
        return fechaServHasta;
    }


    /**
     * Sets the fechaServHasta value for this RequestItemComprobante.
     * 
     * @param fechaServHasta
     */
    public void setFechaServHasta(java.lang.String fechaServHasta) {
        this.fechaServHasta = fechaServHasta;
    }


    /**
     * Gets the fechaVencPago value for this RequestItemComprobante.
     * 
     * @return fechaVencPago
     */
    public java.lang.String getFechaVencPago() {
        return fechaVencPago;
    }


    /**
     * Sets the fechaVencPago value for this RequestItemComprobante.
     * 
     * @param fechaVencPago
     */
    public void setFechaVencPago(java.lang.String fechaVencPago) {
        this.fechaVencPago = fechaVencPago;
    }


    /**
     * Gets the impIva value for this RequestItemComprobante.
     * 
     * @return impIva
     */
    public java.math.BigDecimal getImpIva() {
        return impIva;
    }


    /**
     * Sets the impIva value for this RequestItemComprobante.
     * 
     * @param impIva
     */
    public void setImpIva(java.math.BigDecimal impIva) {
        this.impIva = impIva;
    }


    /**
     * Gets the impNeto value for this RequestItemComprobante.
     * 
     * @return impNeto
     */
    public java.math.BigDecimal getImpNeto() {
        return impNeto;
    }


    /**
     * Sets the impNeto value for this RequestItemComprobante.
     * 
     * @param impNeto
     */
    public void setImpNeto(java.math.BigDecimal impNeto) {
        this.impNeto = impNeto;
    }


    /**
     * Gets the impOpEx value for this RequestItemComprobante.
     * 
     * @return impOpEx
     */
    public java.math.BigDecimal getImpOpEx() {
        return impOpEx;
    }


    /**
     * Sets the impOpEx value for this RequestItemComprobante.
     * 
     * @param impOpEx
     */
    public void setImpOpEx(java.math.BigDecimal impOpEx) {
        this.impOpEx = impOpEx;
    }


    /**
     * Gets the impTotConcNoGrav value for this RequestItemComprobante.
     * 
     * @return impTotConcNoGrav
     */
    public java.math.BigDecimal getImpTotConcNoGrav() {
        return impTotConcNoGrav;
    }


    /**
     * Sets the impTotConcNoGrav value for this RequestItemComprobante.
     * 
     * @param impTotConcNoGrav
     */
    public void setImpTotConcNoGrav(java.math.BigDecimal impTotConcNoGrav) {
        this.impTotConcNoGrav = impTotConcNoGrav;
    }


    /**
     * Gets the impTotal value for this RequestItemComprobante.
     * 
     * @return impTotal
     */
    public java.math.BigDecimal getImpTotal() {
        return impTotal;
    }


    /**
     * Sets the impTotal value for this RequestItemComprobante.
     * 
     * @param impTotal
     */
    public void setImpTotal(java.math.BigDecimal impTotal) {
        this.impTotal = impTotal;
    }


    /**
     * Gets the impTrib value for this RequestItemComprobante.
     * 
     * @return impTrib
     */
    public java.math.BigDecimal getImpTrib() {
        return impTrib;
    }


    /**
     * Sets the impTrib value for this RequestItemComprobante.
     * 
     * @param impTrib
     */
    public void setImpTrib(java.math.BigDecimal impTrib) {
        this.impTrib = impTrib;
    }


    /**
     * Gets the ivas value for this RequestItemComprobante.
     * 
     * @return ivas
     */
    public ar.com.coninf.doconline.rest.model.tx.xsd.Iva[] getIvas() {
        return ivas;
    }


    /**
     * Sets the ivas value for this RequestItemComprobante.
     * 
     * @param ivas
     */
    public void setIvas(ar.com.coninf.doconline.rest.model.tx.xsd.Iva[] ivas) {
        this.ivas = ivas;
    }

    public ar.com.coninf.doconline.rest.model.tx.xsd.Iva getIvas(int i) {
        return this.ivas[i];
    }

    public void setIvas(int i, ar.com.coninf.doconline.rest.model.tx.xsd.Iva _value) {
        this.ivas[i] = _value;
    }


    /**
     * Gets the monedaCtz value for this RequestItemComprobante.
     * 
     * @return monedaCtz
     */
    public java.math.BigDecimal getMonedaCtz() {
        return monedaCtz;
    }


    /**
     * Sets the monedaCtz value for this RequestItemComprobante.
     * 
     * @param monedaCtz
     */
    public void setMonedaCtz(java.math.BigDecimal monedaCtz) {
        this.monedaCtz = monedaCtz;
    }


    /**
     * Gets the monedaId value for this RequestItemComprobante.
     * 
     * @return monedaId
     */
    public java.lang.String getMonedaId() {
        return monedaId;
    }


    /**
     * Sets the monedaId value for this RequestItemComprobante.
     * 
     * @param monedaId
     */
    public void setMonedaId(java.lang.String monedaId) {
        this.monedaId = monedaId;
    }


    /**
     * Gets the nroCbte value for this RequestItemComprobante.
     * 
     * @return nroCbte
     */
    public java.lang.Long getNroCbte() {
        return nroCbte;
    }


    /**
     * Sets the nroCbte value for this RequestItemComprobante.
     * 
     * @param nroCbte
     */
    public void setNroCbte(java.lang.Long nroCbte) {
        this.nroCbte = nroCbte;
    }


    /**
     * Gets the nroDoc value for this RequestItemComprobante.
     * 
     * @return nroDoc
     */
    public java.lang.Long getNroDoc() {
        return nroDoc;
    }


    /**
     * Sets the nroDoc value for this RequestItemComprobante.
     * 
     * @param nroDoc
     */
    public void setNroDoc(java.lang.Long nroDoc) {
        this.nroDoc = nroDoc;
    }


    /**
     * Gets the ptoVta value for this RequestItemComprobante.
     * 
     * @return ptoVta
     */
    public java.lang.Integer getPtoVta() {
        return ptoVta;
    }


    /**
     * Sets the ptoVta value for this RequestItemComprobante.
     * 
     * @param ptoVta
     */
    public void setPtoVta(java.lang.Integer ptoVta) {
        this.ptoVta = ptoVta;
    }


    /**
     * Gets the tipoCbte value for this RequestItemComprobante.
     * 
     * @return tipoCbte
     */
    public java.lang.Integer getTipoCbte() {
        return tipoCbte;
    }


    /**
     * Sets the tipoCbte value for this RequestItemComprobante.
     * 
     * @param tipoCbte
     */
    public void setTipoCbte(java.lang.Integer tipoCbte) {
        this.tipoCbte = tipoCbte;
    }


    /**
     * Gets the tipoDoc value for this RequestItemComprobante.
     * 
     * @return tipoDoc
     */
    public java.lang.Integer getTipoDoc() {
        return tipoDoc;
    }


    /**
     * Sets the tipoDoc value for this RequestItemComprobante.
     * 
     * @param tipoDoc
     */
    public void setTipoDoc(java.lang.Integer tipoDoc) {
        this.tipoDoc = tipoDoc;
    }


    /**
     * Gets the tributos value for this RequestItemComprobante.
     * 
     * @return tributos
     */
    public ar.com.coninf.doconline.rest.model.tx.xsd.Tributo[] getTributos() {
        return tributos;
    }


    /**
     * Sets the tributos value for this RequestItemComprobante.
     * 
     * @param tributos
     */
    public void setTributos(ar.com.coninf.doconline.rest.model.tx.xsd.Tributo[] tributos) {
        this.tributos = tributos;
    }

    public ar.com.coninf.doconline.rest.model.tx.xsd.Tributo getTributos(int i) {
        return this.tributos[i];
    }

    public void setTributos(int i, ar.com.coninf.doconline.rest.model.tx.xsd.Tributo _value) {
        this.tributos[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestItemComprobante)) return false;
        RequestItemComprobante other = (RequestItemComprobante) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.concepto==null && other.getConcepto()==null) || 
             (this.concepto!=null &&
              this.concepto.equals(other.getConcepto()))) &&
            ((this.cuit==null && other.getCuit()==null) || 
             (this.cuit!=null &&
              this.cuit.equals(other.getCuit()))) &&
            ((this.fechaCbte==null && other.getFechaCbte()==null) || 
             (this.fechaCbte!=null &&
              this.fechaCbte.equals(other.getFechaCbte()))) &&
            ((this.fechaServDesde==null && other.getFechaServDesde()==null) || 
             (this.fechaServDesde!=null &&
              this.fechaServDesde.equals(other.getFechaServDesde()))) &&
            ((this.fechaServHasta==null && other.getFechaServHasta()==null) || 
             (this.fechaServHasta!=null &&
              this.fechaServHasta.equals(other.getFechaServHasta()))) &&
            ((this.fechaVencPago==null && other.getFechaVencPago()==null) || 
             (this.fechaVencPago!=null &&
              this.fechaVencPago.equals(other.getFechaVencPago()))) &&
            ((this.impIva==null && other.getImpIva()==null) || 
             (this.impIva!=null &&
              this.impIva.equals(other.getImpIva()))) &&
            ((this.impNeto==null && other.getImpNeto()==null) || 
             (this.impNeto!=null &&
              this.impNeto.equals(other.getImpNeto()))) &&
            ((this.impOpEx==null && other.getImpOpEx()==null) || 
             (this.impOpEx!=null &&
              this.impOpEx.equals(other.getImpOpEx()))) &&
            ((this.impTotConcNoGrav==null && other.getImpTotConcNoGrav()==null) || 
             (this.impTotConcNoGrav!=null &&
              this.impTotConcNoGrav.equals(other.getImpTotConcNoGrav()))) &&
            ((this.impTotal==null && other.getImpTotal()==null) || 
             (this.impTotal!=null &&
              this.impTotal.equals(other.getImpTotal()))) &&
            ((this.impTrib==null && other.getImpTrib()==null) || 
             (this.impTrib!=null &&
              this.impTrib.equals(other.getImpTrib()))) &&
            ((this.ivas==null && other.getIvas()==null) || 
             (this.ivas!=null &&
              java.util.Arrays.equals(this.ivas, other.getIvas()))) &&
            ((this.monedaCtz==null && other.getMonedaCtz()==null) || 
             (this.monedaCtz!=null &&
              this.monedaCtz.equals(other.getMonedaCtz()))) &&
            ((this.monedaId==null && other.getMonedaId()==null) || 
             (this.monedaId!=null &&
              this.monedaId.equals(other.getMonedaId()))) &&
            ((this.nroCbte==null && other.getNroCbte()==null) || 
             (this.nroCbte!=null &&
              this.nroCbte.equals(other.getNroCbte()))) &&
            ((this.nroDoc==null && other.getNroDoc()==null) || 
             (this.nroDoc!=null &&
              this.nroDoc.equals(other.getNroDoc()))) &&
            ((this.ptoVta==null && other.getPtoVta()==null) || 
             (this.ptoVta!=null &&
              this.ptoVta.equals(other.getPtoVta()))) &&
            ((this.tipoCbte==null && other.getTipoCbte()==null) || 
             (this.tipoCbte!=null &&
              this.tipoCbte.equals(other.getTipoCbte()))) &&
            ((this.tipoDoc==null && other.getTipoDoc()==null) || 
             (this.tipoDoc!=null &&
              this.tipoDoc.equals(other.getTipoDoc()))) &&
            ((this.tributos==null && other.getTributos()==null) || 
             (this.tributos!=null &&
              java.util.Arrays.equals(this.tributos, other.getTributos())));
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
        if (getConcepto() != null) {
            _hashCode += getConcepto().hashCode();
        }
        if (getCuit() != null) {
            _hashCode += getCuit().hashCode();
        }
        if (getFechaCbte() != null) {
            _hashCode += getFechaCbte().hashCode();
        }
        if (getFechaServDesde() != null) {
            _hashCode += getFechaServDesde().hashCode();
        }
        if (getFechaServHasta() != null) {
            _hashCode += getFechaServHasta().hashCode();
        }
        if (getFechaVencPago() != null) {
            _hashCode += getFechaVencPago().hashCode();
        }
        if (getImpIva() != null) {
            _hashCode += getImpIva().hashCode();
        }
        if (getImpNeto() != null) {
            _hashCode += getImpNeto().hashCode();
        }
        if (getImpOpEx() != null) {
            _hashCode += getImpOpEx().hashCode();
        }
        if (getImpTotConcNoGrav() != null) {
            _hashCode += getImpTotConcNoGrav().hashCode();
        }
        if (getImpTotal() != null) {
            _hashCode += getImpTotal().hashCode();
        }
        if (getImpTrib() != null) {
            _hashCode += getImpTrib().hashCode();
        }
        if (getIvas() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIvas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIvas(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMonedaCtz() != null) {
            _hashCode += getMonedaCtz().hashCode();
        }
        if (getMonedaId() != null) {
            _hashCode += getMonedaId().hashCode();
        }
        if (getNroCbte() != null) {
            _hashCode += getNroCbte().hashCode();
        }
        if (getNroDoc() != null) {
            _hashCode += getNroDoc().hashCode();
        }
        if (getPtoVta() != null) {
            _hashCode += getPtoVta().hashCode();
        }
        if (getTipoCbte() != null) {
            _hashCode += getTipoCbte().hashCode();
        }
        if (getTipoDoc() != null) {
            _hashCode += getTipoDoc().hashCode();
        }
        if (getTributos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTributos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTributos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestItemComprobante.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://request.model.rest.doconline.coninf.com.ar/xsd", "RequestItemComprobante"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concepto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.model.rest.doconline.coninf.com.ar/xsd", "concepto"));
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
        elemField.setFieldName("fechaCbte");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.model.rest.doconline.coninf.com.ar/xsd", "fechaCbte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaServDesde");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.model.rest.doconline.coninf.com.ar/xsd", "fechaServDesde"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaServHasta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.model.rest.doconline.coninf.com.ar/xsd", "fechaServHasta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaVencPago");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.model.rest.doconline.coninf.com.ar/xsd", "fechaVencPago"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impIva");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.model.rest.doconline.coninf.com.ar/xsd", "impIva"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impNeto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.model.rest.doconline.coninf.com.ar/xsd", "impNeto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impOpEx");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.model.rest.doconline.coninf.com.ar/xsd", "impOpEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impTotConcNoGrav");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.model.rest.doconline.coninf.com.ar/xsd", "impTotConcNoGrav"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.model.rest.doconline.coninf.com.ar/xsd", "impTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impTrib");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.model.rest.doconline.coninf.com.ar/xsd", "impTrib"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ivas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.model.rest.doconline.coninf.com.ar/xsd", "ivas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tx.model.rest.doconline.coninf.com.ar/xsd", "Iva"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monedaCtz");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.model.rest.doconline.coninf.com.ar/xsd", "monedaCtz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monedaId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.model.rest.doconline.coninf.com.ar/xsd", "monedaId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroCbte");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.model.rest.doconline.coninf.com.ar/xsd", "nroCbte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroDoc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.model.rest.doconline.coninf.com.ar/xsd", "nroDoc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoDoc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.model.rest.doconline.coninf.com.ar/xsd", "tipoDoc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tributos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.model.rest.doconline.coninf.com.ar/xsd", "tributos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tx.model.rest.doconline.coninf.com.ar/xsd", "Tributo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
