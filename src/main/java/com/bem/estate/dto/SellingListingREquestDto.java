package com.bem.estate.dto;

import com.bem.estate.constant.SwaggerExampleConstants;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SellingListingREquestDto extends ListingRequestDto{



    @ApiModelProperty(value = "availableForMortgage", example = SwaggerExampleConstants.TRUE)
    private Boolean availableForMortgage;

    @ApiModelProperty(value = "barterAvailable", example = SwaggerExampleConstants.TRUE)
    private Boolean barterAvailable;


    @ApiModelProperty(value = "hasDocument", example = SwaggerExampleConstants.TRUE)
    private Boolean hasDocument;

    @ApiModelProperty(value = "nowOnMortgage", example = SwaggerExampleConstants.TRUE)
    private Boolean nowOnMortgage;


}

