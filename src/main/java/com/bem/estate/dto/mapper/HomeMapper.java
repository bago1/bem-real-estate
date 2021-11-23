package com.bem.estate.dto.mapper;

import com.bem.estate.domain.Elan;
import com.bem.estate.domain.Home;
import com.bem.estate.dto.ElanDto;
import com.bem.estate.dto.HomeDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface HomeMapper {

    HomeMapper INSTANCE = Mappers.getMapper(HomeMapper.class);

//    @Mapping(source = "location.city", target = "location.city.name")
//    @Mapping(source = "location.province", target = "location.province.name")
//    @Mapping(source = "location.district", target = "location.district.name")
//    @Mapping(source = "location.economicRegion", target = "location.economicRegion.name")
//    @Mapping(source = "location.village", target = "location.village.name")
//    Home homeDtoToHoe(HomeDto homeDto);

}
