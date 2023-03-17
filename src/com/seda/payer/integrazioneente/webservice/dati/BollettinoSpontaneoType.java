/**
 * BollettinoSpontaneoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.integrazioneente.webservice.dati;


/**
 * Valorizzato se il campo tipoInvio è impostato a IVS
 */
public class BollettinoSpontaneoType  implements java.io.Serializable {
    private java.lang.String progressivoCaricamento;

    private int progressivoSelezione;

    private java.lang.String numeroCCbeneficiario;

    /* data accettazione AAMMGG */
    private java.lang.String dataAccettazione;

    private java.lang.String tipoDocumento;

    private java.math.BigDecimal importo;

    private int ufficioSportello;

    private java.lang.String divisa;

    /* data contabile AAMMGG */
    private java.lang.String dataContabileAccredito;

    private java.lang.String intestatario;

    private java.lang.String codiceEnte;

    private java.lang.String indirizzo;

    private int annoRiferimento;

    private java.lang.String causaleVersamento;

    private java.lang.String cespite;
    
    private java.lang.String provinciaMese;

    private java.lang.String codiceIUV;

    private java.lang.String flussoRendicontazionePagoPA;

    private java.lang.String riferimentoGiornaleDiCassa;

    private java.lang.String numeroSospeso;

    private java.lang.String impostaServizio;

    private java.lang.String codiceTributo;

    private java.lang.String tipologiaServizio;
    
    private java.lang.String ragioneSociale;

    private java.lang.String chiaveSpedizionePagamento;

    public BollettinoSpontaneoType() {
    }

    public BollettinoSpontaneoType(
           java.lang.String progressivoCaricamento,
           int progressivoSelezione,
           java.lang.String numeroCCbeneficiario,
           java.lang.String dataAccettazione,
           java.lang.String tipoDocumento,
           java.math.BigDecimal importo,
           int ufficioSportello,
           java.lang.String divisa,
           java.lang.String dataContabileAccredito,
           java.lang.String intestatario,
           java.lang.String codiceEnte,
           java.lang.String indirizzo,
           int annoRiferimento,
           java.lang.String causaleVersamento,
           java.lang.String cespite,
           java.lang.String codiceIUV,
           java.lang.String flussoRendicontazionePagoPA,
           java.lang.String riferimentoGiornaleDiCassa,
           java.lang.String numeroSospeso,
           java.lang.String impostaServizio,
           java.lang.String codiceTributo,
           java.lang.String tipologiaServizio,
           java.lang.String chiaveSpedizionePagamento,
           java.lang.String provinciaMese,
           java.lang.String ragioneSociale) {
           this.progressivoCaricamento = progressivoCaricamento;
           this.progressivoSelezione = progressivoSelezione;
           this.numeroCCbeneficiario = numeroCCbeneficiario;
           this.dataAccettazione = dataAccettazione;
           this.tipoDocumento = tipoDocumento;
           this.importo = importo;
           this.ufficioSportello = ufficioSportello;
           this.divisa = divisa;
           this.dataContabileAccredito = dataContabileAccredito;
           this.intestatario = intestatario;
           this.codiceEnte = codiceEnte;
           this.indirizzo = indirizzo;
           this.annoRiferimento = annoRiferimento;
           this.causaleVersamento = causaleVersamento;
           this.cespite = cespite;
           this.codiceIUV = codiceIUV;
           this.flussoRendicontazionePagoPA = flussoRendicontazionePagoPA;
           this.riferimentoGiornaleDiCassa = riferimentoGiornaleDiCassa;
           this.numeroSospeso = numeroSospeso;
           this.impostaServizio = impostaServizio;
           this.codiceTributo = codiceTributo;
           this.tipologiaServizio = tipologiaServizio;
           this.chiaveSpedizionePagamento = chiaveSpedizionePagamento;
           this.provinciaMese = provinciaMese;
           this.ragioneSociale = ragioneSociale;
    }


    /**
     * Gets the progressivoCaricamento value for this BollettinoSpontaneoType.
     * 
     * @return progressivoCaricamento
     */
    public java.lang.String getProgressivoCaricamento() {
        return progressivoCaricamento;
    }


