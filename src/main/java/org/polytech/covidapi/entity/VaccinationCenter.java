package org.polytech.covidapi.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;


@Entity
public class VaccinationCenter {
    @Id
    @GeneratedValue
    @Column(name = "id_vaccination_center")
    private Integer id;
    private String name;
    private String address;
    private String postalCode;
    private String city;

    //@OneToMany(mappedBy = "center", fetch = FetchType.LAZY)
    //@JsonIgnore
    //private List<Appointment> appointments;


    //@OneToOne(mappedBy = "center", optional = false)
    //private CenterAdmin admin;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPostalCode() {
        return postalCode;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    /*
    public List<Appointment> getAppointments() {
        return appointments;
    }
    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }
     */

    
    
}
