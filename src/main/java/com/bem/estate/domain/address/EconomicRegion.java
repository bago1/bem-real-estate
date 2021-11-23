package com.bem.estate.domain.address;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@SequenceGenerator(name = "economicRegionSequence", allocationSize = 1,sequenceName = "SQ_economicRegion")
public class EconomicRegion {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "economicRegionSequence")
    Long id;
    String name;

}
