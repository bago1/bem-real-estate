package com.bem.estate.domain;


import com.bem.estate.enums.BuildingType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class MTKDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String name;
}
