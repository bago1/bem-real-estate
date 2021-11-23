package com.bem.estate.web.rest;

import com.bem.estate.constant.SwaggerConstants;
import com.bem.estate.constant.SwaggerExampleConstants;
import com.bem.estate.domain.address.Province;
import com.bem.estate.service.ProvinceService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class ProvinceController {

    private final ProvinceService provinceService;

    @GetMapping("/province/district/{id}")
    @ApiOperation(SwaggerConstants.GET_PROVINCES_BY_DISTRICT)
    private List<Province> getDistrictsByCity(
            @ApiParam(
                    value = "District id",
                    example = SwaggerExampleConstants.DISTRICT_ID)
            @PathVariable Long id) {
        return provinceService.getProvincesByDistrict(id);

    }


}
