package com.bem.estate.dto;

import com.bem.estate.constant.SwaggerExampleConstants;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ElanDto {

    @NotBlank
    @ApiModelProperty(value = "elanType", example = SwaggerExampleConstants.ELAN_TYPE)
    private String elanType;

    @NotBlank
    @ApiModelProperty(value = "propertyType", example = SwaggerExampleConstants.PROPERTY_TYPE)
    private String propertyType;

    private BuildingDto building;

    private HomeDto home;

}
//todo liquibase qosmaliyam initial datalar ucun. her de fe table silmeye qorxmuyub db-ni sile bilmeliyem