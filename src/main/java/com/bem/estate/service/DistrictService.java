package com.bem.estate.service;

import com.bem.estate.domain.address.District;
import com.bem.estate.dto.address.DistrictDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface DistrictService {
    Page<DistrictDto> getDistrictsByCityId(Long cityId, Pageable pageable);
    DistrictDto getDistrictById(Long id);
}
