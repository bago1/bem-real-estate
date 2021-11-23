package com.bem.estate.web.rest;

import com.bem.estate.constant.SwaggerConstants;
import com.bem.estate.domain.address.City;
import com.bem.estate.dto.ElanDto;
import com.bem.estate.service.CityService;
import com.bem.estate.service.ElanService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class CityController {
    private final CityService cityService;

    @GetMapping("/city/")
    @ApiOperation(SwaggerConstants.GET_ALL_CITIES)
    private Page<City> getAllCities(Pageable pageable) {

        return cityService.getAll(pageable);

    }
}
