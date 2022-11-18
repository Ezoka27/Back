package org.polytech.covidapi.entity;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class Appointment {
    @Id
    private Integer appointement_id;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_patient", nullable=false, foreignKey = @ForeignKey(name = "fk_id_patient"))
    private Patient patient;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_vaccination_center", nullable=false, foreignKey = @ForeignKey(name = "fk_id_center"))
    private VaccinationCenter center;

    @Column(nullable = false)
    private LocalDateTime date;


    public Integer getAppointement_id() {
        return appointement_id;
    }
    public LocalDateTime getDate() {
        return date;
    }
    public void setAppointement_id(Integer appointement_id) {
        this.appointement_id = appointement_id;
    }
    public void setDate(LocalDateTime date) {
        this.date = date;
    }
    public Patient getPatient() {
        return patient;
    }
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    public VaccinationCenter getCenter() {
        return center;
    }
    public void setCenter(VaccinationCenter center) {
        this.center = center;
    }

    
}
