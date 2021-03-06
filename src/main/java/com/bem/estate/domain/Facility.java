package com.bem.estate.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@NoArgsConstructor
@Setter
@Getter
@SequenceGenerator(name = "facilitySequence", allocationSize = 1,sequenceName = "SQ_facility")
public class Facility {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "facilitySequence")
    Long id;

    String name;
}
