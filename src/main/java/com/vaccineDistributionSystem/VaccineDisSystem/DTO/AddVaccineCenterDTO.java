package com.vaccineDistributionSystem.VaccineDisSystem.DTO;

import com.vaccineDistributionSystem.VaccineDisSystem.Enums.CenterPreference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AddVaccineCenterDTO {

    String address;

    String centerName;

    int covaxinDose;

    int covisheildDose;

    int sputnikDose;

    CenterPreference centerType;

}
