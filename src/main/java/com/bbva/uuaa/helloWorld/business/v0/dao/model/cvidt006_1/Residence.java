package com.bbva.uuaa.helloWorld.business.v0.dao.model.cvidt006_1;

import com.bbva.jee.arq.spring.core.host.Campo;
import com.bbva.jee.arq.spring.core.host.FilaCampoTabular;
import com.bbva.jee.arq.spring.core.host.TipoCampo;

/**
 * <p>Bean fila para el campo tabular <code>residence</code>, utilizado por la clase <code>Listaddresses</code></p>
 * 
 * @see Listaddresses
 * 
 * @author Arquitectura Spring BBVA
 */
@FilaCampoTabular
public class Residence {
	
	/**
	 * <p>Campo <code>status</code>, &iacute;ndice: <code>1</code>, tipo: <code>DTO</code>
	 */
	@Campo(indice = 1, nombre = "status", tipo = TipoCampo.DTO)
	private Status status;
	
	/**
	 * <p>Campo <code>value</code>, &iacute;ndice: <code>2</code>, tipo: <code>DTO</code>
	 */
	@Campo(indice = 2, nombre = "value", tipo = TipoCampo.DTO)
	private Value value;
	
	/**
	 * <p>Campo <code>stratum</code>, &iacute;ndice: <code>3</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 3, nombre = "stratum", tipo = TipoCampo.ALFANUMERICO, longitudMaxima = 50, signo = true)
	private String stratum;
	
	/**
	 * <p>Campo <code>yearOfAntiquity</code>, &iacute;ndice: <code>4</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 4, nombre = "yearOfAntiquity", tipo = TipoCampo.ALFANUMERICO, longitudMaxima = 50, signo = true, obligatorio = true)
	private String yearOfAntiquity;
	

	public Status getStatus() {
	    return status;
	}

	public void setStatus(Status status) {
    	this.status = status;
	}

	public Value getValue() {
	    return value;
	}

	public void setValue(Value value) {
    	this.value = value;
	}

	public String getStratum() {
	    return stratum;
	}

	public void setStratum(String stratum) {
    	this.stratum = stratum;
	}

	public String getYearOfAntiquity() {
	    return yearOfAntiquity;
	}

	public void setYearOfAntiquity(String yearOfAntiquity) {
    	this.yearOfAntiquity = yearOfAntiquity;
	}
}