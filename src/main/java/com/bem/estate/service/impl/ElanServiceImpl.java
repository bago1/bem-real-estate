package com.bem.estate.service.impl;

import com.bem.estate.domain.Elan;
import com.bem.estate.dto.address.CityDto;
import com.bem.estate.dto.ElanDto;
import com.bem.estate.dto.address.DistrictDto;
import com.bem.estate.dto.mapper.CityMapper;
import com.bem.estate.dto.mapper.DistrictMapper;
import com.bem.estate.dto.mapper.ElanMapper;
import com.bem.estate.repo.ElanRepo;
import com.bem.estate.service.CityService;
import com.bem.estate.service.DistrictService;
import com.bem.estate.service.ElanService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ElanServiceImpl implements ElanService {
    private final ElanRepo elanRepo;
    private final CityService cityService;
    private final DistrictService districtService;

    @Override
    public List<Elan> findElans(String elanType,
                                String propertyType,
                                String city, String priceFrom, String priceTo) {
        return null;
    }

    @Override
    public Elan saveElan(ElanDto elanDto) {
        Elan elan = ElanMapper.INSTANCE.elanDtoToElan(elanDto);
        mapFieldsToEntity(elanDto, elan);
        return elanRepo.save(elan);
    }

    private void mapFieldsToEntity(ElanDto elanDto, Elan elan) {
        CityDto cityDto = cityService.getByName(elanDto.getHome().getLocation().getCity());
        DistrictDto districtDto = districtService.getByName(elanDto.getHome().getLocation().getDistrict());
        elan.getHome().getLocation().setCity(CityMapper.INSTANCE.cityDtoToCity(cityDto));
        elan.getHome().getLocation().setDistrict(DistrictMapper.INSTANCE.DistrictDtoToDistrict(districtDto));
    }
}
