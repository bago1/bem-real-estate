package com.bem.estate.service;

import com.bem.estate.domain.address.City;
import com.bem.estate.dto.address.CityDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface CityService {
    CityDto getByName(String name);

    Page<City> getAll(Pageable pageable);
}
