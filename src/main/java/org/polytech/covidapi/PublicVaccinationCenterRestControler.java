package org.polytech.covidapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.polytech.covidapi.entity.VaccinationCenter;
import org.polytech.covidapi.repository.VaccinationCenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicVaccinationCenterRestControler {
    
    @Autowired
    private VaccinationCenterRepository centerRepository;

//Pour le test
//    private static final List<VaccinationCenter> Centres = Arrays.asList(
//        new VaccinationCenter(1, "Centre 1", "2 Rue du Bourg", "54000", "Nancy", null),
//        new VaccinationCenter(2, "Centre 2", "14 Rue du Vieux Roi", "55000", "Bar-le-Duc", null),
//        new VaccinationCenter(3, "Centre 3", "Je sais pas", "88000", "Epinal", null)
//    );

    

    @GetMapping(path = "api/public/center")
    //@ResponseBody
    public List<VaccinationCenter> getVaccinationCenter(
        @RequestParam("city") String city)    
    {
        return centerRepository.findAllByCityIgnoreCaseLike(city+"%");
    }
}
