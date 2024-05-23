package com.bbva.uuaa.helloWorld.business.v0.dao.model.cvidt006_1;

import java.math.BigDecimal;

import com.bbva.jee.arq.spring.core.host.Campo;
import com.bbva.jee.arq.spring.core.host.FilaCampoTabular;
import com.bbva.jee.arq.spring.core.host.TipoCampo;

/**
 * <p>Bean fila para el campo tabular <code>value</code>, utilizado por la clase <code>Residence</code></p>
 * 
 * @see Residence
 * 
 * @author Arquitectura Spring BBVA
 */
@FilaCampoTabular
public class Value {
	
	/**
	 * <p>Campo <code>amount</code>, &iacute;ndice: <code>1</code>, tipo: <code>DECIMAL</code>
	 */
	@Campo(indice = 1, nombre = "amount", tipo = TipoCampo.DECIMAL, longitudMaxima = 20, signo = true, obligatorio = true)
	private BigDecimal amount;
	
	/**
	 * <p>Campo <code>currency</code>, &iacute;ndice: <code>2</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 2, nombre = "currency", tipo = TipoCampo.ALFANUMERICO, longitudMaxima = 10, signo = true)
	private String currency;
	

	public BigDecimal getAmount() {
	    return amount;
	}

	public void setAmount(BigDecimal amount) {
    	this.amount = amount;
	}

	public String getCurrency() {
	    return currency;
	}

	public void setCurrency(String currency) {
    	this.currency = currency;
	}
}