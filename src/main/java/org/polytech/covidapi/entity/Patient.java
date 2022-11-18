package org.polytech.covidapi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Patient {
    @Id
    private Integer id_patient;

    private String firstname;
    private String lastname;
    private String address;
    private String phone_number;
    private String mail;



    public Integer getId_patient() {
        return id_patient;
    }
    public void setId_patient(Integer id_patient) {
        this.id_patient = id_patient;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhone_number() {
        return phone_number;
    }
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }

    
}
