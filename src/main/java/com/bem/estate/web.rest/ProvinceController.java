package com.bem.estate.web.rest;

import com.bem.estate.constant.SwaggerConstants;
import com.bem.estate.constant.SwaggerExampleConstants;
import com.bem.estate.domain.address.Province;
import com.bem.estate.dto.address.ProvinceDto;
import com.bem.estate.service.ProvinceService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("/province")
public class ProvinceController {

    private final ProvinceService provinceService;

    @GetMapping("/all")
    @ApiOperation(SwaggerConstants.GET_PROVINCES_BY_DISTRICT)
    private Page<ProvinceDto> getDistrictsByCityId(
            @ApiParam(value = "District id",example = SwaggerExampleConstants.DISTRICT_ID) @RequestParam Long districtId) {
        return provinceService.getProvincesByDistrictId(districtId);

    }
}
