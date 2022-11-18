package org.polytech.covidapi;

import org.polytech.covidapi.entity.Doctor;
import org.polytech.covidapi.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class AdminDoctorRestControler {
    
    @Autowired
    private DoctorRepository doctorRepository;

    @GetMapping(path = "api/admin/center")
    public List<Doctor> getDoctors(
        @RequestParam("center") String center)    
    {
        return doctorRepository.findAllByVaccinationCenter(center+"%");
    }
}
