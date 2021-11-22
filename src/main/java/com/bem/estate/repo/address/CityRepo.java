package com.bem.estate.repo.address;

import com.bem.estate.domain.address.City;
import com.bem.estate.domain.address.EconomicRegion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepo extends JpaRepository<City, Long> {
}
