package com.bem.estate.dto;

import com.bem.estate.constant.SwaggerExampleConstants;
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
    @ApiModelProperty(value = "square", example = SwaggerExampleConstants.SQUARE)
    private Double square;

    @NotBlank
    @ApiModelProperty(value = "price", example = SwaggerExampleConstants.PRICE)
    private Double price;

    @NotBlank
    @ApiModelProperty(value = "roomNumber", example = SwaggerExampleConstants.ROOM_NUMBER)
    private Integer roomNumber;

    @NotBlank
    @ApiModelProperty(value = "description", example = SwaggerExampleConstants.ELAN_DESCRIPTION)
    private String description;

    private LocationDto location;


}
