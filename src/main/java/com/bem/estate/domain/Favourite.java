package com.bem.estate.domain;

import com.bem.estate.enums.AppUserType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
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

    AppUser idn;
    Elan ind;

}
//todo burda id olmamalidir