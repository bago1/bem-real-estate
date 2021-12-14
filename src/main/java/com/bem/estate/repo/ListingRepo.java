package com.bem.estate.repo;

import com.bem.estate.domain.Listing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ListingRepo extends JpaRepository<Listing, Long> {


    @Query("select e from Listing  e " +
            "WHERE e.listingType=:listingType")
    List<Listing> getListingByRequestedFields(String listingType);
}














