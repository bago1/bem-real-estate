package com.bem.estate.dto;

import com.bem.estate.constant.SwaggerExampleConstants;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RentListingRequestDto extends ListingRequestDto {


    @ApiModelProperty(value = "rentType", example = SwaggerExampleConstants.MONTHLY)
    private Boolean rentType;

}

