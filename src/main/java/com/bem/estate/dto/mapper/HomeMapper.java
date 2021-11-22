package com.bem.estate.dto.mapper;

import com.bem.estate.domain.Elan;
import com.bem.estate.domain.Home;
import com.bem.estate.dto.ElanDto;
import com.bem.estate.dto.HomeDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface HomeMapper {

    HomeMapper INSTANCE = Mappers.getMapper(HomeMapper.class);


    Home homeDtoToHome(HomeDto homeDto);
    HomeDto hometoHomeDto(Home home);
}
