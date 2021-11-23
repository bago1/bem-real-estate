package com.bem.estate.repo.address;

import com.bem.estate.domain.address.City;
import com.bem.estate.domain.address.District;
import com.bem.estate.domain.address.Province;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProvinceRepo extends JpaRepository<Province, Long> {
    List<Province> findByDistrict_Id(Long cityId);

}
