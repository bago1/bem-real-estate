package com.bem.estate.service;

import com.bem.estate.dto.address.CityDto;

public interface CityService {
    CityDto getByName(String name);
}
