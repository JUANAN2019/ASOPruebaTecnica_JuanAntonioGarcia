package com.bbva.uuaa.helloWorld.business.v0.dao.model.cvidt006_1;

import com.bbva.jee.arq.spring.core.host.Campo;
import com.bbva.jee.arq.spring.core.host.FilaCampoTabular;
import com.bbva.jee.arq.spring.core.host.TipoCampo;

/**
 * <p>Bean fila para el campo tabular <code>listAddresses</code>, utilizado por la clase <code>Addresses</code></p>
 * 
 * @see Addresses
 * 
 * @author Arquitectura Spring BBVA
 */
@FilaCampoTabular
public class Listaddresses {
	
	/**
	 * <p>Campo <code>residence</code>, &iacute;ndice: <code>1</code>, tipo: <code>DTO</code>
	 */
	@Campo(indice = 1, nombre = "residence", tipo = TipoCampo.DTO)
	private Residence residence;
	
	/**
	 * <p>Campo <code>addressesTypeLocation</code>, &iacute;ndice: <code>2</code>, tipo: <code>DTO</code>
	 */
	@Campo(indice = 2, nombre = "addressesTypeLocation", tipo = TipoCampo.DTO)
	private Addressestypelocation addressesTypeLocation;
	
	/**
	 * <p>Campo <code>addressType</code>, &iacute;ndice: <code>3</code>, tipo: <code>DTO</code>
	 */
	@Campo(indice = 3, nombre = "addressType", tipo = TipoCampo.DTO)
	private Addresstype addressType;
	
	/**
	 * <p>Campo <code>ownershipType</code>, &iacute;ndice: <code>4</code>, tipo: <code>DTO</code>
	 */
	@Campo(indice = 4, nombre = "ownershipType", tipo = TipoCampo.DTO)
	private Ownershiptype ownershipType;
	

	public Residence getResidence() {
	    return residence;
	}

	public void setResidence(Residence residence) {
    	this.residence = residence;
	}

	public Addressestypelocation getAddressesTypeLocation() {
	    return addressesTypeLocation;
	}

	public void setAddressesTypeLocation(Addressestypelocation addressesTypeLocation) {
    	this.addressesTypeLocation = addressesTypeLocation;
	}

	public Addresstype getAddressType() {
	    return addressType;
	}

	public void setAddressType(Addresstype addressType) {
    	this.addressType = addressType;
	}

	public Ownershiptype getOwnershipType() {
	    return ownershipType;
	}

	public void setOwnershipType(Ownershiptype ownershipType) {
    	this.ownershipType = ownershipType;
	}
}