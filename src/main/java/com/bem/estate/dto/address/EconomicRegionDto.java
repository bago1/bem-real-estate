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


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EconomicRegionDto {
    @ApiModelProperty(value = "economic region", example = SwaggerExampleConstants.ECONOMIC_REGION)
    private String name;


}