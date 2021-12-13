package com.bem.estate.web.rest;

import com.bem.estate.constant.SwaggerConstants;
import com.bem.estate.dto.ElanDto;
import com.bem.estate.service.ElanService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/")
    private List<ElanDto> getELans(){
       return elanService.getAllELans();
     }
}
