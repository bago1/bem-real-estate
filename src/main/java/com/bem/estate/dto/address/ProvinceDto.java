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
public class ProvinceDto {
    @ApiModelProperty(value = "id", example = SwaggerExampleConstants.ONE)
    private long id;

    @ApiModelProperty(value = "province", example = SwaggerExampleConstants.PROVINCE)
    private String province;

    private DistrictDto district;


}
