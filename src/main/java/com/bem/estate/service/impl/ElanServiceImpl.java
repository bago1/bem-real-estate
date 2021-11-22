package com.bem.estate.service.impl;

import com.bem.estate.domain.Elan;
import com.bem.estate.domain.Home;
import com.bem.estate.dto.ElanDto;
import com.bem.estate.dto.mapper.ElanMapper;
import com.bem.estate.dto.mapper.HomeMapper;
import com.bem.estate.repo.ElanRepo;
import com.bem.estate.service.ElanService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ElanServiceImpl implements ElanService {
    private final ElanRepo elanRepo;

    @Override
    public void saveElan(ElanDto elanDto) {
        Elan elan = ElanMapper.INSTANCE.elanDtoToElan(elanDto);
        Home home = HomeMapper.INSTANCE.homeDtoToHome(elanDto.getHome());
        elan.setHome(home);
        elanRepo.save(elan);
    }
}
