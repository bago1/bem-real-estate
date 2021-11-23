package com.bem.estate.service.impl;

import com.bem.estate.dto.address.CityDto;
import com.bem.estate.dto.address.DistrictDto;
import com.bem.estate.dto.mapper.CityMapper;
import com.bem.estate.dto.mapper.DistrictMapper;
import com.bem.estate.repo.address.CityRepo;
import com.bem.estate.repo.address.DistrictRepo;
import com.bem.estate.service.CityService;
import com.bem.estate.service.DistrictService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DistrictServiceImpl implements DistrictService {
    private final DistrictRepo districtRepo;

    @Override
    public DistrictDto getByName(String name) {
        return DistrictMapper.INSTANCE.DistrictToDistrictDto(
                districtRepo.findByCity(name)
                        .orElseThrow(NullPointerException::new));
    }
}
