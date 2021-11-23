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
@SequenceGenerator(name = "buildingFeatureSequence", allocationSize =1,sequenceName = "SQ_buildingFeature")
public class BuildingFeature {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "buildingFeatureSequence")
    Long id;
    Boolean centralHeat;

    Boolean lift;
    Boolean security;
    Boolean undergroundGarage;
    Boolean ongroundGarage;
    Boolean waterDepo;
    Boolean childrenPark;



}
