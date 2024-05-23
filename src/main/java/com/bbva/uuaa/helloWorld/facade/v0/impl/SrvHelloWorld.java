package com.bbva.uuaa.helloWorld.facade.v0.impl;

import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponse;
import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponseCreated;
import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponseNoContent;
import com.bbva.jee.arq.spring.core.servicing.annotations.SMC;
import com.bbva.jee.arq.spring.core.servicing.annotations.SN;
import com.bbva.jee.arq.spring.core.servicing.annotations.VN;
import com.bbva.uuaa.helloWorld.business.v0.IBSrvHelloWorld;
import com.bbva.uuaa.helloWorld.business.v0.dto.*;
import com.bbva.uuaa.helloWorld.facade.v0.ISrvHelloWorld;
import com.bbva.uuaa.helloWorld.facade.v0.dto.*;
import com.bbva.uuaa.helloWorld.facade.v0.mapper.ISrvHelloWorldMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Service
@SN(registryID = "SN000000001", logicalID = "helloWorld")
@VN(vnn = "v0")
@Path("/v0")
public class SrvHelloWorld implements ISrvHelloWorld {
    @Resource(name = "bSrvHelloWorld")
    private IBSrvHelloWorld business;

    @Override
    @POST
    @Path("/simulations/{nuip}")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    @SMC(registryID = "SMC000000025", logicalID = "simulations")
    public ServiceResponseCreated<SimulationOut>simulation(@PathParam("nuip") String nuip, @Valid Simulation simulation ) {

        ISrvHelloWorldMapper mapper = Mappers.getMapper(ISrvHelloWorldMapper.class);
        simulation.setNuip(nuip);
        BSimulation bSimulation = mapper.mapInSimulation(simulation);
        BSimulationOut bSimulationOut = business.mapBusinessSimulation(bSimulation);
        SimulationOut simulationOut = mapper.mapOutSimulation(bSimulationOut);
        return ServiceResponseCreated.data(simulationOut).build();

    }
}
