package com.bem.estate.domain;


import com.bem.estate.enums.BuildingType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import java.util.Set;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class BuildingDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String deliveryYear;
    Boolean centralHeat;
    Integer floor_number;

    @Enumerated(EnumType.STRING)
    BuildingType buildingType;

    @OneToOne(cascade = CascadeType.ALL)
    Location location;

    @OneToOne(cascade = CascadeType.ALL)
    MTKDetails mtkDetails;

    @ManyToMany
    Set<Destinations> destinations;

    @ManyToMany
    Set<Facility> facilities;




}
