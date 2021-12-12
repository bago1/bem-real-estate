package com.bem.estate.dto.mapper;

import com.bem.estate.domain.address.District;
import com.bem.estate.domain.address.District;
import com.bem.estate.dto.address.DistrictDto;
import com.bem.estate.dto.address.DistrictDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.data.domain.Page;

@Mapper
public interface DistrictMapper {

    DistrictMapper INSTANCE = Mappers.getMapper(DistrictMapper.class);


    DistrictDto DistrictToDistrictDto(District District);

    District DistrictDtoToDistrict(DistrictDto DistrictDto);


//    Page<District> DistrictDtoPageToDistrictPage(Page<DistrictDto> DistrictDto);

  //   Page<DistrictDto> map(Page<District> districts);
}
