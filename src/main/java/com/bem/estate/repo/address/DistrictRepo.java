package com.bem.estate.repo.address;

import com.bem.estate.domain.address.City;
import com.bem.estate.domain.address.District;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DistrictRepo extends JpaRepository<District, Long> {
    Optional<District> findByName(String name);
}
