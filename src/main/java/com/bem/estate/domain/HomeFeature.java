package com.bem.estate.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@NoArgsConstructor
@Setter
@Getter
@SequenceGenerator(name = "HomeFeatureSequence", allocationSize = 1,sequenceName = "SQ_homeFeature")
public class HomeFeature {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "HomeFeatureSequence")
    Boolean kombi;
    Boolean internet;
    Boolean kabelTv;
    Boolean telefon;
    Boolean storage;
    Boolean showerCabin;
    Boolean jakuzi;
    Integer airConditioner;
    Boolean hot_floor;
    String floor_type;
    Boolean furnitured;
    String remained_furnitures;
    Boolean gas;
    Boolean central_heat;




}
