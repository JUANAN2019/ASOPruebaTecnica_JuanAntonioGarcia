package com.bbva.uuaa.helloWorld.facade.v0.dto;

import com.bbva.uuaa.helloWorld.business.v0.dto.BLimitAmount;
import com.bbva.uuaa.helloWorld.business.v0.dto.BMaximumAmount;
import com.bbva.uuaa.helloWorld.business.v0.dto.BMinimumAmount;
import com.bbva.uuaa.helloWorld.business.v0.dto.BProduct;
import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;

@Getter
@Setter
public class Details {
    //validar mayusculas

    @Pattern(regexp = "[A-Z_]+")
    private String offerType;
    @Valid
    private LimitAmount limitAmount;
    private MinimumAmount MinimumAmount;
    private MaximumAmount MaximumAmount;
    @Valid
    private Product product;

}
