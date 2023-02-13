/**
 * InviaFlussoRendRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.integrazioneente.webservice.dati;

public class InviaFlussoRendRequestType  implements java.io.Serializable {
    /* Nome del flusso di rendicontazione */
    private java.lang.String chiaveRendicontazione;

    /* Indica il tipo di struttura del flusso di
     * 						rendicontazione: - IVP, bollettino premarcato -
     * 						IVC, bollettino CDS spontaneo - IVS, bollettino
     * 						spontaneo - IVM, bollettino MAV - IVF,
     * 						bollettino Freccia - IVB, bollettino Bollo
     * 						spontaneo */
    private java.lang.String tipoInvio;

    private com.seda.payer.integrazioneente.webservice.dati.RecordVersamentoType[] recordVersamento;

    private com.seda.payer.integrazioneente.webservice.dati.RecordRiepilogoType recordRiepilogo;

    public InviaFlussoRendRequestType() {
    }

    public InviaFlussoRendRequestType(
           java.lang.String chiaveRendicontazione,
           java.lang.String tipoInvio,
           com.seda.payer.integrazioneente.webservice.dati.RecordVersamentoType[] recordVersamento,
           com.seda.payer.integrazioneente.webservice.dati.RecordRiepilogoType recordRiepilogo) {
           this.chiaveRendicontazione = chiaveRendicontazione;
           this.tipoInvio = tipoInvio;
           this.recordVersamento = recordVersamento;
           this.recordRiepilogo = recordRiepilogo;
    }


    /**
     * Gets the chiaveRendicontazione value for this InviaFlussoRendRequestType.
     * 
     * @return chiaveRendicontazione   * Nome del flusso di rendicontazione
     */
    public java.lang.String getChiaveRendicontazione() {
        return chiaveRendicontazione;
    }


    /**
     * Sets the chiaveRendicontazione value for this InviaFlussoRendRequestType.
     * 
     * @param chiaveRendicontazione   * Nome del flusso di rendicontazione
     */
    public void setChiaveRendicontazione(java.lang.String chiaveRendicontazione) {
        this.chiaveRendicontazione = chiaveRendicontazione;
    }


    /**
     * Gets the tipoInvio value for this InviaFlussoRendRequestType.
     * 
     * @return tipoInvio   * Indica il tipo di struttura del flusso di
     * 						rendicontazione: - IVP, bollettino premarcato -
     * 						IVC, bollettino CDS spontaneo - IVS, bollettino
     * 						spontaneo - IVM, bollettino MAV - IVF,
     * 						bollettino Freccia - IVB, bollettino Bollo
     * 						spontaneo
     */
    public java.lang.String getTipoInvio() {
        return tipoInvio;
    }


    /**
     * Sets the tipoInvio value for this InviaFlussoRendRequestType.
     * 
     * @param tipoInvio   * Indica il tipo di struttura del flusso di
     * 						rendicontazione: - IVP, bollettino premarcato -
     * 						IVC, bollettino CDS spontaneo - IVS, bollettino
     * 						spontaneo - IVM, bollettino MAV - IVF,
     * 						bollettino Freccia - IVB, bollettino Bollo
     * 						spontaneo
     */
    public void setTipoInvio(java.lang.String tipoInvio) {
        this.tipoInvio = tipoInvio;
    }


    /**
     * Gets the recordVersamento value for this InviaFlussoRendRequestType.
     * 
     * @return recordVersamento
     */
    public com.seda.payer.integrazioneente.webservice.dati.RecordVersamentoType[] getRecordVersamento() {
        return recordVersamento;
    }


    /**
     * Sets the recordVersamento value for this InviaFlussoRendRequestType.
     * 
     * @param recordVersamento
     */
    public void setRecordVersamento(com.seda.payer.integrazioneente.webservice.dati.RecordVersamentoType[] recordVersamento) {
        this.recordVersamento = recordVersamento;
    }

    public com.seda.payer.integrazioneente.webservice.dati.RecordVersamentoType getRecordVersamento(int i) {
        return this.recordVersamento[i];
    }

    public void setRecordVersamento(int i, com.seda.payer.integrazioneente.webservice.dati.RecordVersamentoType _value) {
        this.recordVersamento[i] = _value;
    }


    /**
     * Gets the recordRiepilogo value for this InviaFlussoRendRequestType.
     * 
     * @return recordRiepilogo
     */
    public com.seda.payer.integrazioneente.webservice.dati.RecordRiepilogoType getRecordRiepilogo() {
        return recordRiepilogo;
    }


    /**
     * Sets the recordRiepilogo value for this InviaFlussoRendRequestType.
     * 
     * @param recordRiepilogo
     */
    public void setRecordRiepilogo(com.seda.payer.integrazioneente.webservice.dati.RecordRiepilogoType recordRiepilogo) {
        this.recordRiepilogo = recordRiepilogo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InviaFlussoRendRequestType)) return false;
        InviaFlussoRendRequestType other = (InviaFlussoRendRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.chiaveRendicontazione==null && other.getChiaveRendicontazione()==null) || 
             (this.chiaveRendicontazione!=null &&
              this.chiaveRendicontazione.equals(other.getChiaveRendicontazione()))) &&
            ((this.tipoInvio==null && other.getTipoInvio()==null) || 
             (this.tipoInvio!=null &&
              this.tipoInvio.equals(other.getTipoInvio()))) &&
            ((this.recordVersamento==null && other.getRecordVersamento()==null) || 
             (this.recordVersamento!=null &&
              java.util.Arrays.equals(this.recordVersamento, other.getRecordVersamento()))) &&
            ((this.recordRiepilogo==null && other.getRecordRiepilogo()==null) || 
             (this.recordRiepilogo!=null &&
              this.recordRiepilogo.equals(other.getRecordRiepilogo())));
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
        if (getChiaveRendicontazione() != null) {
            _hashCode += getChiaveRendicontazione().hashCode();
        }
        if (getTipoInvio() != null) {
            _hashCode += getTipoInvio().hashCode();
        }
        if (getRecordVersamento() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecordVersamento());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecordVersamento(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecordRiepilogo() != null) {
            _hashCode += getRecordRiepilogo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InviaFlussoRendRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integrazioneente.payer.seda.com", "InviaFlussoRendRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chiaveRendicontazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integrazioneente.payer.seda.com", "chiaveRendicontazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoInvio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integrazioneente.payer.seda.com", "tipoInvio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordVersamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integrazioneente.payer.seda.com", "RecordVersamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integrazioneente.payer.seda.com", "RecordVersamentoType"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordRiepilogo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integrazioneente.payer.seda.com", "RecordRiepilogo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integrazioneente.payer.seda.com", "RecordRiepilogoType"));
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
