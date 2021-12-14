package com.bem.estate.dto;

import com.bem.estate.constant.SwaggerExampleConstants;
import com.bem.estate.dto.address.LocationDto;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class HomeDto {

    @NotBlank
    @ApiModelProperty(value = "squareOnContract", example = SwaggerExampleConstants.SQUARE)
    private Double squareOnContract;

    @ApiModelProperty(value = "squareOnDocument", example = SwaggerExampleConstants.SQUARE)
    private Double squareOnDocument;

    @NotBlank
    @ApiModelProperty(value = "price", example = SwaggerExampleConstants.PRICE)
    private Double price;

    @NotBlank
    @ApiModelProperty(value = "roomNumber", example = SwaggerExampleConstants.ROOM_NUMBER)
    private Integer roomNumber;

    @NotBlank
    @ApiModelProperty(value = "description", example = SwaggerExampleConstants.LISTING_DESCRIPTION)
    private String description;

    private LocationDto location;

    private HomeDetailDto homeDetail;
    private HomeFeatureDto homeFeature;


}
