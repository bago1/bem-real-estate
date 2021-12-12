package com.bem.estate.service.impl;

import com.bem.estate.dto.address.ProvinceDto;
import com.bem.estate.dto.mapper.ProvinceMapper;
import com.bem.estate.repo.address.ProvinceRepo;
import com.bem.estate.service.DistrictService;
import com.bem.estate.service.ProvinceService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProvinceServiceImpl implements ProvinceService {
    private final ProvinceRepo provinceRepo;
    private final DistrictService districtService;

    @Override
    public Page<ProvinceDto> getProvincesByDistrictId(Long districtId) {
        districtService.getDistrictById(districtId);
   //     return ProvinceMapper.INSTANCE.map(provinceRepo.findByDistrict_Id(districtId));
        return null;

    }
}
