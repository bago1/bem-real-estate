package com.bem.estate.repo.address;

import com.bem.estate.domain.address.City;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CityRepo extends JpaRepository<City, Long> {
    Optional<City> findByName(String name);
    List<City> findAll();
}
