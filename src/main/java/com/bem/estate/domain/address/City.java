package com.bem.estate.domain.address;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@Setter
@SequenceGenerator(name = "sequence", sequenceName = "citySequence")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence")
    Long id;
    String name;

    @ManyToOne
    EconomicRegion economicRegion;
}
//todo mene lazimdir butun klasslar 1-den baslasin bir bir qalxsin, bele olanda name=sequence edib, her yerde onu isledimmi,
//todo yoxsa sequenceNameni mi isledim her yerde?
//todo yoxsa umumietle name ve sequencename ferqi nedir?