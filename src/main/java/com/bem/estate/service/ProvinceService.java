package com.bem.estate.service;

import com.bem.estate.domain.address.Province;
import com.bem.estate.dto.address.ProvinceDto;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ProvinceService {
    Page<ProvinceDto> getProvincesByDistrictId(Long districtId);

}
