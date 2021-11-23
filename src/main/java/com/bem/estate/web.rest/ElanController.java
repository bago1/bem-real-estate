package com.bem.estate.web.rest;

import com.bem.estate.constant.SwaggerConstants;
import com.bem.estate.domain.Elan;
import com.bem.estate.dto.ElanDto;
import com.bem.estate.service.ElanService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ElanController {
    private final ElanService elanService;

    @ApiOperation(SwaggerConstants.SAVE_ELAN)
    @PostMapping
    private ResponseEntity<Elan> saveElan(@RequestBody ElanDto elanDto) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(elanService.saveElan(elanDto));
    }

//    @PostMapping
//    private ResponseEntity<List<Elan>> getElans(
//            @RequestParam String elanType,
//            @RequestParam String propertyType,
//            @RequestParam String city,
//            @RequestParam String priceFrom,
//            @RequestParam String priceTo) {
//        return ResponseEntity
//                .ok(elanService.findElans(elanType, propertyType, city, priceFrom, priceTo));
//    }
}
//todo heleki ancaq 1 property typea gore olsun, sonra 1 veya daha artiqin qoymaga baxacam
//https://bina.az/baki/alqi-satqi/menziller?price_from=12&price_to=2121