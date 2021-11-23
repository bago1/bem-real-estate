package com.bem.estate.dto.mapper;

import com.bem.estate.domain.Elan;
import com.bem.estate.domain.Home;
import com.bem.estate.dto.ElanDto;
import com.bem.estate.dto.HomeDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ElanMapper {

    ElanMapper INSTANCE = Mappers.getMapper(ElanMapper.class);

    @Mapping(source = "home.location.city",target = "home.location.city")
    @Mapping(source = "home.location.province",target = "home.location.province")
    @Mapping(source = "home.location.district",target = "home.location.district")
    @Mapping(source = "home.location.economicRegion",target = "home.location.economicRegion")
    @Mapping(source = "home.location.village",target = "home.location.village")
    Elan elanDtoToElan(ElanDto elanDto);

}
