package com.bem.estate.domain;


import com.bem.estate.enums.HomeRepairSituation;
import com.bem.estate.enums.HomeView;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@NoArgsConstructor
@Setter
@Getter
@SequenceGenerator(name = "homeDetailSequence", allocationSize = 1,sequenceName = "SQ_homeDetail")
public class HomeDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "homeDetailSequence")
    Long id;
    Integer floor;
    Boolean homeDocument;
    Boolean barter;
    Integer balconyNumber;
    Boolean postRepairmentLiving;
    Boolean inRentNow;
    Boolean electric;
    Boolean continuousWater;
    Boolean gas;
    Double rentAmount;
    Integer bathroomNumber;
    @Enumerated(EnumType.STRING)
    HomeRepairSituation repairSituation;
    Double ceilingHeight;
    Boolean roomAdded;
    Boolean nowOnMortgage;
    Boolean mortgageAvailable;
    Boolean livingNow;
    @Enumerated(EnumType.STRING)
    HomeView homeViewEnum;

}
