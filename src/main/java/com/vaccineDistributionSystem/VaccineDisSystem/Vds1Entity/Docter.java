package com.vaccineDistributionSystem.VaccineDisSystem.Vds1Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Docter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int docId;

    String docName;

    String docDegree;

    @ManyToOne
    VaccineCenter vaccineCenter;

    @OneToMany(mappedBy = "docter")
    List<Patient> patientList;

    int patCount;
}
