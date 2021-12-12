package com.bem.estate.domain;


import com.bem.estate.enums.BuildingType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
@NoArgsConstructor
@Setter
@Getter
@SequenceGenerator(name = "buildingSequence", allocationSize = 1, sequenceName = "SQ_building")
public class Building {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "buildingSequence")

    private Long id;
    @Enumerated(EnumType.STRING)
    private BuildingType buildingType;

    private  Integer deliveryYear;
    private  Integer floor_number;
    private  Double buildingUtilityM2;


    @ManyToOne(cascade = CascadeType.ALL)
    private BuildingConstructionCompany buildingConstructionCompany;

//    @ManyToMany
//    Set<Facility> facilities;
//todo bu nedir unutmusam. meselen bu heyetde olan berber, baxca falandirsa artiq infodur.
}

