package com.bem.estate.service;

import com.bem.estate.domain.Elan;
import com.bem.estate.dto.ElanDto;
import com.bem.estate.dto.SellingElanRequestDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ElanService {
    void saveElan(ElanDto elanDto);

    List<ElanDto> getAllELans();
//    void deactivateElan(String elanId);
//    Boolean elanExpired(String elanId);
//    Elan getElan(Object o);


//    List<Elan> findElanByFields(SellingElanRequestDto request);
}
