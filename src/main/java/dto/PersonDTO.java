/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import entities.Address;
import entities.CityInfo;
import entities.Hobby;
import entities.Person;
import entities.Phone;
import entities.InfoEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bitten
 */
public class PersonDTO {

    private String firstname;
    private String lastname;
    private String email;
    private String street;
    private String additionalinfo;
    private String city;
    private int zip;
    private List<PhoneDTO> phones;
    private List<HobbyDTO> hobbies;
    private int id;

    public PersonDTO() {
    }

    public PersonDTO(Person p, List<HobbyDTO> h, InfoEntity e, Address a, CityInfo c, List<PhoneDTO> ph) {
        this.firstname = p.getFirstname();
        this.lastname = p.getLastname();
        this.email = e.getEmail();
        this.street = a.getStreet();
        this.additionalinfo = a.getAdditionalInfo();
        this.city = c.getCity();
        this.zip = c.getZip();
        this.hobbies = h;
        this.phones = ph;
    }

    public PersonDTO(Person p) {
        this.firstname = p.getFirstname();
        this.lastname = p.getLastname();
        this.email = p.getEmail();
        this.street = p.getAddress().getStreet();
        this.additionalinfo = p.getAddress().getAdditionalInfo();
        this.city = p.getAddress().getCityInfo().getCity();
        this.zip = p.getAddress().getCityInfo().getZip();
        List<HobbyDTO> hobs = new ArrayList();
        for (Hobby hobby : p.getHobbies()) {
            hobs.add(new HobbyDTO(hobby));
        }
        this.hobbies = hobs;
        List<PhoneDTO> phons = new ArrayList();
        for (Phone phone : p.getPhones()){
            phons.add(new PhoneDTO(phone));
        }
        this.phones = phons;
        this.id = p.getId();
    }

    public PersonDTO(int id, String firstname, String lastname, String email, String street, String additionalinfo, String city, int zip, List<PhoneDTO> ph, List<HobbyDTO> h) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.street = street;
        this.additionalinfo = additionalinfo;
        this.city = city;
        this.zip = zip;
        phones = ph;
        hobbies = h;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getAdditionalinfo() {
        return additionalinfo;
    }

    public void setAdditionalinfo(String additionalinfo) {
        this.additionalinfo = additionalinfo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public List<PhoneDTO> getPhones() {
        return phones;
    }

    public void setPhones(List<PhoneDTO> phones) {
        this.phones = phones;
    }

    public List<HobbyDTO> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<HobbyDTO> hobbies) {
        this.hobbies = hobbies;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
