package com.bbva.uuaa.helloWorld.business.v0.dao.model.cvidt006_1;

import com.bbva.jee.arq.spring.core.host.Atributo;
import com.bbva.jee.arq.spring.core.host.Campo;
import com.bbva.jee.arq.spring.core.host.TipoCampo;
import com.bbva.jee.arq.spring.core.host.Transaccion;

/**
 * <p>Transacci&oacute;n <code>CVIDT006</code></p>
 * <p>Informaci&oacute;n de la transacci&oacute;n:
 * <ul>
 *    <li><b>Tipo:</b> 1</li>
 *    <li><b>Subtipo:</b> 1</li>
 *    <li><b>Versi&oacute;n:</b> 1</li>
 *    <li><b>Clase de petici&oacute;n:</b> RequestTransactionCvidt006_1</li>
 *    <li><b>Clase de respuesta:</b> ResponseTransactionCvidt006_1</li>
 * </ul>
 * </p>
 * <p>Configuraci&oacute;n de la transacci&oacute;n:
 * <ul>
 *    <li><b>Nombre configuraci&oacute;n:</b> default_apx</li>
 * </ul>
 * </p>
 * <p>Copy de la transacci&oacute;n:</p>
 * <code><pre> * FICHERO: CVIDT006-01-CO.xml
 * &lt;?xml version=&quot;1.0&quot; encoding=&quot;UTF-8&quot; standalone=&quot;yes&quot;?&gt;
 * &lt;transaction xmlns=&quot;http://www.w3schools.com&quot; transactionName=&quot;CVIDT006&quot; application=&quot;CVID&quot; version=&quot;01&quot; country=&quot;CO&quot; language=&quot;ES&quot;&gt;
 * &lt;paramsIn&gt;
 * &lt;dto order=&quot;1&quot; name=&quot;inputParticipants&quot; mandatory=&quot;0&quot; package=&quot;com.bbva.cvid.dto.simulation.post.Participant&quot; artifactId=&quot;CVIDC015&quot;&gt;
 * &lt;parameter order=&quot;1&quot; name=&quot;updateCode&quot; mandatory=&quot;0&quot; type=&quot;String&quot; size=&quot;50&quot;/&gt;
 * &lt;parameter order=&quot;2&quot; name=&quot;active&quot; mandatory=&quot;0&quot; type=&quot;String&quot; size=&quot;50&quot;/&gt;
 * &lt;parameter order=&quot;3&quot; name=&quot;downId&quot; mandatory=&quot;0&quot; type=&quot;String&quot; size=&quot;50&quot;/&gt;
 * &lt;parameter order=&quot;4&quot; name=&quot;isPricing&quot; mandatory=&quot;0&quot; type=&quot;Boolean&quot; size=&quot;0&quot;/&gt;
 * &lt;parameter order=&quot;5&quot; name=&quot;nonCustomerId&quot; mandatory=&quot;0&quot; type=&quot;String&quot; size=&quot;60&quot;/&gt;
 * &lt;dto order=&quot;6&quot; name=&quot;economicData&quot; mandatory=&quot;0&quot; package=&quot;com.bbva.cvid.dto.simulation.post.EconomicData&quot; artifactId=&quot;CVIDC015&quot;&gt;
 * &lt;dto order=&quot;1&quot; name=&quot;economicCondition&quot; mandatory=&quot;1&quot; package=&quot;com.bbva.cvid.dto.simulation.post.common.IdValue&quot; artifactId=&quot;CVIDC015&quot;&gt;
 * &lt;parameter order=&quot;1&quot; name=&quot;id&quot; mandatory=&quot;1&quot; type=&quot;String&quot; size=&quot;50&quot;/&gt;
 * &lt;/dto&gt;
 * &lt;parameter order=&quot;2&quot; name=&quot;sourceIncome&quot; mandatory=&quot;0&quot; type=&quot;String&quot; size=&quot;50&quot;/&gt;
 * &lt;/dto&gt;
 * &lt;dto order=&quot;7&quot; name=&quot;status&quot; mandatory=&quot;0&quot; package=&quot;com.bbva.cvid.dto.simulation.post.ParticipantStatus&quot; artifactId=&quot;CVIDC015&quot;&gt;
 * &lt;parameter order=&quot;1&quot; name=&quot;id&quot; mandatory=&quot;1&quot; type=&quot;String&quot; size=&quot;50&quot;/&gt;
 * &lt;/dto&gt;
 * &lt;list order=&quot;8&quot; name=&quot;addresses&quot; mandatory=&quot;0&quot;&gt;
 * &lt;dto order=&quot;1&quot; name=&quot;listAddresses&quot; mandatory=&quot;0&quot; package=&quot;com.bbva.cvid.dto.simulation.post.Addresses&quot; artifactId=&quot;CVIDC015&quot;&gt;
 * &lt;dto order=&quot;1&quot; name=&quot;residence&quot; mandatory=&quot;0&quot; package=&quot;com.bbva.cvid.dto.simulation.post.Residence&quot; artifactId=&quot;CVIDC015&quot;&gt;
 * &lt;dto order=&quot;1&quot; name=&quot;status&quot; mandatory=&quot;1&quot; package=&quot;com.bbva.cvid.dto.simulation.post.common.IdValue&quot; artifactId=&quot;CVIDC015&quot;&gt;
 * &lt;parameter order=&quot;1&quot; name=&quot;id&quot; mandatory=&quot;1&quot; type=&quot;String&quot; size=&quot;50&quot;/&gt;
 * &lt;/dto&gt;
 * &lt;dto order=&quot;2&quot; name=&quot;value&quot; mandatory=&quot;1&quot; package=&quot;com.bbva.cvid.dto.simulation.post.common.Amount&quot; artifactId=&quot;CVIDC015&quot;&gt;
 * &lt;parameter order=&quot;1&quot; name=&quot;amount&quot; mandatory=&quot;1&quot; type=&quot;Double&quot; size=&quot;20&quot;/&gt;
 * &lt;parameter order=&quot;2&quot; name=&quot;currency&quot; mandatory=&quot;0&quot; type=&quot;String&quot; size=&quot;10&quot;/&gt;
 * &lt;/dto&gt;
 * &lt;parameter order=&quot;3&quot; name=&quot;stratum&quot; mandatory=&quot;0&quot; type=&quot;String&quot; size=&quot;50&quot;/&gt;
 * &lt;parameter order=&quot;4&quot; name=&quot;yearOfAntiquity&quot; mandatory=&quot;1&quot; type=&quot;String&quot; size=&quot;50&quot;/&gt;
 * &lt;/dto&gt;
 * &lt;dto order=&quot;2&quot; name=&quot;addressesTypeLocation&quot; mandatory=&quot;0&quot; package=&quot;com.bbva.cvid.dto.simulation.post.common.AdressLocation&quot; artifactId=&quot;CVIDC015&quot;&gt;
 * &lt;dto order=&quot;1&quot; name=&quot;country&quot; mandatory=&quot;1&quot; package=&quot;com.bbva.cvid.dto.simulation.post.common.IdValue&quot; artifactId=&quot;CVIDC015&quot;&gt;
 * &lt;parameter order=&quot;1&quot; name=&quot;id&quot; mandatory=&quot;1&quot; type=&quot;String&quot; size=&quot;50&quot;/&gt;
 * &lt;/dto&gt;
 * &lt;dto order=&quot;2&quot; name=&quot;state&quot; mandatory=&quot;1&quot; package=&quot;com.bbva.cvid.dto.simulation.post.common.IdValue&quot; artifactId=&quot;CVIDC015&quot;&gt;
 * &lt;parameter order=&quot;1&quot; name=&quot;id&quot; mandatory=&quot;1&quot; type=&quot;String&quot; size=&quot;50&quot;/&gt;
 * &lt;/dto&gt;
 * &lt;dto order=&quot;3&quot; name=&quot;city&quot; mandatory=&quot;1&quot; package=&quot;com.bbva.cvid.dto.simulation.post.common.IdValue&quot; artifactId=&quot;CVIDC015&quot;&gt;
 * &lt;parameter order=&quot;1&quot; name=&quot;id&quot; mandatory=&quot;1&quot; type=&quot;String&quot; size=&quot;50&quot;/&gt;
 * &lt;/dto&gt;
 * &lt;/dto&gt;
 * &lt;dto order=&quot;3&quot; name=&quot;addressType&quot; mandatory=&quot;1&quot; package=&quot;com.bbva.cvid.dto.simulation.post.AddressTypeId&quot; artifactId=&quot;CVIDC015&quot;&gt;
 * &lt;parameter order=&quot;1&quot; name=&quot;id&quot; mandatory=&quot;1&quot; type=&quot;String&quot; size=&quot;100&quot;/&gt;
 * &lt;/dto&gt;
 * &lt;dto order=&quot;4&quot; name=&quot;ownershipType&quot; mandatory=&quot;1&quot; package=&quot;com.bbva.cvid.dto.simulation.post.OwnershipType&quot; artifactId=&quot;CVIDC015&quot;&gt;
 * &lt;parameter order=&quot;1&quot; name=&quot;id&quot; mandatory=&quot;1&quot; type=&quot;String&quot; size=&quot;50&quot;/&gt;
 * &lt;/dto&gt;
 * &lt;/dto&gt;
 * &lt;/list&gt;
 * &lt;parameter order=&quot;9&quot; name=&quot;id&quot; mandatory=&quot;1&quot; type=&quot;String&quot; size=&quot;100&quot;/&gt;
 * &lt;/dto&gt;
 * &lt;dto order=&quot;2&quot; name=&quot;requestHousing&quot; mandatory=&quot;1&quot; package=&quot;com.bbva.cvid.dto.simulation.post.common.IdValue&quot; artifactId=&quot;CVIDC015&quot;&gt;
 * &lt;parameter order=&quot;1&quot; name=&quot;id&quot; mandatory=&quot;1&quot; type=&quot;String&quot; size=&quot;100&quot;/&gt;
 * &lt;/dto&gt;
 * &lt;/paramsIn&gt;
 * &lt;paramsOut/&gt;
 * &lt;description&gt;put participants transaction&lt;/description&gt;
 * &lt;/transaction&gt;
</pre></code>
 * 
 * @see ResponseTransactionCvidt006_1
 *
 * @author Arquitectura Spring BBVA
 */
