package com.bem.estate.dto.mapper;

import com.bem.estate.domain.Elan;
import com.bem.estate.dto.ElanDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ElanMapper {

    ElanMapper INSTANCE = Mappers.getMapper(ElanMapper.class);

    @Mapping(source = "home.location.city", target = "home.location.cityId")
    @Mapping(source = "home.location.province", target = "home.location.provinceId")
    @Mapping(source = "home.location.district", target = "home.location.districtId")
    @Mapping(source = "home.location.economicRegion", target = "home.location.economicRegionId")
    @Mapping(source = "home.homeDetail.repairSituation", target = "home.homeDetail.repairSituation")
    Elan elanDtoToElan(ElanDto elanDto);

    List<ElanDto> elanListToELanDtoList(List<Elan> elans);

}
