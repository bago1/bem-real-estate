package com.bem.estate.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@NoArgsConstructor
@Setter
@Getter
@SequenceGenerator(name = "favouriteSequence", allocationSize = 1,sequenceName = "SQ_favourite")
public class Favourite {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "favouriteSequence")
    Long id;

    AppUser appUser;
    Listing listing;

}
