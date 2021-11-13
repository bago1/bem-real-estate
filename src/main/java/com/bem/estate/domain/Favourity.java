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

@NoArgsConstructor
@Setter
@Getter
public class Favourity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    AppUser idn;
    Elan ind;

}
//todo burda id olmamalidir