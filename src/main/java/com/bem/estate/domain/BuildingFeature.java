package com.bem.estate.domain;


import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Setter
//@Getter
public class BuildingFeature {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    Boolean centralHeat;

    Boolean lift;
    Boolean security;
    Boolean undergroundGarage;
    Boolean ongroundGarage;
    Boolean waterDepo;
    Boolean childrenPark;



}
