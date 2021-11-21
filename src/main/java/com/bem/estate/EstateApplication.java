package com.bem.estate;

import com.bem.estate.repo.eco;
import com.bem.estate.repo.TestRepo;
import com.bem.estate.util.csv.CSVService;
import com.bem.estate.util.csv.CsvPojo;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class EstateApplication implements CommandLineRunner {
    private final TestRepo repo;
    private final CSVService service;

    public static void main(String[] args) {
        SpringApplication.run(EstateApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        eco t = new eco(null,"kula");

//        repo.save(t);
        service.converter();


//          converter.stream()
//                  .forEach(x->repo.save(x));

//        converter.stream()
//                .forEach(x-> repo.save(x));

    }
}
