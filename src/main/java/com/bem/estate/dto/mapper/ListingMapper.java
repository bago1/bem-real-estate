package com.bem.estate.dto.mapper;

import com.bem.estate.domain.Listing;
import com.bem.estate.dto.ListingDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ListingMapper {

    ListingMapper INSTANCE = Mappers.getMapper(ListingMapper.class);

    @Mapping(source = "home.location.city", target = "home.location.cityId")
    @Mapping(source = "home.location.province", target = "home.location.provinceId")
    @Mapping(source = "home.location.district", target = "home.location.districtId")
    @Mapping(source = "home.location.economicRegion", target = "home.location.economicRegionId")
    @Mapping(source = "home.homeDetail.repairSituation", target = "home.homeDetail.repairSituation")
    Listing listingDtoToListing(ListingDto listingDto);

    List<ListingDto> listingListToListingDtoList(List<Listing> listings);

}
