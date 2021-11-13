package com.bem.estate.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String city;
    String region;
    String province;
    String village;

    Double lat_d;
    Double long_t;

}
//todo 75
//
//MySQL's Spatial Extensions for long and lat