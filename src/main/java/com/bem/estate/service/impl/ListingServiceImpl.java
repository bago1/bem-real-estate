package com.bem.estate.service.impl;

import com.bem.estate.domain.Listing;
import com.bem.estate.dto.ListingDto;
import com.bem.estate.dto.mapper.ListingMapper;
import com.bem.estate.enums.Status;
import com.bem.estate.repo.ListingRepo;
import com.bem.estate.service.ListingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ListingServiceImpl implements ListingService {
    private final ListingRepo listingRepo;


    @Override
    public List<ListingDto> getAllListings() {
       return ListingMapper.INSTANCE.listingListToListingDtoList(listingRepo.findAll());
     }


    @Override
    public void saveListing(ListingDto listingDto) {
        Listing entity = ListingMapper.INSTANCE.listingDtoToListing(listingDto);
        entity.setStatus(Status.ACTIVE);
        listingRepo.save(entity);
    }

}
