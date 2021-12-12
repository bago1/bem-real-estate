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
    Long id;
    Boolean combiBoiler;
    Boolean internet;
    Boolean cableTv;
    Boolean telephone;
    Boolean storage;
    Boolean showerCabin;
    Integer airConditioner;
    Boolean hotFloor;
    String floorType;
    Boolean furniture;
    String remained_furniture;
    Boolean gas;
    Boolean centralHeat;




}
