package com.bem.estate.domain;

import com.bem.estate.enums.ElanType;
import com.bem.estate.enums.PropertyType;
import com.bem.estate.enums.Status;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;


import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import java.util.Set;

@Entity
@NoArgsConstructor
@Setter
@Getter
@SequenceGenerator(name = "sequence", sequenceName = "elanSequence")
public class Elan {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence")
    private Long id;

    @Enumerated(EnumType.STRING)
    private ElanType elanType;

    @Enumerated(EnumType.STRING)
    private PropertyType propertyType;

    @OneToOne
    @Cascade(CascadeType.ALL)
    private Home home;

//    @OneToOne
//    Building building;
//
//    @ManyToOne
//    AppUser appUserId;
//
//    @Enumerated(EnumType.STRING)
//    Status status;

}
