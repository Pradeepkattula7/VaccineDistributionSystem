package com.vaccineDistributionSystem.VaccineDisSystem.Vds4Repository;

import com.vaccineDistributionSystem.VaccineDisSystem.Vds1Entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepo extends JpaRepository<Patient,Integer> {
}
