package com.bem.estate.domain;

import com.bem.estate.enums.ListingType;
import com.bem.estate.enums.PropertyType;
import com.bem.estate.enums.Status;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
@NoArgsConstructor
//@Where(clause = )
@Setter
@Getter
@SequenceGenerator(sequenceName = "SQ_listing", name = "listingSequence", allocationSize = 1)
public class Listing {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "listingSequence")
    private Long id;

    @Enumerated(EnumType.STRING)
    private ListingType listingType;

    @Enumerated(EnumType.STRING)
    private PropertyType propertyType;

    @OneToOne
    @Cascade(CascadeType.ALL)
    private Home home;

    @OneToOne
    @Cascade(CascadeType.ALL)
    Building building;

//    @ManyToOne
//    AppUser appUserId;
//
    @Enumerated(EnumType.STRING)
    private Status status;

    private Boolean workWithAgent;

}
