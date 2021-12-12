package com.bem.estate.dto;

import com.bem.estate.constant.SwaggerExampleConstants;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ElanRequestDto {

    @ApiModelProperty(value = "elanType", example = SwaggerExampleConstants.ELAN_TYPE)
    private String elanType;

    @ApiModelProperty(value = "propertyType", example = SwaggerExampleConstants.PROPERTY_TYPE)
    private String propertyType;

    @NotBlank
    @ApiModelProperty(value = "buildingType", example = SwaggerExampleConstants.BUILDING_TYPE)
    private String buildingType;

    @NotBlank
    @ApiModelProperty(value = "roomNumber", example = SwaggerExampleConstants.ROOM_NUMBER)
    private Integer roomNumber;

    @NotBlank
    @ApiModelProperty(value = "price", example = SwaggerExampleConstants.PRICE)
    private Double price;


    @ApiModelProperty(value = "city", example = SwaggerExampleConstants.CITY)
    private Long city;

    @ApiModelProperty(value = "district", example = SwaggerExampleConstants.DISTRICT)
    private Long district;

    @ApiModelProperty(value = "province", example = SwaggerExampleConstants.PROVINCE)
    private Long province;

    @ApiModelProperty(value = "metro", example = SwaggerExampleConstants.METRO)
    private Long metro;

    @ApiModelProperty(value = "square", example = SwaggerExampleConstants.SQUARE)
    private Double square;

    @ApiModelProperty(value = "floor", example = SwaggerExampleConstants.HOME_FLOOR)
    private Integer floor;




    @ApiModelProperty(value = "hasGas", example = SwaggerExampleConstants.TRUE)
    private Boolean hasGas;


    @ApiModelProperty(value = "homeRepairmentSituation", example = SwaggerExampleConstants.HOME_REPAIRMENT_SITUATION)
    private String homeRepairmentSituation;


    @ApiModelProperty(value = "nowOnRent", example = SwaggerExampleConstants.TRUE)
    private Boolean nowOnRent;


    @ApiModelProperty(value = "nowLiving", example = SwaggerExampleConstants.TRUE)
    private Boolean nowLiving;

    @ApiModelProperty(value = "centralHeating", example = SwaggerExampleConstants.TRUE)
    private Boolean centralHeating;

    @ApiModelProperty(value = "furnished", example = SwaggerExampleConstants.TRUE)
    private Boolean furnished;
}

