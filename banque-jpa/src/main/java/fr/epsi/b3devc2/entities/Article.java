package fr.epsi.b3devc2.entities;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;

@Entity
public class Article implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "REF")
    private String ref;
    @Column(name = "DESIGNATION")
    private String description;
    @Column(name = "PRIX")
    private String prix;
    @Column(name = "AUTHOR")
    private String author;
    private Fournisseur fournisseur;

    public Article() {
    }

    public Article( String ref, String description, String prix, String author, Fournisseur fournisseur) {
        this.ref = ref;
        this.description = description;
        this.prix = prix;
        this.author = author;
        this.fournisseur = fournisseur;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}


// trigger avec cascade JPA
// @ManytoMany(cascade = CascadeType.ALL)

// fonction à mettre dans le main
//    @Override
//   public void run (String... args) throws Exception {
//  Fournisseur fournisseur = new Fournisseur("fournisseur1", "fournisseur1@gmail.com");
// fournisseurRepository.save(fournisseur);
// Article article = new Article("ref1", "description1", "prix1", "author1", fournisseur);
// articleRepository.save(article);
//    }