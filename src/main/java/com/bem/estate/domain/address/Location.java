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
@SequenceGenerator(name = "sequence", sequenceName = "locationSequence")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence")
    Long id;
    String addressInfo;
    String city;
    String district;
    String province;
    String village;
    String economicRegion;
    Double lat_d;
    Double long_t;

}

//MySQL's Spatial Extensions for long and lat