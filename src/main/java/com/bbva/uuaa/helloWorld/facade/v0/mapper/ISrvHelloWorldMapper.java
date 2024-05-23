package com.bbva.uuaa.helloWorld.facade.v0.mapper;

import com.bbva.uuaa.helloWorld.business.v0.dto.*;
import com.bbva.uuaa.helloWorld.facade.v0.dto.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ISrvHelloWorldMapper {


BSimulation mapInSimulation(Simulation simulation);

SimulationOut mapOutSimulation(BSimulationOut bSimulationOut);


}