package com.bem.estate.dto.address;

import com.bem.estate.constant.SwaggerExampleConstants;
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
public class DistrictDto {
    @ApiModelProperty(value = "district", example = SwaggerExampleConstants.DISTRICT)
    private String name;

    @ApiModelProperty(value = "city", example = SwaggerExampleConstants.CITY)
    private CityDto city;


}
