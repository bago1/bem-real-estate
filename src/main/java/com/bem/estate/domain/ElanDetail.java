package com.bem.estate.domain;

import com.bem.estate.enums.ElanType;
import com.bem.estate.enums.ImgVideo;
import com.bem.estate.enums.PropertyCategory;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class ElanDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @OneToOne
    Elan elanId;
    String url;
    String description;
    ImgVideo imgVideo;

}
