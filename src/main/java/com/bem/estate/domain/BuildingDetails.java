package com.bem.estate.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@RequiredArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class BuildingDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    Locations id;
    Integer floor_number;
    Boolean building_document;
    Boolean building_gas;

    String delivery_year;
    Boolean central_heat;

    BuildingDestination id;
    BuildingFacilities id;

    BuildingType id;




}
