package com.bem.estate.repo.address;

import com.bem.estate.domain.address.City;
import com.bem.estate.domain.address.District;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DistrictRepo extends JpaRepository<District, Long> {
}
