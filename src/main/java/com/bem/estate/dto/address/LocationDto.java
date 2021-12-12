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
public class LocationDto {


    @ApiModelProperty(value = "city", example = SwaggerExampleConstants.CITY)
    private Long city;

    @ApiModelProperty(value = "district", example = SwaggerExampleConstants.DISTRICT)
    private Long district;

    @ApiModelProperty(value = "province", example = SwaggerExampleConstants.PROVINCE)
    private Long province;

//    @ApiModelProperty(value = "village", example = SwaggerExampleConstants.VILLAGE)
//    private Long village;

    @ApiModelProperty(value = "economicRegion", example = SwaggerExampleConstants.ECONOMIC_REGION)
    private Long economicRegion;

    @ApiModelProperty(value = "address description", example = SwaggerExampleConstants.ADDRESS_DESCRIPTION)
    private String addressInfo;


    @ApiModelProperty(value = "latitude", example = SwaggerExampleConstants.LATITUDE)
    private Double lat_d;

    @ApiModelProperty(value = "longtitude", example = SwaggerExampleConstants.LONGTITUDE)
    private Double long_t;
}
