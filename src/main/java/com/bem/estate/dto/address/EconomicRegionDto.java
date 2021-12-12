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
public class EconomicRegionDto {
    @ApiModelProperty(value = "economic region", example = SwaggerExampleConstants.ECONOMIC_REGION)
    private String name;


}
