package com.bem.estate.service;

import com.bem.estate.dto.ListingDto;

import java.util.List;

public interface ListingService {
    void saveListing(ListingDto listingDto);

    List<ListingDto> getAllListings();

}
