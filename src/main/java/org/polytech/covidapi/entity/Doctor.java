package org.polytech.covidapi.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.ForeignKey;


@Entity
public class Doctor {
    @Id
    private Integer id_doctor;
    
    @ManyToOne(optional = false)
    //@JsonIgnore
    @JoinColumn(name = "id_vaccination_center", nullable=false, foreignKey = @ForeignKey(name = "fk_id_center"))
    private VaccinationCenter vaccinationCenter;
    
    private String firstname;
    private String lastname;
    private String address;
    private String phone_number;
    private String mail;

    private String login;
    
    private String password;
    //private Utilisateur utilisateur;

    

    public Integer getId_doctor() {
        return id_doctor;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setId_doctor(Integer id_doctor) {
        this.id_doctor = id_doctor;
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
    public VaccinationCenter getVaccinationCenter() {
        return vaccinationCenter;
    }
    public void setVaccinationCenter(VaccinationCenter vaccinationCenter) {
        this.vaccinationCenter = vaccinationCenter;
    }
    
}
