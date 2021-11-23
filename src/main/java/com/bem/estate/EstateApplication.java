package com.bem.estate;

import com.bem.estate.domain.address.District;
import com.bem.estate.domain.address.Province;
import com.bem.estate.dto.ImportDto;
import com.bem.estate.repo.address.CityRepo;
import com.bem.estate.repo.address.DistrictRepo;
import com.bem.estate.repo.address.EconomicRegionRepo;
import com.bem.estate.repo.address.ProvinceRepo;
import com.opencsv.bean.CsvToBeanBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileReader;
import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class EstateApplication implements CommandLineRunner {
//    private final EconomicRegionRepo economicRegionRepo;
    private final CityRepo cityRepo;
    private final DistrictRepo districtRepo;
//    private final ProvinceRepo provinceRepo;

    public static void main(String[] args) {
        SpringApplication.run(EstateApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

////        add list
//        List<ImportDto> list = new CsvToBeanBuilder(new FileReader("src/district.csv"))
//                .withType(ImportDto.class)
//                .build()
//                .parse();
//
//        System.out.println(list.toString());
//
//
//        list.stream()
//                .forEach(a -> {
//                    System.out.println("s" + a.getName());
//                    districtRepo.save(
//                            District.builder()
//                                    .name(a.getName())
//                                    .city(cityRepo.findById(a.getOtherTableId()).orElseThrow(NullPointerException::new))
//                                    .build());
//                });
    }
}
