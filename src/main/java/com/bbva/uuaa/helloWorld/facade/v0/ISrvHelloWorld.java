package com.bbva.uuaa.helloWorld.facade.v0;

import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponse;
import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponseCreated;
import com.bbva.uuaa.helloWorld.facade.v0.dto.Simulation;
import com.bbva.uuaa.helloWorld.facade.v0.dto.SimulationOut;

public interface ISrvHelloWorld {

	ServiceResponseCreated<SimulationOut>simulation(String nuip, Simulation simulation);


}
