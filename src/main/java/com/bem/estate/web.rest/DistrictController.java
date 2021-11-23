package com.bem.estate.web.rest;

import com.bem.estate.constant.SwaggerConstants;
import com.bem.estate.domain.address.City;
import com.bem.estate.domain.address.District;
import com.bem.estate.service.CityService;
import com.bem.estate.service.DistrictService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class DistrictController {

    private final DistrictService districtService;

    @GetMapping("/district/city/{id}")
    @ApiOperation(SwaggerConstants.GET_DISTRICTS_BY_CITY)
    private List<District> getDistrictsByCity(Long CityId) {
        return districtService.getDistrictsByCity(CityId);

    }
}
