package com.bem.estate.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Setter
@Getter
public class BuildingType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
}
