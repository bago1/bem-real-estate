package com.bem.estate.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import java.util.Set;

@Entity
@NoArgsConstructor
@Setter
@Getter
@SequenceGenerator(name = "sequence", sequenceName = "buildingSequence")
public class Building {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence")
    Long id;
    String deliveryYear;
    Integer floor_number;

    @OneToOne(cascade = CascadeType.ALL)
    MTK mtk;

    @ManyToMany
    Set<Facility> facilities;

    @ManyToOne(fetch = FetchType.LAZY)
    Elan elanus;
//todo butun evleri dogru binaya baglamaq cetin ve mumkunsuz olur deye adresi ev bazli verdim
}

