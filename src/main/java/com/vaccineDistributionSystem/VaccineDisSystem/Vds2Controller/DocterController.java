package com.vaccineDistributionSystem.VaccineDisSystem.Vds2Controller;

import com.vaccineDistributionSystem.VaccineDisSystem.Vds3Service.DocterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vds")
public class DocterController {

    @Autowired
    DocterService docterService;


}
