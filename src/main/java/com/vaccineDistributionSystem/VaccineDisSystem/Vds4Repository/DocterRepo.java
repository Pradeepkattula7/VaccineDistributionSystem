package com.vaccineDistributionSystem.VaccineDisSystem.Vds4Repository;

import com.vaccineDistributionSystem.VaccineDisSystem.DTO.VaccineCenterVsDocterCount;
import com.vaccineDistributionSystem.VaccineDisSystem.Vds1Entity.Docter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocterRepo extends JpaRepository<Docter,Integer> {
}
