package com.bem.estate.repo.address;

import com.bem.estate.domain.address.City;
import com.bem.estate.domain.address.Province;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProvinceRepo extends JpaRepository<Province, Long> {
}
