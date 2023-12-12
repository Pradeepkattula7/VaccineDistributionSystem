package com.vaccineDistributionSystem.VaccineDisSystem.Vds3Service;

import com.vaccineDistributionSystem.VaccineDisSystem.Vds4Repository.CertificateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CertificateService {

    @Autowired
    CertificateRepo certificateRepo;
}
