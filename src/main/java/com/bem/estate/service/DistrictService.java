package com.bem.estate.service;

import com.bem.estate.domain.address.District;
import com.bem.estate.dto.address.DistrictDto;

import java.util.List;

public interface DistrictService {
    List<District> getDistrictsByCity(Long cityId);
}
