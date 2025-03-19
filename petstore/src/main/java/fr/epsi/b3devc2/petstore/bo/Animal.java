package fr.epsi.b3devc2.petstore.bo;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date birth;
    private String couleur;

    @ManyToOne
    @JoinColumn(name = "petstore_id")
    private PetStore petStore;

    // Constructeur qui reprend les champs de la table Animal
    public Animal(Long id, Date birth, String couleur, PetStore petStore) {
        this.id = id;
        this.birth = birth;
        this.couleur = couleur;
        this.petStore = petStore;
    }

    public Animal(){
    }

    // Getter et Setter
    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
}

