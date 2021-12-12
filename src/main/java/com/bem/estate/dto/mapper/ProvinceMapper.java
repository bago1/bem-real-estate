package com.bem.estate.dto.mapper;

import com.bem.estate.domain.address.City;
import com.bem.estate.dto.address.CityDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.data.domain.Page;

@Mapper
public interface CityMapper {

    CityMapper INSTANCE = Mappers.getMapper(CityMapper.class);


    CityDto cityToCityDto(City city);


    City cityDtoToCity(CityDto cityDto);

   Page<City> cityDtoPageToCityPage(Page<CityDto> cityDto);
   Page<CityDto> cityPageToCityDtoPage(Page<City> city);


}
