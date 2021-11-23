package com.bem.estate.service.impl;

import com.bem.estate.domain.Elan;
import com.bem.estate.dto.ElanDto;
import com.bem.estate.dto.mapper.ElanMapper;
import com.bem.estate.repo.ElanRepo;
import com.bem.estate.service.ElanService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ElanServiceImpl implements ElanService {
    private final ElanRepo elanRepo;

    @Override
    public List<Elan> findElans(String elanType,
                                String propertyType,
                                String city, String priceFrom, String priceTo) {
return null;    }

    @Override
    public Elan saveElan(ElanDto elanDto) {
//        elanDto.getHome().getLocation()
        Elan elan = ElanMapper.INSTANCE.elanDtoToElan(elanDto);
        return elanRepo.save(elan);
    }
}
