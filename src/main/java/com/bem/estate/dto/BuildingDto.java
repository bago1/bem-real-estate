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
public class BuildingDto {



    @NotBlank
    @ApiModelProperty(value = "buildingType", example = SwaggerExampleConstants.BUILDING_TYPE)
    private String buildingType;

    @ApiModelProperty(value = "deliveryYear", example = SwaggerExampleConstants.DELIVERY_YEAR)
    private Integer deliveryYear;

    @ApiModelProperty(value = "buildingFloorSize", example = SwaggerExampleConstants.BUILDING_FLOOR_SIZE)
    private Integer buildingFloorSize;

    private MTKDto mtk;
}
