package com.vaccineDistributionSystem.VaccineDisSystem.DTO;

import com.vaccineDistributionSystem.VaccineDisSystem.Enums.CenterPreference;
import com.vaccineDistributionSystem.VaccineDisSystem.Enums.VaccinePreference;

public class AddPatientDTO {

    String name;
    VaccinePreference vaccinePreference;
    CenterPreference centerPreference;
    int phoneNumber;
    String emailId;

    public AddPatientDTO(String name, VaccinePreference vaccinePreference, CenterPreference centerPreference, int phoneNumber, String emailId) {
        this.name = name;
        this.vaccinePreference = vaccinePreference;
        this.centerPreference = centerPreference;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VaccinePreference getVaccinePreference() {
        return vaccinePreference;
    }

    public void setVaccinePreference(VaccinePreference vaccinePreference) {
        this.vaccinePreference = vaccinePreference;
    }

    public CenterPreference getCenterPreference() {
        return centerPreference;
    }

    public void setCenterPreference(CenterPreference centerPreference) {
        this.centerPreference = centerPreference;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
