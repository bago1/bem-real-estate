package com.bem.estate;

import com.bem.estate.repo.eco;
import com.bem.estate.repo.TestRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class EstateApplication implements CommandLineRunner {
    private final TestRepo repo;

    public static void main(String[] args) {
        SpringApplication.run(EstateApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        eco t = new eco(null,"yanni");

        repo.save(t);
    }
}
