package com.bem.estate.repo.address;

import com.bem.estate.domain.address.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProvinceRepo extends JpaRepository<Province, Long> {
    Page<Province> findByDistrict_Id(Long districtId, Pageable pageable);

}
