package fr.epsi.b3devc2.petstore.bo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String number;
    private String street;
    private String zipCode;
    private String city;

    // Constructeur qui reprend les champs de la table Address
    public Address(Long id, String number, String street, String zipCode, String city) {
        this.id = id;
        this.number = number;
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
    }

    public Address() {
    }

    // Getter et Setter
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
