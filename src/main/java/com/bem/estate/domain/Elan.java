package com.bem.estate.domain;

import com.bem.estate.enums.ElanType;
import com.bem.estate.enums.PropertyType;
import com.bem.estate.enums.Status;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
@NoArgsConstructor
//@Where(clause = )
@Setter
@Getter
@SequenceGenerator(sequenceName = "SQ_elan", name = "elanSequence", allocationSize = 1)
public class Elan {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "elanSequence")
    private Long id;

    @Enumerated(EnumType.STRING)
    private ElanType elanType;

    @Enumerated(EnumType.STRING)
    private PropertyType propertyType;

    @OneToOne
    @Cascade(CascadeType.ALL)
    private Home home;

    @OneToOne
    @Cascade(CascadeType.ALL)
    Building building;

//    @ManyToOne
//    AppUser appUserId;
//
    @Enumerated(EnumType.STRING)
    private Status status;

    private Boolean workWithAgent;

}
