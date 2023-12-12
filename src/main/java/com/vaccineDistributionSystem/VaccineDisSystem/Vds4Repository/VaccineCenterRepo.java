package com.vaccineDistributionSystem.VaccineDisSystem.Vds4Repository;

import com.vaccineDistributionSystem.VaccineDisSystem.Vds1Entity.VaccineCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VaccineCenterRepo extends JpaRepository<VaccineCenter,Integer> {

    public List<VaccineCenter> findByCenterName(String centerName);
}
