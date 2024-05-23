package com.bbva.uuaa.helloWorld.business.v0.dao.model.cvidt006_1;

import com.bbva.jee.arq.spring.core.host.Campo;
import com.bbva.jee.arq.spring.core.host.FilaCampoTabular;
import com.bbva.jee.arq.spring.core.host.TipoCampo;

/**
 * <p>Bean fila para el campo tabular <code>addresses</code>, utilizado por la clase <code>Inputparticipants</code></p>
 * 
 * @see Inputparticipants
 * 
 * @author Arquitectura Spring BBVA
 */
@FilaCampoTabular
public class Addresses {
	
	/**
	 * <p>Campo <code>listAddresses</code>, &iacute;ndice: <code>1</code>, tipo: <code>DTO</code>
	 */
	@Campo(indice = 1, nombre = "listAddresses", tipo = TipoCampo.DTO)
	private Listaddresses listAddresses;
	

	public Listaddresses getListAddresses() {
	    return listAddresses;
	}

	public void setListAddresses(Listaddresses listAddresses) {
    	this.listAddresses = listAddresses;
	}
}