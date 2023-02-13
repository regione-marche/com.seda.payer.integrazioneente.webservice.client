/**
 * RecordRiepilogoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.integrazioneente.webservice.dati;

public class RecordRiepilogoType  implements java.io.Serializable {
    private java.lang.String codiceCUAS;

    private java.lang.String numeroCCbeneficiario;

    /* data contabile AAMMGG */
    private java.lang.String dataContabileAccredito;

    private int identificativo;

    private int totaleDocumenti;

    private java.math.BigDecimal importoTotali;

    private int totaleDocumentiEsatti;

    private java.math.BigDecimal importoTotaliEsatti;

    private int totaleDocumentiErrati;

    private java.math.BigDecimal importoTotaliErrati;

    public RecordRiepilogoType() {
    }

    public RecordRiepilogoType(
           java.lang.String codiceCUAS,
           java.lang.String numeroCCbeneficiario,
           java.lang.String dataContabileAccredito,
           int identificativo,
           int totaleDocumenti,
           java.math.BigDecimal importoTotali,
           int totaleDocumentiEsatti,
           java.math.BigDecimal importoTotaliEsatti,
           int totaleDocumentiErrati,
           java.math.BigDecimal importoTotaliErrati) {
           this.codiceCUAS = codiceCUAS;
           this.numeroCCbeneficiario = numeroCCbeneficiario;
           this.dataContabileAccredito = dataContabileAccredito;
           this.identificativo = identificativo;
           this.totaleDocumenti = totaleDocumenti;
           this.importoTotali = importoTotali;
           this.totaleDocumentiEsatti = totaleDocumentiEsatti;
           this.importoTotaliEsatti = importoTotaliEsatti;
           this.totaleDocumentiErrati = totaleDocumentiErrati;
           this.importoTotaliErrati = importoTotaliErrati;
    }


    /**
     * Gets the codiceCUAS value for this RecordRiepilogoType.
     * 
     * @return codiceCUAS
     */
    public java.lang.String getCodiceCUAS() {
        return codiceCUAS;
    }


    /**
     * Sets the codiceCUAS value for this RecordRiepilogoType.
     * 
     * @param codiceCUAS
     */
    public void setCodiceCUAS(java.lang.String codiceCUAS) {
        this.codiceCUAS = codiceCUAS;
    }


    /**
     * Gets the numeroCCbeneficiario value for this RecordRiepilogoType.
     * 
     * @return numeroCCbeneficiario
     */
    public java.lang.String getNumeroCCbeneficiario() {
        return numeroCCbeneficiario;
    }


    /**
     * Sets the numeroCCbeneficiario value for this RecordRiepilogoType.
     * 
     * @param numeroCCbeneficiario
     */
    public void setNumeroCCbeneficiario(java.lang.String numeroCCbeneficiario) {
        this.numeroCCbeneficiario = numeroCCbeneficiario;
    }


    /**
     * Gets the dataContabileAccredito value for this RecordRiepilogoType.
     * 
     * @return dataContabileAccredito   * data contabile AAMMGG
     */
    public java.lang.String getDataContabileAccredito() {
        return dataContabileAccredito;
    }


    /**
     * Sets the dataContabileAccredito value for this RecordRiepilogoType.
     * 
     * @param dataContabileAccredito   * data contabile AAMMGG
     */
    public void setDataContabileAccredito(java.lang.String dataContabileAccredito) {
        this.dataContabileAccredito = dataContabileAccredito;
    }


    /**
     * Gets the identificativo value for this RecordRiepilogoType.
     * 
     * @return identificativo
     */
    public int getIdentificativo() {
        return identificativo;
    }


    /**
     * Sets the identificativo value for this RecordRiepilogoType.
     * 
     * @param identificativo
     */
    public void setIdentificativo(int identificativo) {
        this.identificativo = identificativo;
    }


    /**
     * Gets the totaleDocumenti value for this RecordRiepilogoType.
     * 
     * @return totaleDocumenti
     */
    public int getTotaleDocumenti() {
        return totaleDocumenti;
    }


    /**
     * Sets the totaleDocumenti value for this RecordRiepilogoType.
     * 
     * @param totaleDocumenti
     */
    public void setTotaleDocumenti(int totaleDocumenti) {
        this.totaleDocumenti = totaleDocumenti;
    }


    /**
     * Gets the importoTotali value for this RecordRiepilogoType.
     * 
     * @return importoTotali
     */
    public java.math.BigDecimal getImportoTotali() {
        return importoTotali;
    }


    /**
     * Sets the importoTotali value for this RecordRiepilogoType.
     * 
     * @param importoTotali
     */
    public void setImportoTotali(java.math.BigDecimal importoTotali) {
        this.importoTotali = importoTotali;
    }


    /**
     * Gets the totaleDocumentiEsatti value for this RecordRiepilogoType.
     * 
     * @return totaleDocumentiEsatti
     */
    public int getTotaleDocumentiEsatti() {
        return totaleDocumentiEsatti;
    }


    /**
     * Sets the totaleDocumentiEsatti value for this RecordRiepilogoType.
     * 
     * @param totaleDocumentiEsatti
     */
    public void setTotaleDocumentiEsatti(int totaleDocumentiEsatti) {
        this.totaleDocumentiEsatti = totaleDocumentiEsatti;
    }


    /**
     * Gets the importoTotaliEsatti value for this RecordRiepilogoType.
     * 
     * @return importoTotaliEsatti
     */
    public java.math.BigDecimal getImportoTotaliEsatti() {
        return importoTotaliEsatti;
    }


    /**
     * Sets the importoTotaliEsatti value for this RecordRiepilogoType.
     * 
     * @param importoTotaliEsatti
     */
    public void setImportoTotaliEsatti(java.math.BigDecimal importoTotaliEsatti) {
        this.importoTotaliEsatti = importoTotaliEsatti;
    }


    /**
     * Gets the totaleDocumentiErrati value for this RecordRiepilogoType.
     * 
     * @return totaleDocumentiErrati
     */
    public int getTotaleDocumentiErrati() {
        return totaleDocumentiErrati;
    }


    /**
     * Sets the totaleDocumentiErrati value for this RecordRiepilogoType.
     * 
     * @param totaleDocumentiErrati
     */
    public void setTotaleDocumentiErrati(int totaleDocumentiErrati) {
        this.totaleDocumentiErrati = totaleDocumentiErrati;
    }


    /**
     * Gets the importoTotaliErrati value for this RecordRiepilogoType.
     * 
     * @return importoTotaliErrati
     */
    public java.math.BigDecimal getImportoTotaliErrati() {
        return importoTotaliErrati;
    }


    /**
     * Sets the importoTotaliErrati value for this RecordRiepilogoType.
     * 
     * @param importoTotaliErrati
     */
    public void setImportoTotaliErrati(java.math.BigDecimal importoTotaliErrati) {
        this.importoTotaliErrati = importoTotaliErrati;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecordRiepilogoType)) return false;
        RecordRiepilogoType other = (RecordRiepilogoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codiceCUAS==null && other.getCodiceCUAS()==null) || 
             (this.codiceCUAS!=null &&
              this.codiceCUAS.equals(other.getCodiceCUAS()))) &&
            ((this.numeroCCbeneficiario==null && other.getNumeroCCbeneficiario()==null) || 
             (this.numeroCCbeneficiario!=null &&
              this.numeroCCbeneficiario.equals(other.getNumeroCCbeneficiario()))) &&
            ((this.dataContabileAccredito==null && other.getDataContabileAccredito()==null) || 
             (this.dataContabileAccredito!=null &&
              this.dataContabileAccredito.equals(other.getDataContabileAccredito()))) &&
            this.identificativo == other.getIdentificativo() &&
            this.totaleDocumenti == other.getTotaleDocumenti() &&
            ((this.importoTotali==null && other.getImportoTotali()==null) || 
             (this.importoTotali!=null &&
              this.importoTotali.equals(other.getImportoTotali()))) &&
            this.totaleDocumentiEsatti == other.getTotaleDocumentiEsatti() &&
            ((this.importoTotaliEsatti==null && other.getImportoTotaliEsatti()==null) || 
             (this.importoTotaliEsatti!=null &&
              this.importoTotaliEsatti.equals(other.getImportoTotaliEsatti()))) &&
            this.totaleDocumentiErrati == other.getTotaleDocumentiErrati() &&
            ((this.importoTotaliErrati==null && other.getImportoTotaliErrati()==null) || 
             (this.importoTotaliErrati!=null &&
              this.importoTotaliErrati.equals(other.getImportoTotaliErrati())));
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
        if (getCodiceCUAS() != null) {
            _hashCode += getCodiceCUAS().hashCode();
        }
        if (getNumeroCCbeneficiario() != null) {
            _hashCode += getNumeroCCbeneficiario().hashCode();
        }
        if (getDataContabileAccredito() != null) {
            _hashCode += getDataContabileAccredito().hashCode();
        }
        _hashCode += getIdentificativo();
        _hashCode += getTotaleDocumenti();
        if (getImportoTotali() != null) {
            _hashCode += getImportoTotali().hashCode();
        }
        _hashCode += getTotaleDocumentiEsatti();
        if (getImportoTotaliEsatti() != null) {
            _hashCode += getImportoTotaliEsatti().hashCode();
        }
        _hashCode += getTotaleDocumentiErrati();
        if (getImportoTotaliErrati() != null) {
            _hashCode += getImportoTotaliErrati().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecordRiepilogoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integrazioneente.payer.seda.com", "RecordRiepilogoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceCUAS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integrazioneente.payer.seda.com", "CodiceCUAS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroCCbeneficiario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integrazioneente.payer.seda.com", "NumeroCCbeneficiario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataContabileAccredito");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integrazioneente.payer.seda.com", "DataContabileAccredito"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificativo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integrazioneente.payer.seda.com", "Identificativo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totaleDocumenti");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integrazioneente.payer.seda.com", "TotaleDocumenti"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importoTotali");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integrazioneente.payer.seda.com", "ImportoTotali"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totaleDocumentiEsatti");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integrazioneente.payer.seda.com", "TotaleDocumentiEsatti"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importoTotaliEsatti");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integrazioneente.payer.seda.com", "ImportoTotaliEsatti"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totaleDocumentiErrati");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integrazioneente.payer.seda.com", "TotaleDocumentiErrati"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importoTotaliErrati");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integrazioneente.payer.seda.com", "ImportoTotaliErrati"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
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
