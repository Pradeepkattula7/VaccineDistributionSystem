package com.vaccineDistributionSystem.VaccineDisSystem.Vds1Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int patId;

    String patName;


    String patVaccine;


    String patCenter;


    @ManyToOne
    VaccineCenter vaccineCenter;


    @ManyToOne
    Docter docter;

    @Column(unique = true)
    int phnNumber;

    @Column(unique = true)
    String emailId;


    boolean isVaccinate;

    @OneToOne
    Certificate certificate;
}
