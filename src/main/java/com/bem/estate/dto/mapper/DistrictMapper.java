package com.bem.estate.dto.mapper;

import com.bem.estate.domain.address.District;
import com.bem.estate.dto.address.DistrictDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DistrictMapper {

    DistrictMapper INSTANCE = Mappers.getMapper(DistrictMapper.class);


    DistrictDto DistrictToDistrictDto(District District);

    District DistrictDtoToDistrict(DistrictDto DistrictDto);

}
