package com.bbva.uuaa.helloWorld.business.v0.dao.model.cvidt006_1;

import java.util.List;

import com.bbva.jee.arq.spring.core.host.Campo;
import com.bbva.jee.arq.spring.core.host.FilaCampoTabular;
import com.bbva.jee.arq.spring.core.host.TipoCampo;

/**
 * <p>Bean fila para el campo tabular <code>inputParticipants</code>, utilizado por la clase <code>RequestTransactionCvidt006_1</code></p>
 * 
 * @see RequestTransactionCvidt006_1
 * 
 * @author Arquitectura Spring BBVA
 */
@FilaCampoTabular
public class Inputparticipants {
	
	/**
	 * <p>Campo <code>updateCode</code>, &iacute;ndice: <code>1</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 1, nombre = "updateCode", tipo = TipoCampo.ALFANUMERICO, longitudMaxima = 50, signo = true)
	private String updateCode;
	
	/**
	 * <p>Campo <code>active</code>, &iacute;ndice: <code>2</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 2, nombre = "active", tipo = TipoCampo.ALFANUMERICO, longitudMaxima = 50, signo = true)
	private String active;
	
	/**
	 * <p>Campo <code>downId</code>, &iacute;ndice: <code>3</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 3, nombre = "downId", tipo = TipoCampo.ALFANUMERICO, longitudMaxima = 50, signo = true)
	private String downId;
	
	/**
	 * <p>Campo <code>isPricing</code>, &iacute;ndice: <code>4</code>, tipo: <code>BOOLEAN</code>
	 */
	@Campo(indice = 4, nombre = "isPricing", tipo = TipoCampo.BOOLEAN, signo = true)
	private Boolean isPricing;
	
	/**
	 * <p>Campo <code>nonCustomerId</code>, &iacute;ndice: <code>5</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 5, nombre = "nonCustomerId", tipo = TipoCampo.ALFANUMERICO, longitudMaxima = 60, signo = true)
	private String nonCustomerId;
	
	/**
	 * <p>Campo <code>economicData</code>, &iacute;ndice: <code>6</code>, tipo: <code>DTO</code>
	 */
	@Campo(indice = 6, nombre = "economicData", tipo = TipoCampo.DTO)
	private Economicdata economicData;
	
	/**
	 * <p>Campo <code>status</code>, &iacute;ndice: <code>7</code>, tipo: <code>DTO</code>
	 */
	@Campo(indice = 7, nombre = "status", tipo = TipoCampo.DTO)
	private Status status;
	
	/**
	 * <p>Campo <code>addresses</code>, &iacute;ndice: <code>8</code>, tipo: <code>LIST</code>
	 */
	@Campo(indice = 8, nombre = "addresses", tipo = TipoCampo.LIST)
	private List<Addresses> addresses;
	
	/**
	 * <p>Campo <code>id</code>, &iacute;ndice: <code>9</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 9, nombre = "id", tipo = TipoCampo.ALFANUMERICO, longitudMaxima = 100, signo = true, obligatorio = true)
	private String id;
	

	public String getUpdateCode() {
	    return updateCode;
	}

	public void setUpdateCode(String updateCode) {
    	this.updateCode = updateCode;
	}

	public String getActive() {
	    return active;
	}

	public void setActive(String active) {
    	this.active = active;
	}

	public String getDownId() {
	    return downId;
	}

	public void setDownId(String downId) {
    	this.downId = downId;
	}

	public Boolean getIsPricing() {
	    return isPricing;
	}

	public void setIsPricing(Boolean isPricing) {
    	this.isPricing = isPricing;
	}

	public String getNonCustomerId() {
	    return nonCustomerId;
	}

	public void setNonCustomerId(String nonCustomerId) {
    	this.nonCustomerId = nonCustomerId;
	}

	public Economicdata getEconomicData() {
	    return economicData;
	}

	public void setEconomicData(Economicdata economicData) {
    	this.economicData = economicData;
	}

	public Status getStatus() {
	    return status;
	}

	public void setStatus(Status status) {
    	this.status = status;
	}

	public List<Addresses> getAddresses() {
	    return addresses;
	}

	public void setAddresses(List<Addresses> addresses) {
    	this.addresses = addresses;
	}

	public String getId() {
	    return id;
	}

	public void setId(String id) {
    	this.id = id;
	}
}