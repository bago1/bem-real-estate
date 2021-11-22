package com.bem.estate.util;

import com.bem.estate.domain.address.City;
import com.bem.estate.domain.address.EconomicRegion;
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


public class CSVService {

    public List csvToList() throws FileNotFoundException {
        return new CsvToBeanBuilder(new FileReader("src/city.csv"))
                .withType(City.class)
                .build()
                .parse();

    }
}
//todo ; ile ayirma, bu ancaq vergul ile ayirir.