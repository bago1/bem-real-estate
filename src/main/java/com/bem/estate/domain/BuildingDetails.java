package com.bem.estate.domain;


import com.bem.estate.enums.BuildingType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

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

    @OneToOne
    Location locationId;

    Integer floor_number;
    Boolean building_document;

    @OneToOne
    MTKDetails mtkDetailsId;

    String delivery_year;
    Boolean central_heat;

    @ManyToMany
    Set<Destinations> destinations;

    @ManyToMany
    Set<Facility> facilities;

    @Enumerated(EnumType.STRING)
    BuildingType buildingType;


}
