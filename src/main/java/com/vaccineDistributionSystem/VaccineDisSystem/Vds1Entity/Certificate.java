package com.vaccineDistributionSystem.VaccineDisSystem.Vds1Entity;

import jakarta.persistence.*;

@Entity
public class Certificate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int certificateId;

    @OneToOne
    Patient patient;

    public Certificate() {
    }

    public Certificate(int certificateId, Patient patient) {
        this.certificateId = certificateId;
        this.patient = patient;
    }

    public int getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(int certificateId) {
        this.certificateId = certificateId;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
