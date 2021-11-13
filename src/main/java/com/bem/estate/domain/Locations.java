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
@RequiredArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Locations {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String city;
    String region;
    String province;
    String village;

    String lat_d;
    String long_t;

}