    /**
     * Sets the progressivoCaricamento value for this BollettinoSpontaneoType.
     * 
     * @param progressivoCaricamento
     */
    public void setProgressivoCaricamento(java.lang.String progressivoCaricamento) {
        this.progressivoCaricamento = progressivoCaricamento;
    }


    /**
     * Gets the progressivoSelezione value for this BollettinoSpontaneoType.
     * 
     * @return progressivoSelezione
     */
    public int getProgressivoSelezione() {
        return progressivoSelezione;
    }


    /**
     * Sets the progressivoSelezione value for this BollettinoSpontaneoType.
     * 
     * @param progressivoSelezione
     */
    public void setProgressivoSelezione(int progressivoSelezione) {
        this.progressivoSelezione = progressivoSelezione;
    }


    /**
     * Gets the numeroCCbeneficiario value for this BollettinoSpontaneoType.
     * 
     * @return numeroCCbeneficiario
     */
    public java.lang.String getNumeroCCbeneficiario() {
        return numeroCCbeneficiario;
    }


    /**
     * Sets the numeroCCbeneficiario value for this BollettinoSpontaneoType.
     * 
     * @param numeroCCbeneficiario
     */
    public void setNumeroCCbeneficiario(java.lang.String numeroCCbeneficiario) {
        this.numeroCCbeneficiario = numeroCCbeneficiario;
    }


    /**
     * Gets the dataAccettazione value for this BollettinoSpontaneoType.
     * 
     * @return dataAccettazione   * data accettazione AAMMGG
     */
    public java.lang.String getDataAccettazione() {
        return dataAccettazione;
    }


    /**
     * Sets the dataAccettazione value for this BollettinoSpontaneoType.
     * 
     * @param dataAccettazione   * data accettazione AAMMGG
     */
    public void setDataAccettazione(java.lang.String dataAccettazione) {
        this.dataAccettazione = dataAccettazione;
    }


    /**
     * Gets the tipoDocumento value for this BollettinoSpontaneoType.
     * 
     * @return tipoDocumento
     */
    public java.lang.String getTipoDocumento() {
        return tipoDocumento;
    }


    /**
     * Sets the tipoDocumento value for this BollettinoSpontaneoType.
     * 
     * @param tipoDocumento
     */
    public void setTipoDocumento(java.lang.String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }


    /**
     * Gets the importo value for this BollettinoSpontaneoType.
     * 
     * @return importo
     */
    public java.math.BigDecimal getImporto() {
        return importo;
    }


    /**
     * Sets the importo value for this BollettinoSpontaneoType.
     * 
     * @param importo
     */
    public void setImporto(java.math.BigDecimal importo) {
        this.importo = importo;
    }


    /**
     * Gets the ufficioSportello value for this BollettinoSpontaneoType.
     * 
     * @return ufficioSportello
     */
    public int getUfficioSportello() {
        return ufficioSportello;
    }


    /**
     * Sets the ufficioSportello value for this BollettinoSpontaneoType.
     * 
     * @param ufficioSportello
     */
    public void setUfficioSportello(int ufficioSportello) {
        this.ufficioSportello = ufficioSportello;
    }


    /**
     * Gets the divisa value for this BollettinoSpontaneoType.
     * 
     * @return divisa
     */
    public java.lang.String getDivisa() {
        return divisa;
    }


    /**
     * Sets the divisa value for this BollettinoSpontaneoType.
     * 
     * @param divisa
     */
    public void setDivisa(java.lang.String divisa) {
        this.divisa = divisa;
    }


    /**
     * Gets the dataContabileAccredito value for this BollettinoSpontaneoType.
     * 
     * @return dataContabileAccredito   * data contabile AAMMGG
     */
    public java.lang.String getDataContabileAccredito() {
        return dataContabileAccredito;
    }


    /**
     * Sets the dataContabileAccredito value for this BollettinoSpontaneoType.
     * 
     * @param dataContabileAccredito   * data contabile AAMMGG
     */
    public void setDataContabileAccredito(java.lang.String dataContabileAccredito) {
        this.dataContabileAccredito = dataContabileAccredito;
    }


    /**
     * Gets the intestatario value for this BollettinoSpontaneoType.
     * 
     * @return intestatario
     */
    public java.lang.String getIntestatario() {
        return intestatario;
    }


    /**
     * Sets the intestatario value for this BollettinoSpontaneoType.
     * 
     * @param intestatario
     */
    public void setIntestatario(java.lang.String intestatario) {
        this.intestatario = intestatario;
    }


