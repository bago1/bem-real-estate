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
public class MTKDto {

    @NotBlank
    @ApiModelProperty(value = "mtkName", example = SwaggerExampleConstants.MTK_NAME)
    private String  name ;



}
//todo liquibase qosmaliyam initial datalar ucun. her de fe table silmeye qorxmuyub db-ni sile bilmeliyem