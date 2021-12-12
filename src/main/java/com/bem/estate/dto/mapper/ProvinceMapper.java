package com.bem.estate.dto.mapper;

import com.bem.estate.domain.address.Province;
import com.bem.estate.dto.address.ProvinceDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.data.domain.Page;

@Mapper
public interface ProvinceMapper {

    ProvinceMapper INSTANCE = Mappers.getMapper(ProvinceMapper.class);


    ProvinceDto ProvinceToProvinceDto(Province Province);


    Province ProvinceDtoToProvince(ProvinceDto ProvinceDto);

//   Page<Province> ProvinceDtoPageToProvincePage(Page<ProvinceDto> ProvinceDto);
//   Page<ProvinceDto> map(Page<Province> Province);


}
