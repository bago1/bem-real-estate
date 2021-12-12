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
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
@NoArgsConstructor
@Setter
@Getter
@SequenceGenerator(name = "homeSequence", allocationSize = 1, sequenceName = "SQ_home")
public class Home {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "homeSequence")
    private Long id;
    private Double squareOnContract;
    private Double squareOnDocument;
    private Double price;
    private Integer roomNumber;
// todo kupca ingilisce nedi
    private String description;

    @OneToOne
    @Cascade(CascadeType.ALL)
    private Location location;


    @OneToOne
    @Cascade(CascadeType.ALL)
    private HomeDetail homeDetail;

    @OneToOne
    @Cascade(CascadeType.ALL)
    private HomeFeature homeFeature;
//
//    @ManyToMany
//    Set<Destination> destinations;
//


}
