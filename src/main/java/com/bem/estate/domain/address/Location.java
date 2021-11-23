package com.bem.estate.domain.address;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@SequenceGenerator(name = "locationSequence", allocationSize = 1, sequenceName = "SQ_location")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "locationSequence")
    Long id;
    String addressInfo;

    //todo will be replaced with PostGis
    Double lat_d;
    Double long_t;
    Long cityId;
    Long districtId;
    Long provinceId;
    Long villageId;
    Long economicRegionId;
}

