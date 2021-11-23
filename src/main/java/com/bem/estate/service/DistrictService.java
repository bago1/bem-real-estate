package com.bem.estate.service;

import com.bem.estate.dto.address.DistrictDto;

public interface DistrictService {
    DistrictDto getByName(String name);
}