    /**
     * Gets the codiceEnte value for this BollettinoSpontaneoType.
     * 
     * @return codiceEnte
     */
    public java.lang.String getCodiceEnte() {
        return codiceEnte;
    }


    /**
     * Sets the codiceEnte value for this BollettinoSpontaneoType.
     * 
     * @param codiceEnte
     */
    public void setCodiceEnte(java.lang.String codiceEnte) {
        this.codiceEnte = codiceEnte;
    }


    /**
     * Gets the indirizzo value for this BollettinoSpontaneoType.
     * 
     * @return indirizzo
     */
    public java.lang.String getIndirizzo() {
        return indirizzo;
    }


    /**
     * Sets the indirizzo value for this BollettinoSpontaneoType.
     * 
     * @param indirizzo
     */
    public void setIndirizzo(java.lang.String indirizzo) {
        this.indirizzo = indirizzo;
    }


    /**
     * Gets the annoRiferimento value for this BollettinoSpontaneoType.
     * 
     * @return annoRiferimento
     */
    public int getAnnoRiferimento() {
        return annoRiferimento;
    }


    /**
     * Sets the annoRiferimento value for this BollettinoSpontaneoType.
     * 
     * @param annoRiferimento
     */
    public void setAnnoRiferimento(int annoRiferimento) {
        this.annoRiferimento = annoRiferimento;
    }


    /**
     * Gets the causaleVersamento value for this BollettinoSpontaneoType.
     * 
     * @return causaleVersamento
     */
    public java.lang.String getCausaleVersamento() {
        return causaleVersamento;
    }


    /**
     * Sets the causaleVersamento value for this BollettinoSpontaneoType.
     * 
     * @param causaleVersamento
     */
    public void setCausaleVersamento(java.lang.String causaleVersamento) {
        this.causaleVersamento = causaleVersamento;
    }


    /**
     * Gets the cespite value for this BollettinoSpontaneoType.
     * 
     * @return cespite
     */
    public java.lang.String getCespite() {
        return cespite;
    }


    /**
     * Sets the cespite value for this BollettinoSpontaneoType.
     * 
     * @param cespite
     */
    public void setCespite(java.lang.String cespite) {
        this.cespite = cespite;
    }


    /**
     * Gets the codiceIUV value for this BollettinoSpontaneoType.
     * 
     * @return codiceIUV
     */
    public java.lang.String getCodiceIUV() {
        return codiceIUV;
    }


    /**
     * Sets the codiceIUV value for this BollettinoSpontaneoType.
     * 
     * @param codiceIUV
     */
    public void setCodiceIUV(java.lang.String codiceIUV) {
        this.codiceIUV = codiceIUV;
    }


    /**
     * Gets the flussoRendicontazionePagoPA value for this BollettinoSpontaneoType.
     * 
     * @return flussoRendicontazionePagoPA
     */
    public java.lang.String getFlussoRendicontazionePagoPA() {
        return flussoRendicontazionePagoPA;
    }


    /**
     * Sets the flussoRendicontazionePagoPA value for this BollettinoSpontaneoType.
     * 
     * @param flussoRendicontazionePagoPA
     */
    public void setFlussoRendicontazionePagoPA(java.lang.String flussoRendicontazionePagoPA) {
        this.flussoRendicontazionePagoPA = flussoRendicontazionePagoPA;
    }


    /**
     * Gets the riferimentoGiornaleDiCassa value for this BollettinoSpontaneoType.
     * 
     * @return riferimentoGiornaleDiCassa
     */
    public java.lang.String getRiferimentoGiornaleDiCassa() {
        return riferimentoGiornaleDiCassa;
    }


    /**
     * Sets the riferimentoGiornaleDiCassa value for this BollettinoSpontaneoType.
     * 
     * @param riferimentoGiornaleDiCassa
     */
    public void setRiferimentoGiornaleDiCassa(java.lang.String riferimentoGiornaleDiCassa) {
        this.riferimentoGiornaleDiCassa = riferimentoGiornaleDiCassa;
    }


    /**
     * Gets the numeroSospeso value for this BollettinoSpontaneoType.
     * 
     * @return numeroSospeso
     */
    public java.lang.String getNumeroSospeso() {
        return numeroSospeso;
    }


