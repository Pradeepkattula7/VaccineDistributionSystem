package com.vaccineDistributionSystem.VaccineDisSystem.Vds4Repository;

import com.vaccineDistributionSystem.VaccineDisSystem.Vds1Entity.Certificate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CertificateRepo extends JpaRepository<Certificate,Integer> {
}
