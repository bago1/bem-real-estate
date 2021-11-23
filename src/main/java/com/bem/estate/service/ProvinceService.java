package com.bem.estate.service;

import com.bem.estate.domain.address.District;
import com.bem.estate.domain.address.Province;

import java.util.List;

public interface ProvinceService {
    List<Province> getProvincesByDistrict(Long districtId);

}
