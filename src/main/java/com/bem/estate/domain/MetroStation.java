package com.bem.estate.domain;

import com.bem.estate.domain.address.Location;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import java.util.Set;

@Entity
@NoArgsConstructor
@Setter
@Getter
@SequenceGenerator(name = "metroSequence", allocationSize = 1,sequenceName = "SQ_metro")
public class MetroStation {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "metroSequence")
    Long id;
    String name;

    @ManyToMany
    Set<Location> locations;
}
