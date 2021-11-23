package com.bem.estate.service.impl;

import com.bem.estate.domain.Elan;
import com.bem.estate.domain.Home;
import com.bem.estate.dto.address.CityDto;
import com.bem.estate.dto.ElanDto;
import com.bem.estate.dto.address.DistrictDto;
import com.bem.estate.dto.mapper.CityMapper;
import com.bem.estate.dto.mapper.DistrictMapper;
import com.bem.estate.dto.mapper.ElanMapper;
import com.bem.estate.dto.mapper.HomeMapper;
import com.bem.estate.repo.ElanRepo;
import com.bem.estate.service.CityService;
import com.bem.estate.service.DistrictService;
import com.bem.estate.service.ElanService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ElanServiceImpl implements ElanService {
    private final ElanRepo elanRepo;



    @Override
    public void saveElan(ElanDto elanDto) {
        elanRepo.save(ElanMapper.INSTANCE.elanDtoToElan(elanDto));

    }


}
