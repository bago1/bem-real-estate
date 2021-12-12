package com.bem.estate.domain.address;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
@SequenceGenerator(name = "citySequence", allocationSize = 1, sequenceName = "SQ_city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "citySequence")
    Long id;
    String name;
    String code;

    @ManyToOne
    @Cascade(CascadeType.ALL)
    EconomicRegion economicRegion;
}
