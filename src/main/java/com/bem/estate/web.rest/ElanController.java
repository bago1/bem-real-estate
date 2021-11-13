package com.bem.estate.web.rest;

import com.bem.estate.domain.Elan;
import com.bem.estate.service.ElanService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ElanController {
    private final ElanService elanService;

    @PostMapping
    private void saveElan(@RequestBody Elan elan) {
        System.out.println("come to controller");
        elanService.saveElan(elan);
    }
}
//metodlar private yoxsa public olur?