package com.bem.estate.web.rest;

import com.bem.estate.constant.SwaggerConstants;
import com.bem.estate.domain.Elan;
import com.bem.estate.dto.ElanDto;
import com.bem.estate.dto.SellingElanRequestDto;
import com.bem.estate.service.ElanService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/elan")
public class ElanController {
    private final ElanService elanService;

    @PostMapping
    @ApiOperation(SwaggerConstants.SAVE_ELAN)
    private ResponseEntity<ElanDto> saveElan(@ApiParam(name = "Elan Dto", value = "Fields/Sub-objects of Elan Dto")
                                             @RequestBody ElanDto elanDto) {
        elanService.saveElan(elanDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();

    }

    @PostMapping("/mapsa")
    private void createSellingElan(@RequestParam Map<String,String> allParams){
        System.out.println(allParams.entrySet());
    }
}
