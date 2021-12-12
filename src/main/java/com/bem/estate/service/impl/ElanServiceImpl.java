package com.bem.estate.service.impl;

import com.bem.estate.domain.Elan;
import com.bem.estate.dto.ElanDto;
import com.bem.estate.dto.SellingElanRequestDto;
import com.bem.estate.dto.mapper.ElanMapper;
import com.bem.estate.enums.Status;
import com.bem.estate.repo.ElanRepo;
import com.bem.estate.service.ElanService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ElanServiceImpl implements ElanService {
    private final ElanRepo elanRepo;


   // @Override
//    public List<Elan> findElanByFields(SellingElanRequestDto request) {
//return elanRepo.getElanByRequestedFields(request);
//                return null;
//        }
    @Override
    public void saveElan(ElanDto elanDto) {
        Elan entity = ElanMapper.INSTANCE.elanDtoToElan(elanDto);
        entity.setStatus(Status.ACTIVE);
        elanRepo.save(entity);
    }

}
