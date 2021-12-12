package com.bem.estate.repo.address;

import com.bem.estate.domain.address.District;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DistrictRepo extends JpaRepository<District, Long> {

    Page<District> findByCity_Id(Long cityId, Pageable pageable);
}
