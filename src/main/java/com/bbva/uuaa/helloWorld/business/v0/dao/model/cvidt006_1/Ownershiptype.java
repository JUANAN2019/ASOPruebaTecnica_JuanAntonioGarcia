package com.bbva.uuaa.helloWorld.business.v0.dao.model.cvidt006_1;

import com.bbva.jee.arq.spring.core.host.Campo;
import com.bbva.jee.arq.spring.core.host.FilaCampoTabular;
import com.bbva.jee.arq.spring.core.host.TipoCampo;

/**
 * <p>Bean fila para el campo tabular <code>ownershipType</code>, utilizado por la clase <code>Listaddresses</code></p>
 * 
 * @see Listaddresses
 * 
 * @author Arquitectura Spring BBVA
 */
@FilaCampoTabular
public class Ownershiptype {
	
	/**
	 * <p>Campo <code>id</code>, &iacute;ndice: <code>1</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 1, nombre = "id", tipo = TipoCampo.ALFANUMERICO, longitudMaxima = 50, signo = true, obligatorio = true)
	private String id;
	

	public String getId() {
	    return id;
	}

	public void setId(String id) {
    	this.id = id;
	}
}