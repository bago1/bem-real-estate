package com.bem.estate.domain;


import com.bem.estate.enums.HomeRepairSituation;
import com.bem.estate.enums.HomeView;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class HomeDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    Integer floor;
    Boolean home_document;
    Boolean barter;
    Integer balcony_number;
    Boolean lived_post_repaitment;
    Boolean in_rent_now;
    Double rent_amount;
    Integer bath_room_number;
    @Enumerated(EnumType.STRING)
    HomeRepairSituation repairSituation;
    Double ceiling_height;
    Boolean room_added;
    Boolean now_on_mortgage;
    Boolean living_now;
    @Enumerated(EnumType.STRING)
    HomeView homeViewEnum;



}
