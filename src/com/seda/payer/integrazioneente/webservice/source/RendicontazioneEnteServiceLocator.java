/**
 * RendicontazioneEnteServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.integrazioneente.webservice.source;

public class RendicontazioneEnteServiceLocator extends org.apache.axis.client.Service implements com.seda.payer.integrazioneente.webservice.source.RendicontazioneEnteService {

    public RendicontazioneEnteServiceLocator() {
    }


    public RendicontazioneEnteServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public RendicontazioneEnteServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    
	public com.seda.payer.integrazioneente.webservice.source.RendicontazioneEnteInterface getRendicontazioneEntePort(
			java.net.URL portAddress, String httpUserName, String httpPassword)
			throws javax.xml.rpc.ServiceException {
		try {
			com.seda.payer.integrazioneente.webservice.source.RendicontazioneEnteSOAPBindingStub _stub = new com.seda.payer.integrazioneente.webservice.source.RendicontazioneEnteSOAPBindingStub(
					portAddress, this);
			_stub.setPortName(getRendicontazioneEntePortWSDDServiceName());
			_stub.setHttpUserName(httpUserName);
			_stub.setHttpPassword(httpPassword);
			return _stub;
		} catch (org.apache.axis.AxisFault e) {
			return null;
		}
	}
    
    
    // Use to get a proxy class for RendicontazioneEntePort
    private java.lang.String RendicontazioneEntePort_address = "";

	
    public java.lang.String getRendicontazioneEntePortAddress() {
        return RendicontazioneEntePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String RendicontazioneEntePortWSDDServiceName = "RendicontazioneEntePort";

    public java.lang.String getRendicontazioneEntePortWSDDServiceName() {
        return RendicontazioneEntePortWSDDServiceName;
    }

    public void setRendicontazioneEntePortWSDDServiceName(java.lang.String name) {
        RendicontazioneEntePortWSDDServiceName = name;
    }

    public com.seda.payer.integrazioneente.webservice.source.RendicontazioneEnteInterface getRendicontazioneEntePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(RendicontazioneEntePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getRendicontazioneEntePort(endpoint);
    }

    public com.seda.payer.integrazioneente.webservice.source.RendicontazioneEnteInterface getRendicontazioneEntePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.seda.payer.integrazioneente.webservice.source.RendicontazioneEnteSOAPBindingStub _stub = new com.seda.payer.integrazioneente.webservice.source.RendicontazioneEnteSOAPBindingStub(portAddress, this);
            _stub.setPortName(getRendicontazioneEntePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setRendicontazioneEntePortEndpointAddress(java.lang.String address) {
        RendicontazioneEntePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.seda.payer.integrazioneente.webservice.source.RendicontazioneEnteInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                com.seda.payer.integrazioneente.webservice.source.RendicontazioneEnteSOAPBindingStub _stub = new com.seda.payer.integrazioneente.webservice.source.RendicontazioneEnteSOAPBindingStub(new java.net.URL(RendicontazioneEntePort_address), this);
                _stub.setPortName(getRendicontazioneEntePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("RendicontazioneEntePort".equals(inputPortName)) {
            return getRendicontazioneEntePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://source.webservice.integrazioneente.payer.seda.com", "RendicontazioneEnteService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://source.webservice.integrazioneente.payer.seda.com", "RendicontazioneEntePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("RendicontazioneEntePort".equals(portName)) {
            setRendicontazioneEntePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
