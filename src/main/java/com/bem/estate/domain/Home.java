package com.bem.estate.domain;


import com.bem.estate.domain.address.Location;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import java.util.Set;

@Entity
@NoArgsConstructor
@Setter
@Getter
@SequenceGenerator(name = "sequence", sequenceName = "homeSequence")
public class Home {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence")
    Long id;
    Double square;
    Double price;
    Integer roomNumber;

    String description;

    // //User user
//
//    @OneToOne(cascade = CascadeType.ALL)
//    Location homeLocation;
//
//    @OneToOne
//    HomeDetail homeDetail;
//
//    @OneToOne
//    HomeFeature homeFeature;
//
//    @ManyToMany
//    Set<Destination> destinations;
//
//    @OneToOne
//    Location location;

}
