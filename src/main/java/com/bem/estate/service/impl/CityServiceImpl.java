package com.bem.estate.service.impl;

import com.bem.estate.domain.address.City;
import com.bem.estate.dto.address.CityDto;
import com.bem.estate.dto.mapper.CityMapper;
import com.bem.estate.repo.address.CityRepo;
import com.bem.estate.service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CityServiceImpl implements CityService {
    private final CityRepo cityRepo;
    private final CityMapper cityMapper;

    @Override
    public CityDto getByName(String name) {
        return null;
    }

    @Override
    public CityDto findById(long id) {
       return CityMapper.INSTANCE.cityToCityDto(
               cityRepo.findById(id)
                       .orElseThrow(NullPointerException::new));
    }

    @Override
    public Page<CityDto> getAll(Pageable pageable) {
         List<City> cities = cityRepo.findAll();
         List<CityDto> cityDtos = cityMapper.cityListToCityDtoList(cities);
          PageImpl<CityDto> cityDtoPage = new PageImpl<>(cityDtos);
          return cityDtoPage;
    }
}

