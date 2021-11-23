package com.bem.estate.web.rest;

import com.bem.estate.constant.SwaggerConstants;
import com.bem.estate.dto.ElanDto;
import com.bem.estate.service.ElanService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CityController {
    private final ElanService elanService;

    @PostMapping
    @ApiOperation(SwaggerConstants.SAVE_ELAN)
    private ResponseEntity<ElanDto> saveElan(@RequestBody ElanDto elanDto) {

        elanService.saveElan(elanDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();

    }
}
