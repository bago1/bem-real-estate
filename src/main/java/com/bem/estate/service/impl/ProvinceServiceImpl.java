package com.bem.estate.service.impl;

import com.bem.estate.domain.address.District;
import com.bem.estate.domain.address.Province;
import com.bem.estate.repo.address.DistrictRepo;
import com.bem.estate.repo.address.ProvinceRepo;
import com.bem.estate.service.DistrictService;
import com.bem.estate.service.ProvinceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProvinceServiceImpl implements ProvinceService {
    private final ProvinceRepo provinceRepo;

    @Override
    public List<Province> getProvincesByDistrict(Long districtId) {
        return provinceRepo.findByDistrict_Id(districtId);
    }
}
