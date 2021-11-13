package com.bem.estate.domain;

import com.bem.estate.enums.ElanType;
import com.bem.estate.enums.PropertyCategory;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.Set;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class Elan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Enumerated(EnumType.STRING)
    ElanType elanTypeId;

    Double sellPrice;

    @OneToMany(cascade = CascadeType.ALL)
    Set<BuildingDetails> buildingDetails;

    @ManyToOne
    AppUser appUserId;


    @Enumerated(EnumType.STRING)
    PropertyCategory propertyCategoryId;

    @OneToOne
    HomeDetails homeDetailsId;
}
