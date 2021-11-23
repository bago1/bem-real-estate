package com.bem.estate.dto.address;

import com.bem.estate.constant.SwaggerExampleConstants;
import com.bem.estate.domain.address.City;
import com.bem.estate.domain.address.District;
import com.bem.estate.domain.address.EconomicRegion;
import com.bem.estate.domain.address.Province;
import com.bem.estate.domain.address.Village;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LocationDto {
    @ApiModelProperty(value = "square", example = SwaggerExampleConstants.SQUARE)
    private Double square;

    @ApiModelProperty(value = "price", example = SwaggerExampleConstants.PRICE)
    private String price;

    @ApiModelProperty(value = "city", example = SwaggerExampleConstants.CITY)
    private String city;

    @ApiModelProperty(value = "district", example = SwaggerExampleConstants.DISTRICT)
    private String district;

    @ApiModelProperty(value = "province", example = SwaggerExampleConstants.PROVINCE)
    private String province;

    @ApiModelProperty(value = "village", example = SwaggerExampleConstants.VILLAGE)
    private String village;

    @ApiModelProperty(value = "economicRegion", example = SwaggerExampleConstants.ECONOMIC_REGION)
    String economicRegion;

    @ApiModelProperty(value = "address description", example = SwaggerExampleConstants.ADDRESS_DESCRIPTION)
    private String addressInfo;


    @ApiModelProperty(value = "latitude", example = SwaggerExampleConstants.LATITUDE)
    private Double lat_d;

    @ApiModelProperty(value = "longtitude", example = SwaggerExampleConstants.LONGTITUDE)
    private Double long_t;
}
