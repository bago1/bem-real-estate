package com.bem.estate.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

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
