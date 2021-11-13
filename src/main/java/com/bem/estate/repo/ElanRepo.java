package com.bem.estate.repo;

import com.bem.estate.domain.Elan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ElanRepo extends JpaRepository<Elan, Long> {
}