    /**
     * Sets the numeroSospeso value for this BollettinoSpontaneoType.
     * 
     * @param numeroSospeso
     */
    public void setNumeroSospeso(java.lang.String numeroSospeso) {
        this.numeroSospeso = numeroSospeso;
    }


    /**
     * Gets the impostaServizio value for this BollettinoSpontaneoType.
     * 
     * @return impostaServizio
     */
    public java.lang.String getImpostaServizio() {
        return impostaServizio;
    }


    /**
     * Sets the impostaServizio value for this BollettinoSpontaneoType.
     * 
     * @param impostaServizio
     */
    public void setImpostaServizio(java.lang.String impostaServizio) {
        this.impostaServizio = impostaServizio;
    }


    /**
     * Gets the codiceTributo value for this BollettinoSpontaneoType.
     * 
     * @return codiceTributo
     */
    public java.lang.String getCodiceTributo() {
        return codiceTributo;
    }


    /**
     * Sets the codiceTributo value for this BollettinoSpontaneoType.
     * 
     * @param codiceTributo
     */
    public void setCodiceTributo(java.lang.String codiceTributo) {
        this.codiceTributo = codiceTributo;
    }


    /**
     * Gets the tipologiaServizio value for this BollettinoSpontaneoType.
     * 
     * @return tipologiaServizio
     */
    public java.lang.String getTipologiaServizio() {
        return tipologiaServizio;
    }


    /**
     * Sets the tipologiaServizio value for this BollettinoSpontaneoType.
     * 
     * @param tipologiaServizio
     */
    public void setTipologiaServizio(java.lang.String tipologiaServizio) {
        this.tipologiaServizio = tipologiaServizio;
    }


    /**
     * Gets the chiaveSpedizionePagamento value for this BollettinoSpontaneoType.
     * 
     * @return chiaveSpedizionePagamento
     */
    public java.lang.String getChiaveSpedizionePagamento() {
        return chiaveSpedizionePagamento;
    }


    /**
     * Sets the chiaveSpedizionePagamento value for this BollettinoSpontaneoType.
     * 
     * @param chiaveSpedizionePagamento
     */
    public void setChiaveSpedizionePagamento(java.lang.String chiaveSpedizionePagamento) {
        this.chiaveSpedizionePagamento = chiaveSpedizionePagamento;
    }
    
    /**
     * Gets the provinciaMese value for this BollettinoSpontaneoType.
     * 
     * @return provinciaMese
     */
    public java.lang.String getProvinciaMese() {
        return provinciaMese;
    }

    /**
     * Sets the provinciaMese value for this BollettinoSpontaneoType.
     * 
     * @param provinciaMese
     */
    public void setProvinciaMese(java.lang.String provinciaMese) {
        this.provinciaMese = provinciaMese;
    }

    /**
     * Sets the ragioneSociale value for this BollettinoSpontaneoType.
     * 
     * @param ragioneSociale
     */
    public void setRagioneSociale(java.lang.String ragioneSociale) {
        this.ragioneSociale = ragioneSociale;
    }
    
