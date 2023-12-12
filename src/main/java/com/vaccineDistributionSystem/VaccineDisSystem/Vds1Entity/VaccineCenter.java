package com.vaccineDistributionSystem.VaccineDisSystem.Vds1Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class VaccineCenter {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int vcId;

    String centerName;

    int covaxinDose;

    int covisheildDose;

    int sputnikDose;

    String centerType;

    String address;


    @OneToMany(mappedBy = "vaccineCenter")
    List<Docter> doclist;


    @OneToMany(mappedBy = "vaccineCenter")
    List<Patient> patientList;
}
