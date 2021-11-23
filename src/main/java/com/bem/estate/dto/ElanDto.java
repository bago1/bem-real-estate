package com.bem.estate.dto;

import com.bem.estate.constant.SwaggerExampleConstants;
import com.bem.estate.domain.Building;
import com.bem.estate.domain.Home;
import com.bem.estate.enums.ElanType;
import com.bem.estate.enums.PropertyType;
import com.bem.estate.enums.Status;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;


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

    private HomeDto home;



}
//todo liquibase qosmaliyam initial datalar ucun. her de fe table silmeye qorxmuyub db-ni sile bilmeliyem