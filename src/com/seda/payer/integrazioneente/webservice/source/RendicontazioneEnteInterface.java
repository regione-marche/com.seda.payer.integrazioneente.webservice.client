/**
 * RendicontazioneEnteInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.integrazioneente.webservice.source;

public interface RendicontazioneEnteInterface extends java.rmi.Remote {
    public com.seda.payer.integrazioneente.webservice.dati.InviaFlussoRendResponseType inviaFlussoRend(com.seda.payer.integrazioneente.webservice.dati.InviaFlussoRendRequestType in) throws java.rmi.RemoteException, com.seda.payer.integrazioneente.webservice.srv.FaultType;

    public com.seda.payer.integrazioneente.webservice.source.RendicontazioneEnteInterface getRendicontazioneEntePort(java.net.URL portAddress, String httpUserName, String httpPassword) throws javax.xml.rpc.ServiceException;
}
