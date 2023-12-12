package com.vaccineDistributionSystem.VaccineDisSystem.Vds3Service;

import com.vaccineDistributionSystem.VaccineDisSystem.Vds4Repository.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

    @Autowired
    PatientRepo patientRepo;
}
