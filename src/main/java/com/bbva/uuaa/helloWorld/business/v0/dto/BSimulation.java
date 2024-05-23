package com.bbva.uuaa.helloWorld.business.v0.dto;

import com.bbva.uuaa.helloWorld.facade.v0.dto.Details;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BSimulation {
    private String id;
    private String nuip;
    private BDetails details;

}
