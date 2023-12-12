package com.vaccineDistributionSystem.VaccineDisSystem.Vds3Service;


import com.vaccineDistributionSystem.VaccineDisSystem.DTO.AddVaccineCenterDTO;
import com.vaccineDistributionSystem.VaccineDisSystem.Vds1Entity.VaccineCenter;
import com.vaccineDistributionSystem.VaccineDisSystem.Vds4Repository.VaccineCenterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaccineCenterService {

    @Autowired
    VaccineCenterRepo vaccineCenterRepo;



    public  void  createVaccineCenter(AddVaccineCenterDTO addVaccineCenterDTO){

        VaccineCenter obj=new VaccineCenter();

        obj.setCenterName(addVaccineCenterDTO.getCenterName());
        obj.setCovaxinDose(addVaccineCenterDTO.getCovaxinDose());
        obj.setCovisheildDose(addVaccineCenterDTO.getCovisheildDose());
        obj.setSputnikDose(addVaccineCenterDTO.getSputnikDose());
        obj.setCenterType(addVaccineCenterDTO.getCenterType().toString());
        obj.setAddress(addVaccineCenterDTO.getAddress());

        vaccineCenterRepo.save(obj);

    }

    public List<VaccineCenter> searchByName(String centerName){

       return vaccineCenterRepo.findByCenterName(centerName);
    }



}
