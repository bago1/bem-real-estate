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
public class HomeDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    Double square;
    Double ceiling_height;
    Double price;

    Integer room_number;
    Integer floor;
    Integer balcony_number;
    Integer bath_room_number;

    String description;
    String floor_type;

    Boolean home_document;
    Boolean gas;
    Boolean room_added;
    Boolean now_on_mortgage;
    Boolean furnitured;
    Boolean in_rent_now;
    Boolean kombi;
    Boolean living_now;

    Long home_details_building_details_id;

    BuildingType buildingTypeId;
    Long home_repait_situation_id;

    Enum status;


}
