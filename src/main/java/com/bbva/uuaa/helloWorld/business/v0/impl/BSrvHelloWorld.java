package com.bbva.uuaa.helloWorld.business.v0.impl;

import com.bbva.uuaa.helloWorld.business.v0.IBSrvHelloWorld;
import com.bbva.uuaa.helloWorld.business.v0.dao.ISrvHelloWorldDAO;
import com.bbva.uuaa.helloWorld.business.v0.dto.*;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component(value = "bSrvHelloWorld")
public class BSrvHelloWorld implements IBSrvHelloWorld {
    @Resource(name = "srvHelloWorldDAO")
    private ISrvHelloWorldDAO dao;

    @Override
    public BSimulationOut mapBusinessSimulation(BSimulation bSimulation) {
        BSimulationOut bSimulationOut = new BSimulationOut();
        bSimulationOut = dao.mapSimulationDao(bSimulation);

        return bSimulationOut;
    }
}
