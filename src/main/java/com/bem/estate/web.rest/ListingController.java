package com.bem.estate.web.rest;

import com.bem.estate.constant.SwaggerConstants;
import com.bem.estate.dto.ListingDto;
import com.bem.estate.service.ListingService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/listing")
public class ListingController {
    private final ListingService listingService;

    @PostMapping
    @ApiOperation(SwaggerConstants.SAVE_LISTING)
    private ResponseEntity<ListingDto> saveListing(@ApiParam(name = "Listing Dto", value = "Fields/Sub-objects of Listing Dto")
                                             @RequestBody ListingDto listingDto) {
        listingService.saveListing(listingDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();

    }

    @GetMapping("/")
    @ApiOperation(SwaggerConstants.GET_ALL_LISTINGS)

    private List<ListingDto> getListings(){
       return listingService.getAllListings();
     }
}
