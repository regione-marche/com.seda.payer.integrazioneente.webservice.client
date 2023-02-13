package com.seda.payer.integrazioneente.webservice.source;

import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import javax.xml.rpc.ServiceException;

import com.seda.payer.integrazioneente.webservice.dati.BollettinoBolloSpontaneoType;
import com.seda.payer.integrazioneente.webservice.dati.InviaFlussoRendRequestType;
import com.seda.payer.integrazioneente.webservice.dati.InviaFlussoRendResponseType;
import com.seda.payer.integrazioneente.webservice.dati.RecordRiepilogoType;
import com.seda.payer.integrazioneente.webservice.dati.RecordVersamentoType;

public class TestService {

	public static void main(String[] args) {
		String messaggio = "";
		try {
			RendicontazioneEnteServiceLocator RendicontazioneEnteServiceLocator=new RendicontazioneEnteServiceLocator();
			RendicontazioneEnteInterface RendicontazioneEnteInterface= RendicontazioneEnteServiceLocator.getRendicontazioneEntePort(new URL("http://10.10.80.6:10099/integrazioneente/RendicontazioneEnte"), "seda\\luca.pennacchietti", "Maggioli20");
							
			InviaFlussoRendRequestType inviaFlussoRendRequestType=new InviaFlussoRendRequestType();
			
			inviaFlussoRendRequestType.setChiaveRendicontazione("chiaveRendicontazione");
			
			RecordRiepilogoType recordRiepilogoType = new RecordRiepilogoType();
			recordRiepilogoType.setCodiceCUAS("codiceCUAS");
			recordRiepilogoType.setDataContabileAccredito("1");
			recordRiepilogoType.setIdentificativo(1);
			recordRiepilogoType.setImportoTotali(new BigDecimal(1.00));
			recordRiepilogoType.setImportoTotaliErrati(new BigDecimal(1.00));
			recordRiepilogoType.setImportoTotaliEsatti(new BigDecimal(1.00));
			recordRiepilogoType.setNumeroCCbeneficiario("1");
			recordRiepilogoType.setTotaleDocumenti(1);
			recordRiepilogoType.setTotaleDocumentiErrati(1);
			recordRiepilogoType.setTotaleDocumentiEsatti(1);
			inviaFlussoRendRequestType.setRecordRiepilogo(recordRiepilogoType);
			
			RecordVersamentoType recordVersamentoType= new RecordVersamentoType();
			
			BollettinoBolloSpontaneoType bollettinoBolloSpontaneoType = new BollettinoBolloSpontaneoType();
			bollettinoBolloSpontaneoType.setCategoriaVeicolo("categoriaVeicolo");
			bollettinoBolloSpontaneoType.setChiaveSpedizionePagamento("0");
			bollettinoBolloSpontaneoType.setCodiceEnte("06954");
			bollettinoBolloSpontaneoType.setCodiceFiscale("AAABBB00C00D000E");
			bollettinoBolloSpontaneoType.setCodiceIUV("1");
			bollettinoBolloSpontaneoType.setDataAccettazione("0");
			bollettinoBolloSpontaneoType.setDataContabileAccredito("0");
			bollettinoBolloSpontaneoType.setDivisa("0");
			bollettinoBolloSpontaneoType.setFlussoRendicontazionePagoPA("pagoPa");
			bollettinoBolloSpontaneoType.setImporto(new BigDecimal(0.00));
			bollettinoBolloSpontaneoType.setImportoInteressi(new BigDecimal(0.00));
			bollettinoBolloSpontaneoType.setImportoSanzione(new BigDecimal(0.00));
			bollettinoBolloSpontaneoType.setImportoTassa(new BigDecimal(0.00));
			bollettinoBolloSpontaneoType.setIndirizzo("indirizzo");
			bollettinoBolloSpontaneoType.setIntestatario("intestatario");
			bollettinoBolloSpontaneoType.setMesiValidita(0);
			bollettinoBolloSpontaneoType.setNumeroCCbeneficiario("0");
			bollettinoBolloSpontaneoType.setNumeroSospeso(null);
			bollettinoBolloSpontaneoType.setProgressivoCaricamento("0");
			bollettinoBolloSpontaneoType.setProgressivoSelezione(0);
			bollettinoBolloSpontaneoType.setRiduzione(0);
			bollettinoBolloSpontaneoType.setRiferimentoGiornaleDiCassa("gdc");
			bollettinoBolloSpontaneoType.setScadenza("scadenza");
			bollettinoBolloSpontaneoType.setTarga("targa");
			bollettinoBolloSpontaneoType.setTipoDocumento("0");
			bollettinoBolloSpontaneoType.setUfficioSportello(0);
			recordVersamentoType.setBollettinoBolloSpontaneo(bollettinoBolloSpontaneoType);
			
//			BollettinoCdsSpontaneoType bollettinoCdsSpontaneoType = new BollettinoCdsSpontaneoType();
////			bollettinoCdsSpontaneoType.setCategoriaVeicolo("categoriaVeicolo");
//			bollettinoCdsSpontaneoType.setChiaveSpedizionePagamento(0);
//			bollettinoCdsSpontaneoType.setCodiceEnte("06954");
//			bollettinoCdsSpontaneoType.setCodiceFiscale("AAABBB00C00D000E");
//			bollettinoCdsSpontaneoType.setCodiceIUV("1");
//			bollettinoCdsSpontaneoType.setDataAccettazione(0);
//			bollettinoCdsSpontaneoType.setDataContabileAccredito(0);
//			bollettinoCdsSpontaneoType.setDivisa(0);
//			bollettinoCdsSpontaneoType.setFlussoRendicontazionePagoPA("pagoPa");
//			bollettinoCdsSpontaneoType.setImporto(0);
////			bollettinoCdsSpontaneoType.setImportoInteressi(0);
////			bollettinoCdsSpontaneoType.setImportoSanzione(0);
////			bollettinoCdsSpontaneoType.setImportoTassa(0);
////			bollettinoCdsSpontaneoType.setIndirizzo("indirizzo");
//			bollettinoCdsSpontaneoType.setIntestatario("intestatario");
////			bollettinoCdsSpontaneoType.setMesiValidita(0);
//			bollettinoCdsSpontaneoType.setNumeroCCbeneficiario(0);
//			bollettinoCdsSpontaneoType.setNumeroSospeso(null);
//			bollettinoCdsSpontaneoType.setProgressivoCaricamento(0);
//			bollettinoCdsSpontaneoType.setProgressivoSelezione(0);
////			bollettinoCdsSpontaneoType.setRiduzione(0);
//			bollettinoCdsSpontaneoType.setRiferimentoGiornaleDiCassa("gdc");
////			bollettinoCdsSpontaneoType.setScadenza("scadenza");
//			bollettinoCdsSpontaneoType.setTarga("targa");
//			bollettinoCdsSpontaneoType.setTipoDocumento(0);
//			bollettinoCdsSpontaneoType.setUfficioSportello(0);
//			recordVersamentoType.setBollettinoCdsSpontaneo(bollettinoCdsSpontaneoType);
//			
//			recordVersamentoType.setBollettinoFreccia(new BollettinoFrecciaType());
//			recordVersamentoType.setBollettinoMav(new BollettinoMavType());
//			recordVersamentoType.setBollettinoPremarcato(new BollettinoPremarcatoType());
//			recordVersamentoType.setBollettinoSpontaneo(new BollettinoSpontaneoType());
			RecordVersamentoType array[] = new RecordVersamentoType [1];
			array[0] = recordVersamentoType;
			inviaFlussoRendRequestType.setRecordVersamento(array);
			inviaFlussoRendRequestType.setRecordVersamento(0, recordVersamentoType);
			inviaFlussoRendRequestType.setTipoInvio("tipoInvio");
			
			InviaFlussoRendResponseType response;
			response=RendicontazioneEnteInterface.inviaFlussoRend(inviaFlussoRendRequestType);
			
			System.out.println(response.getResponse().getRetcode());
			System.out.println(response.getResponse().getRetmessage());

		} catch (MalformedURLException ex) {
			ex.printStackTrace();
			messaggio = "errore: l'url non è esatta";
		} catch (ServiceException ex) {
			ex.printStackTrace();
			messaggio = "errore: la creazione della chiamata è fallita";
		} catch (RemoteException ex) {
			ex.printStackTrace();
			messaggio = "errore: l'invocazione del WS è fallita";
		} 
	}
}
