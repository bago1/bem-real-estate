package com.bem.estate.util;

import com.bem.estate.domain.address.City;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
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