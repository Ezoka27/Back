package org.polytech.covidapi.repository;

import java.util.List;
import java.util.Optional;

import org.polytech.covidapi.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
    
    //public List<Doctor> findAllByVaccinationCenter(String center);

    //@Query(value = "SELECT * FROM (Doctor LEFT JOIN vaccination_center ON vaccination_center.id_vaccination_center = Doctor.id_vaccination_center) WHERE name = '{$center}'", nativeQuery = true)
    @Query("select d from Doctor d where d.vaccinationCenter.name = :center")
    public List<Doctor> findAllByVaccinationCenter(@Param("center") String center);

    Optional<Doctor> findByLogin(final String email);

    
}
