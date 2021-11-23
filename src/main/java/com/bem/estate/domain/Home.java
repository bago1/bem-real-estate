package com.bem.estate.domain;


import com.bem.estate.domain.address.Location;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

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
@SequenceGenerator(name = "homeSequence", allocationSize = 1,sequenceName = "SQ_home")
public class Home {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "homeSequence")
    Long id;
    Double square;
    Double price;
    Integer roomNumber;

    String description;

    @OneToOne
    @Cascade(CascadeType.ALL)
    Location location;

    // //User user
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


}
