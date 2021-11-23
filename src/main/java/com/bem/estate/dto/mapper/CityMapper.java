package com.bem.estate.dto.mapper;

import com.bem.estate.domain.address.City;
import com.bem.estate.dto.address.CityDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CityMapper {

    CityMapper INSTANCE = Mappers.getMapper(CityMapper.class);


    CityDto cityToCityDto(City city);

    City cityDtoToCity(CityDto cityDto);

}