    /**
     * Gets the ragioneSociale value for this BollettinoSpontaneoType.
     * 
     * @return ragioneSociale
     */
    public java.lang.String getRagioneSociale() {
        return ragioneSociale;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BollettinoSpontaneoType)) return false;
        BollettinoSpontaneoType other = (BollettinoSpontaneoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.progressivoCaricamento==null && other.getProgressivoCaricamento()==null) || 
             (this.progressivoCaricamento!=null &&
              this.progressivoCaricamento.equals(other.getProgressivoCaricamento()))) &&
            this.progressivoSelezione == other.getProgressivoSelezione() &&
            ((this.numeroCCbeneficiario==null && other.getNumeroCCbeneficiario()==null) || 
             (this.numeroCCbeneficiario!=null &&
              this.numeroCCbeneficiario.equals(other.getNumeroCCbeneficiario()))) &&
            ((this.dataAccettazione==null && other.getDataAccettazione()==null) || 
             (this.dataAccettazione!=null &&
              this.dataAccettazione.equals(other.getDataAccettazione()))) &&
            ((this.tipoDocumento==null && other.getTipoDocumento()==null) || 
             (this.tipoDocumento!=null &&
              this.tipoDocumento.equals(other.getTipoDocumento()))) &&
            ((this.importo==null && other.getImporto()==null) || 
             (this.importo!=null &&
              this.importo.equals(other.getImporto()))) &&
            this.ufficioSportello == other.getUfficioSportello() &&
            ((this.divisa==null && other.getDivisa()==null) || 
             (this.divisa!=null &&
              this.divisa.equals(other.getDivisa()))) &&
            ((this.dataContabileAccredito==null && other.getDataContabileAccredito()==null) || 
             (this.dataContabileAccredito!=null &&
              this.dataContabileAccredito.equals(other.getDataContabileAccredito()))) &&
            ((this.intestatario==null && other.getIntestatario()==null) || 
             (this.intestatario!=null &&
              this.intestatario.equals(other.getIntestatario()))) &&
            ((this.codiceEnte==null && other.getCodiceEnte()==null) || 
             (this.codiceEnte!=null &&
              this.codiceEnte.equals(other.getCodiceEnte()))) &&
            ((this.indirizzo==null && other.getIndirizzo()==null) || 
             (this.indirizzo!=null &&
              this.indirizzo.equals(other.getIndirizzo()))) &&
            this.annoRiferimento == other.getAnnoRiferimento() &&
            ((this.causaleVersamento==null && other.getCausaleVersamento()==null) || 
             (this.causaleVersamento!=null &&
              this.causaleVersamento.equals(other.getCausaleVersamento()))) &&
            ((this.cespite==null && other.getCespite()==null) || 
             (this.cespite!=null &&
              this.cespite.equals(other.getCespite()))) &&
            ((this.codiceIUV==null && other.getCodiceIUV()==null) || 
             (this.codiceIUV!=null &&
              this.codiceIUV.equals(other.getCodiceIUV()))) &&
            ((this.flussoRendicontazionePagoPA==null && other.getFlussoRendicontazionePagoPA()==null) || 
             (this.flussoRendicontazionePagoPA!=null &&
              this.flussoRendicontazionePagoPA.equals(other.getFlussoRendicontazionePagoPA()))) &&
            ((this.riferimentoGiornaleDiCassa==null && other.getRiferimentoGiornaleDiCassa()==null) || 
             (this.riferimentoGiornaleDiCassa!=null &&
              this.riferimentoGiornaleDiCassa.equals(other.getRiferimentoGiornaleDiCassa()))) &&
            ((this.numeroSospeso==null && other.getNumeroSospeso()==null) || 
             (this.numeroSospeso!=null &&
              this.numeroSospeso.equals(other.getNumeroSospeso()))) &&
            ((this.impostaServizio==null && other.getImpostaServizio()==null) || 
             (this.impostaServizio!=null &&
              this.impostaServizio.equals(other.getImpostaServizio()))) &&
            ((this.codiceTributo==null && other.getCodiceTributo()==null) || 
             (this.codiceTributo!=null &&
              this.codiceTributo.equals(other.getCodiceTributo()))) &&
            ((this.tipologiaServizio==null && other.getTipologiaServizio()==null) || 
             (this.tipologiaServizio!=null &&
              this.tipologiaServizio.equals(other.getTipologiaServizio()))) &&
            ((this.chiaveSpedizionePagamento==null && other.getChiaveSpedizionePagamento()==null) || 
             (this.chiaveSpedizionePagamento!=null &&
              this.chiaveSpedizionePagamento.equals(other.getChiaveSpedizionePagamento()))) &&
            ((this.provinciaMese==null && other.getProvinciaMese()==null) || 
             (this.provinciaMese!=null &&
              this.provinciaMese.equals(other.getProvinciaMese()))) &&
            ((this.ragioneSociale==null && other.getRagioneSociale()==null) || 
	          (this.ragioneSociale!=null &&
	           this.ragioneSociale.equals(other.getRagioneSociale())));
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
        if (getProgressivoCaricamento() != null) {
            _hashCode += getProgressivoCaricamento().hashCode();
        }
        _hashCode += getProgressivoSelezione();
        if (getNumeroCCbeneficiario() != null) {
            _hashCode += getNumeroCCbeneficiario().hashCode();
        }
        if (getDataAccettazione() != null) {
            _hashCode += getDataAccettazione().hashCode();
        }
        if (getTipoDocumento() != null) {
            _hashCode += getTipoDocumento().hashCode();
        }
        if (getImporto() != null) {
            _hashCode += getImporto().hashCode();
        }
        _hashCode += getUfficioSportello();
        if (getDivisa() != null) {
            _hashCode += getDivisa().hashCode();
        }
        if (getDataContabileAccredito() != null) {
            _hashCode += getDataContabileAccredito().hashCode();
        }
        if (getIntestatario() != null) {
            _hashCode += getIntestatario().hashCode();
        }
        if (getCodiceEnte() != null) {
            _hashCode += getCodiceEnte().hashCode();
        }
        if (getIndirizzo() != null) {
            _hashCode += getIndirizzo().hashCode();
        }
        _hashCode += getAnnoRiferimento();
        if (getCausaleVersamento() != null) {
            _hashCode += getCausaleVersamento().hashCode();
        }
        if (getCespite() != null) {
            _hashCode += getCespite().hashCode();
        }
        if (getCodiceIUV() != null) {
            _hashCode += getCodiceIUV().hashCode();
        }
        if (getFlussoRendicontazionePagoPA() != null) {
            _hashCode += getFlussoRendicontazionePagoPA().hashCode();
        }
        if (getRiferimentoGiornaleDiCassa() != null) {
            _hashCode += getRiferimentoGiornaleDiCassa().hashCode();
        }
        if (getNumeroSospeso() != null) {
            _hashCode += getNumeroSospeso().hashCode();
        }
        if (getImpostaServizio() != null) {
            _hashCode += getImpostaServizio().hashCode();
        }
        if (getCodiceTributo() != null) {
            _hashCode += getCodiceTributo().hashCode();
        }
        if (getTipologiaServizio() != null) {
            _hashCode += getTipologiaServizio().hashCode();
        }
        if (getChiaveSpedizionePagamento() != null) {
            _hashCode += getChiaveSpedizionePagamento().hashCode();
        }
        if (getProvinciaMese() != null) {
            _hashCode += getProvinciaMese().hashCode();
        }
        if (getRagioneSociale() != null) {
            _hashCode += getRagioneSociale().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BollettinoSpontaneoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integrazioneente.payer.seda.com", "BollettinoSpontaneoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("progressivoCaricamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integrazioneente.payer.seda.com", "ProgressivoCaricamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("progressivoSelezione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integrazioneente.payer.seda.com", "ProgressivoSelezione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroCCbeneficiario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integrazioneente.payer.seda.com", "NumeroCCbeneficiario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataAccettazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integrazioneente.payer.seda.com", "DataAccettazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integrazioneente.payer.seda.com", "TipoDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integrazioneente.payer.seda.com", "Importo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ufficioSportello");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integrazioneente.payer.seda.com", "UfficioSportello"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("divisa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integrazioneente.payer.seda.com", "Divisa"));
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
        elemField.setFieldName("intestatario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integrazioneente.payer.seda.com", "Intestatario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceEnte");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integrazioneente.payer.seda.com", "CodiceEnte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indirizzo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integrazioneente.payer.seda.com", "Indirizzo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annoRiferimento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integrazioneente.payer.seda.com", "AnnoRiferimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("causaleVersamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integrazioneente.payer.seda.com", "CausaleVersamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cespite");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integrazioneente.payer.seda.com", "Cespite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceIUV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integrazioneente.payer.seda.com", "CodiceIUV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flussoRendicontazionePagoPA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integrazioneente.payer.seda.com", "FlussoRendicontazionePagoPA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("riferimentoGiornaleDiCassa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integrazioneente.payer.seda.com", "RiferimentoGiornaleDiCassa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroSospeso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integrazioneente.payer.seda.com", "NumeroSospeso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impostaServizio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integrazioneente.payer.seda.com", "ImpostaServizio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceTributo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integrazioneente.payer.seda.com", "CodiceTributo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipologiaServizio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integrazioneente.payer.seda.com", "TipologiaServizio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chiaveSpedizionePagamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integrazioneente.payer.seda.com", "ChiaveSpedizionePagamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provinciaMese");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integrazioneente.payer.seda.com", "ProvinciaMese"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ragioneSociale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integrazioneente.payer.seda.com", "RagioneSociale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
