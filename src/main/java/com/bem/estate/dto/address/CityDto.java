package com.bem.estate.dto.address;

import com.bem.estate.constant.SwaggerExampleConstants;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class CityDto {

    @ApiModelProperty(value = "id", example = SwaggerExampleConstants.ONE)
    private long id;

    @ApiModelProperty(value = "city", example = SwaggerExampleConstants.CITY)
    private String name;

    @ApiModelProperty(value = "economic region", example = SwaggerExampleConstants.ECONOMIC_REGION)
    EconomicRegionDto economicRegion;

}
