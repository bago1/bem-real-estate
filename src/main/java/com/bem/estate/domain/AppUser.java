package com.bem.estate.domain;

import com.bem.estate.enums.AppUserType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
@SequenceGenerator(name = "appUserSequence", allocationSize = 1,sequenceName = "SQ_appUser")
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "appUserSequence")
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
    Set<Listing> favourities;

    @Enumerated(EnumType.STRING)
    AppUserType userType;
}
