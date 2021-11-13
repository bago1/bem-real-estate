package com.bem.estate.service.impl;

import com.bem.estate.domain.Elan;
import com.bem.estate.repo.ElanRepo;
import com.bem.estate.service.ElanService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ElanServiceImpl implements ElanService {
    private final ElanRepo elanRepo;

    @Override
    public void saveElan(Elan elan) {
        elanRepo.save(elan);
    }
}
