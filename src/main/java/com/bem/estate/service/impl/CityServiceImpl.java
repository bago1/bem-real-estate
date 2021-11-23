package com.bem.estate.service.impl;

import com.bem.estate.domain.address.City;
import com.bem.estate.dto.address.CityDto;
import com.bem.estate.dto.mapper.CityMapper;
import com.bem.estate.repo.address.CityRepo;
import com.bem.estate.service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CityServiceImpl implements CityService {
    private final CityRepo cityRepo;

    @Override
    public CityDto getByName(String name) {
        return CityMapper.INSTANCE.cityToCityDto(
                cityRepo.findByName(name)
                        .orElseThrow(NullPointerException::new));
    }

    @Override
    public Page<City> getAll(Pageable pageable) {
        return cityRepo.findAll(pageable);
    }
}
