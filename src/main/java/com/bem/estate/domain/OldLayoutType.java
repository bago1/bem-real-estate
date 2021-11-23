package com.bem.estate.domain;

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
@Setter
@Getter
@SequenceGenerator(name = "oldLayoutTypeSequence", allocationSize = 1,sequenceName = "SQ_oldLayoutType")
public class OldLayoutType {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "oldLayoutTypeSequence")
    Long id;

    String name;

    @ManyToOne
    Building buildingId;


}
