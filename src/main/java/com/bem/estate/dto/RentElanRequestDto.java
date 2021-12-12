package com.bem.estate.dto;

import com.bem.estate.constant.SwaggerExampleConstants;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RentElanRequestDto extends ElanRequestDto {


    @ApiModelProperty(value = "rentType", example = SwaggerExampleConstants.MONTHLY)
    private Boolean rentType;

}

