package com.bem.estate.service;

import com.bem.estate.domain.Elan;
import com.bem.estate.dto.ElanDto;

import java.util.List;

public interface ElanService {
     Elan saveElan(ElanDto elanDto);

    List<Elan> findElans(String elanType, String propertyType, String city, String priceFrom, String priceTo);
}
