package com.bbva.uuaa.helloWorld.business.v0.dao.model.cvidt006_1;

import com.bbva.jee.arq.spring.core.host.Campo;
import com.bbva.jee.arq.spring.core.host.FilaCampoTabular;
import com.bbva.jee.arq.spring.core.host.TipoCampo;

/**
 * <p>Bean fila para el campo tabular <code>economicData</code>, utilizado por la clase <code>Inputparticipants</code></p>
 * 
 * @see Inputparticipants
 * 
 * @author Arquitectura Spring BBVA
 */
@FilaCampoTabular
public class Economicdata {
	
	/**
	 * <p>Campo <code>economicCondition</code>, &iacute;ndice: <code>1</code>, tipo: <code>DTO</code>
	 */
	@Campo(indice = 1, nombre = "economicCondition", tipo = TipoCampo.DTO)
	private Economiccondition economicCondition;
	
	/**
	 * <p>Campo <code>sourceIncome</code>, &iacute;ndice: <code>2</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 2, nombre = "sourceIncome", tipo = TipoCampo.ALFANUMERICO, longitudMaxima = 50, signo = true)
	private String sourceIncome;
	

	public Economiccondition getEconomicCondition() {
	    return economicCondition;
	}

	public void setEconomicCondition(Economiccondition economicCondition) {
    	this.economicCondition = economicCondition;
	}

	public String getSourceIncome() {
	    return sourceIncome;
	}

	public void setSourceIncome(String sourceIncome) {
    	this.sourceIncome = sourceIncome;
	}
}