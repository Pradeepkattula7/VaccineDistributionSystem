package com.vaccineDistributionSystem.VaccineDisSystem.Vds2Controller;

import com.vaccineDistributionSystem.VaccineDisSystem.DTO.AddVaccineCenterDTO;
import com.vaccineDistributionSystem.VaccineDisSystem.Vds1Entity.VaccineCenter;
import com.vaccineDistributionSystem.VaccineDisSystem.Vds3Service.VaccineCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vds")
public class VaccineCenterController {

    @Autowired
    VaccineCenterService vaccineCenterService;


    @PostMapping("/addVaccineCenter")
    public String createVaccinationCenter( @RequestBody AddVaccineCenterDTO obj){

        vaccineCenterService.createVaccineCenter(obj);

        return  "center created  successFully";
    }

    @GetMapping("/getByCenterName/{centerName}")
    public List<VaccineCenter> getByCenterName(@PathVariable("centerName") String centerName ){

        return vaccineCenterService.searchByName(centerName);

    }


}
