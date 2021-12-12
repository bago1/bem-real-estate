package com.bem.estate.dto;

import com.bem.estate.constant.SwaggerExampleConstants;
import com.bem.estate.enums.HomeRepairSituation;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class HomeFeatureDto {

 
    @ApiModelProperty(value = "combiBoiler", example = SwaggerExampleConstants.TRUE)
    String combiBoiler;
    @ApiModelProperty(value = "internet", example = SwaggerExampleConstants.TRUE)
    String internet;
    @ApiModelProperty(value = "cableTv", example = SwaggerExampleConstants.FALSE)
    String cableTv;
    @ApiModelProperty(value = "telephone", example = SwaggerExampleConstants.TRUE)
    String telephone;
    @ApiModelProperty(value = "storage", example = SwaggerExampleConstants.TRUE)
    String storage;
    @ApiModelProperty(value = "showerCabin", example = SwaggerExampleConstants.TRUE)
    String showerCabin;
    @ApiModelProperty(value = "airConditioner", example = SwaggerExampleConstants.HOME_FLOOR)
    Integer airConditioner;
    @ApiModelProperty(value = "hotFloor", example = SwaggerExampleConstants.TRUE)
    String hotFloor;
    @ApiModelProperty(value = "floorType", example = SwaggerExampleConstants.FLOOR_TYPE)
    String floorType;
    @ApiModelProperty(value = "furniture", example = SwaggerExampleConstants.TRUE)
    String furniture;
    @ApiModelProperty(value = "remained_furniture", example = SwaggerExampleConstants.REMAINED_FURNITURE)
    String remained_furniture;
    @ApiModelProperty(value = "centralHeat", example = SwaggerExampleConstants.TRUE)
    String centralHeat;

}
//todo example constantda hamisi stringdi?