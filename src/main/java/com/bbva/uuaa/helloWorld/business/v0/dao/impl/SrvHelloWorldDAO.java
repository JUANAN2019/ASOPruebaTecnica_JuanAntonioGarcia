package com.bbva.uuaa.helloWorld.business.v0.dao.impl;

import com.bbva.uuaa.helloWorld.business.v0.dao.ISrvHelloWorldDAO;
import com.bbva.uuaa.helloWorld.business.v0.dto.*;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component(value = "srvHelloWorldDAO")
public class SrvHelloWorldDAO implements ISrvHelloWorldDAO {


    @Override
    public BSimulationOut mapSimulationDao(BSimulation bSimulation) {
        BSimulationOut bSimulationOut = new BSimulationOut();
        Random random = new Random();
        int numero = random.nextInt(900000000) + 1000000000;
        bSimulationOut.setId(""+numero);
        bSimulationOut.setNuip(bSimulation.getNuip());

        BDetails bDetails = new BDetails();
        bDetails.setOfferType(bSimulation.getDetails().getOfferType());

        BLimitAmount bLimitAmount = new BLimitAmount();
        bLimitAmount.setAmount(bSimulation.getDetails().getLimitAmount().getAmount());
        bLimitAmount.setCurrency(bSimulation.getDetails().getLimitAmount().getCurrency());
        bDetails.setLimitAmount(bLimitAmount);


        BMaximumAmount bMaximumAmount = new BMaximumAmount();
        bMaximumAmount.setAmount(bLimitAmount.getAmount() * 1.05);
        bMaximumAmount.setCurrency(bLimitAmount.getCurrency());
        bDetails.setMaximumAmount(bMaximumAmount);

        BMinimumAmount bMinimumAmount = new BMinimumAmount();
        bMinimumAmount.setAmount(bLimitAmount.getAmount() * 0.9);
        bMinimumAmount.setCurrency(bLimitAmount.getCurrency());
        bDetails.setMinimumAmount(bMinimumAmount);

        BProduct bProduct = new BProduct();
        bProduct.setId(bSimulation.getDetails().getProduct().getId());

        BSubproduct bSubproduct = new BSubproduct();
        bSubproduct.setId(bSimulation.getDetails().getProduct().getSubproduct().getId());
        bProduct.setSubproduct(bSubproduct);

        bDetails.setProduct(bProduct);

        bSimulationOut.setDetails(bDetails);
        return bSimulationOut;
    }

}
