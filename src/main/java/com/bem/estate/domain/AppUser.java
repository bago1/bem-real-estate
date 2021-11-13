package com.bem.estate.domain;

import com.bem.estate.enums.AppUserType;
import com.bem.estate.enums.ElanType;
import com.bem.estate.enums.PropertyCategory;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String name;
    String surname;
    String sex;
    String email;
    String password;
    String fbLink;
    String instagramLink;
    String mobileNumber;

    @ManyToMany
    Set<Elan> favourities;
    @Enumerated(EnumType.STRING)
    AppUserType appUserType;
}














