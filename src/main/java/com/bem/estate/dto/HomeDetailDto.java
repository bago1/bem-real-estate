package com.bem.estate.dto;

import com.bem.estate.constant.SwaggerExampleConstants;
import com.bem.estate.dto.address.LocationDto;
import com.bem.estate.enums.HomeRepairSituation;
import com.bem.estate.enums.HomeView;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class HomeDetailDto {

    @ApiModelProperty(value = "floor", example = SwaggerExampleConstants.HOME_FLOOR)
    Integer floor;
    @ApiModelProperty(value = "homeDocument", example = SwaggerExampleConstants.TRUE)
    String homeDocument;
    @ApiModelProperty(value = "barter", example = SwaggerExampleConstants.FALSE)
    String barter;
    @ApiModelProperty(value = "balconyNumber", example = SwaggerExampleConstants.BALCONY_NUMBER)
    Integer balconyNumber;
    @ApiModelProperty(value = "postRepairmentLiving", example = SwaggerExampleConstants.TRUE)
    String postRepairmentLiving;
    @ApiModelProperty(value = "inRentNow", example = SwaggerExampleConstants.TRUE)
    String inRentNow;
    @ApiModelProperty(value = "rentAmount", example = SwaggerExampleConstants.RENT_AMOUNT)
    Double rentAmount;
    @ApiModelProperty(value = "electric", example = SwaggerExampleConstants.TRUE)
    String electric;  
    @ApiModelProperty(value = "gas", example = SwaggerExampleConstants.TRUE)
    String gas;
    @ApiModelProperty(value = "continuousWater", example = SwaggerExampleConstants.TRUE)
    String continuousWater;

    @ApiModelProperty(value = "bathroomNumber", example = SwaggerExampleConstants.BATHROOM_NUMBER)
    Integer bathroomNumber;


    @ApiModelProperty(value = "repairSituation", example = SwaggerExampleConstants.REPAIR_SITUATION)
    String repairSituation;


    @ApiModelProperty(value = "ceilingHeight", example = SwaggerExampleConstants.CEILING_HEIGHT)
    Double ceilingHeight;
    @ApiModelProperty(value = "roomAdded", example = SwaggerExampleConstants.TRUE)
    String roomAdded;
    @ApiModelProperty(value = "nowOnMortgage", example = SwaggerExampleConstants.TRUE)
    String nowOnMortgage;
    @ApiModelProperty(value = "livingNow", example = SwaggerExampleConstants.TRUE)
    Boolean livingNow;
    @ApiModelProperty(value = "homeViewEnum", example = SwaggerExampleConstants.HOME_VIEW_ENUM)
    String homeViewEnum;
    @ApiModelProperty(value = "nowOnMortgage", example = SwaggerExampleConstants.TRUE)
    Boolean mortgageAvailable;


}
//todo example constantda hamisi stringdi?