package com.bem.estate.web.rest;

import com.bem.estate.constant.SwaggerConstants;
import com.bem.estate.constant.SwaggerExampleConstants;
import com.bem.estate.dto.address.DistrictDto;
import com.bem.estate.service.DistrictService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("/district")
public class DistrictController {

    private final DistrictService districtService;

    @GetMapping("/all/{cityId}")
    @ApiOperation(SwaggerConstants.GET_DISTRICTS_BY_CITY_ID)
    private Page<DistrictDto> getDistrictsByCityId(
            @ApiParam(value = "City id", example = SwaggerExampleConstants.CITY_ID) @RequestParam Long cityId,
            Pageable pageable) {

        return districtService.getDistrictsByCityId(cityId, pageable);
    }

}
