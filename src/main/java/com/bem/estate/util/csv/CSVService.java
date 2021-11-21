package com.bem.estate.util.csv;

import com.bem.estate.repo.TestRepo;
import com.bem.estate.repo.eco;
import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvException;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;


@RequiredArgsConstructor
@Service
public class CSVService {
    private final TestRepo repo;

    public List converter() throws FileNotFoundException {
        List<eco> pojos = new CsvToBeanBuilder(new FileReader("src/email.csv"))
                .withType(eco.class)
                .build()
                .parse();
        System.out.println("reading"+pojos);

        pojos.stream()
                .forEach(x-> repo.save(x));
        return pojos;
    }
}
//todo ; ile ayirma, bu ancaq vergul ile ayirir.