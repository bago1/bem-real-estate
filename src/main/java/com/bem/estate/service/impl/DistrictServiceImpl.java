package com.bem.estate.service.impl;

import com.bem.estate.dto.address.DistrictDto;
import com.bem.estate.dto.mapper.DistrictMapper;
import com.bem.estate.repo.address.DistrictRepo;
import com.bem.estate.service.CityService;
import com.bem.estate.service.DistrictService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DistrictServiceImpl implements DistrictService {
    private final DistrictRepo districtRepo;
    private final CityService cityService;

    @Override
    public Page<DistrictDto> getDistrictsByCityId(Long cityId, Pageable pageable) {
        if (cityService.findById(cityId) != null) {
           // return DistrictMapper.INSTANCE.map(districtRepo.findByCity_Id(cityId, pageable));
        }
        return null;
    }

    @Override
    public DistrictDto getDistrictById(Long id) {
        return DistrictMapper.INSTANCE.DistrictToDistrictDto( districtRepo.findById(id).orElseThrow(NullPointerException::new));
    }


}
