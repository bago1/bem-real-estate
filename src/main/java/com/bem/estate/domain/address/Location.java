package com.bem.estate.domain.address;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String addressInfo;  // M.Hadi kucesi 24b

    @OneToOne
    City city;

    @OneToOne
    District district;

    @OneToOne
    Province province;

    @OneToOne
    Village village;

    @OneToOne
    EconomicRegion economicRegion;

    Double lat_d;
    Double long_t;

}

//MySQL's Spatial Extensions for long and lat