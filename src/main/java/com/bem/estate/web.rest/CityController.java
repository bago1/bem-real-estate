package com.bem.estate.web.rest;

import com.bem.estate.constant.SwaggerConstants;
import com.bem.estate.domain.address.City;
import com.bem.estate.dto.address.CityDto;
import com.bem.estate.service.CityService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("/city")
public class CityController {
    private final CityService cityService;

    @GetMapping("/")
    @ApiOperation(SwaggerConstants.GET_ALL_CITIES)
    private Page<CityDto> getAllCities(Pageable pageable) {
        return cityService.getAll(pageable);
    }

    @GetMapping("/{id}")
    @ApiOperation(SwaggerConstants.GET_CITY_BY_ID)
    private CityDto getById(int id) {
        return cityService.findById(id);
    }
}
