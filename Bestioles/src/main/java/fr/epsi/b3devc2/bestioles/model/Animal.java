package fr.epsi.b3devc2.bestioles.model;

import jakarta.persistence.*;

@Entity
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String color;
    private String name;
    private String sex;

    @ManyToOne
    @JoinColumn(name = "species_id")
    private Species species;

    public Animal() {
    }

    public Animal(Integer id, String color, String name, String gender, Species species) {
        this.id = id;
        this.color = color;
        this.name = name;
        this.sex = gender;
        this.species = species;
    }

    // Getters and setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return sex;
    }

    public void setGender(String gender) {
        this.sex = gender;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + sex + '\'' +
                ", species=" + species +
                '}';
    }
}