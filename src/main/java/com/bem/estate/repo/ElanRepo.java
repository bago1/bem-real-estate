package com.bem.estate.repo;

import com.bem.estate.domain.Elan;
import com.bem.estate.dto.SellingElanRequestDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ElanRepo extends JpaRepository<Elan, Long> {


    @Query("select e from Elan  e " +
            "WHERE e.elanType=:elantype")
    List<Elan> getElanByRequestedFields(String elantype);
}