@Transaccion(
	nombre = "CVIDT006",
	tipo = 1, 
	subtipo = 1,	
	version = 1,
	configuracion = "default_apx",
	respuesta = ResponseTransactionCvidt006_1.class,
	atributos = {@Atributo(nombre = "country", valor = "CO")}
)
public class RequestTransactionCvidt006_1 {
		
		/**
	 * <p>Campo <code>inputParticipants</code>, &iacute;ndice: <code>1</code>, tipo: <code>DTO</code>
	 */
	@Campo(indice = 1, nombre = "inputParticipants", tipo = TipoCampo.DTO)
	private Inputparticipants inputParticipants;
	
	/**
	 * <p>Campo <code>requestHousing</code>, &iacute;ndice: <code>2</code>, tipo: <code>DTO</code>
	 */
	@Campo(indice = 2, nombre = "requestHousing", tipo = TipoCampo.DTO)
	private Requesthousing requestHousing;
	

	public Inputparticipants getInputParticipants() {
	    return inputParticipants;
	}

	public void setInputParticipants(Inputparticipants inputParticipants) {
    	this.inputParticipants = inputParticipants;
	}

	public Requesthousing getRequestHousing() {
	    return requestHousing;
	}

	public void setRequestHousing(Requesthousing requestHousing) {
    	this.requestHousing = requestHousing;
	}
}