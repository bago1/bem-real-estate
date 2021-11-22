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

    Elan elanDtoToElan(ElanDto elanDto);

    ElanDto elanToElanDto(Elan elan);
}
