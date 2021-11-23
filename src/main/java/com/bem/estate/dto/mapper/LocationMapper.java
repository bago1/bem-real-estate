package com.bem.estate.dto.mapper;

import com.bem.estate.domain.Elan;
import com.bem.estate.domain.address.Location;
import com.bem.estate.dto.ElanDto;
import com.bem.estate.dto.address.LocationDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.time.LocalDate;

@Mapper
public interface LocationMapper {

    LocationMapper INSTANCE = Mappers.getMapper(LocationMapper.class);
//
//    @Mapping(target = "cityId", source = "city")
//    @Mapping(target = "districtId", source = "district")
//    @Mapping(target = "provinceId", source = "province")
////    @Mapping(target = "villageId", source = "village")
//    @Mapping(target = "economicRegionId", source = "economicRegion")
//    Location locationDtoToLocation(LocationDto locationDto);

}
