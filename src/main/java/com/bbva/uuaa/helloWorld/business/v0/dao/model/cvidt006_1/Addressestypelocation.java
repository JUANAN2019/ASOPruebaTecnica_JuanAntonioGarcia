package com.bbva.uuaa.helloWorld.business.v0.dao.model.cvidt006_1;

import com.bbva.jee.arq.spring.core.host.Campo;
import com.bbva.jee.arq.spring.core.host.FilaCampoTabular;
import com.bbva.jee.arq.spring.core.host.TipoCampo;

/**
 * <p>Bean fila para el campo tabular <code>addressesTypeLocation</code>, utilizado por la clase <code>Listaddresses</code></p>
 * 
 * @see Listaddresses
 * 
 * @author Arquitectura Spring BBVA
 */
@FilaCampoTabular
public class Addressestypelocation {
	
	/**
	 * <p>Campo <code>country</code>, &iacute;ndice: <code>1</code>, tipo: <code>DTO</code>
	 */
	@Campo(indice = 1, nombre = "country", tipo = TipoCampo.DTO)
	private Country country;
	
	/**
	 * <p>Campo <code>state</code>, &iacute;ndice: <code>2</code>, tipo: <code>DTO</code>
	 */
	@Campo(indice = 2, nombre = "state", tipo = TipoCampo.DTO)
	private State state;
	
	/**
	 * <p>Campo <code>city</code>, &iacute;ndice: <code>3</code>, tipo: <code>DTO</code>
	 */
	@Campo(indice = 3, nombre = "city", tipo = TipoCampo.DTO)
	private City city;
	

	public Country getCountry() {
	    return country;
	}

	public void setCountry(Country country) {
    	this.country = country;
	}

	public State getState() {
	    return state;
	}

	public void setState(State state) {
    	this.state = state;
	}

	public City getCity() {
	    return city;
	}

	public void setCity(City city) {
    	this.city = city;
	}
}