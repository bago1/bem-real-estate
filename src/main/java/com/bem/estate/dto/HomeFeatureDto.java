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
    @ApiModelProperty(value = "homeDocument", example = SwaggerExampleConstants.HOME_DOCUMENT)
    String homeDocument;
    @ApiModelProperty(value = "barter", example = SwaggerExampleConstants.BARTER)
    String barter;
    @ApiModelProperty(value = "balconyNumber", example = SwaggerExampleConstants.BALCONY_NUMBER)
    Integer balconyNumber;
    @ApiModelProperty(value = "postRepairmentLiving", example = SwaggerExampleConstants.POST_REPAIRMENT_LIVING)
    String postRepairmentLiving;
    @ApiModelProperty(value = "inRentNow", example = SwaggerExampleConstants.IN_RENT_NOW)
    String inRentNow;
    @ApiModelProperty(value = "electric", example = SwaggerExampleConstants.ELECTRIC)
    String electric;
    @ApiModelProperty(value = "continuousWater", example = SwaggerExampleConstants.CONTINIOUS_WATER)
    String continuousWater;
    @ApiModelProperty(value = "rentAmount", example = SwaggerExampleConstants.RENT_AMOUNT)
    Double rentAmount;
    @ApiModelProperty(value = "bathroomNumber", example = SwaggerExampleConstants.BATHROOM_NUMBER)
    Integer bathroomNumber;
    @ApiModelProperty(value = "repairSituation", example = SwaggerExampleConstants.REPAIR_SITUATION)
    HomeRepairSituation repairSituation;
    @ApiModelProperty(value = "ceilingHeight", example = SwaggerExampleConstants.CEILING_HEIGHT)
    Double ceilingHeight;
    @ApiModelProperty(value = "roomAdded", example = SwaggerExampleConstants.ROOM_ADDED)
    String roomAdded;
    @ApiModelProperty(value = "nowOnMortgage", example = SwaggerExampleConstants.NOW_ON_MORTGAGE)
    String nowOnMortgage;
    @ApiModelProperty(value = "livingNow", example = SwaggerExampleConstants.LIVING_NOW)
    Boolean livingNow;
    @ApiModelProperty(value = "homeViewEnum", example = SwaggerExampleConstants.HOME_VIEW_ENUM)
    String homeViewEnum;

}
//todo example constantda hamisi stringdi?