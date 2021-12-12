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
@SequenceGenerator(name = "MTKSequence",allocationSize = 1,sequenceName = "SQ_mtk")
public class MTK {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MTKSequence")
    Long id;

    String name;

}
