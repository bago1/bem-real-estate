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

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@SequenceGenerator(name = "villageSequence", allocationSize = 1,sequenceName = "SQ_village")
public class Village {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "villageSequence")
    Long id;

    String name;

    @ManyToOne
    Province province;
}
