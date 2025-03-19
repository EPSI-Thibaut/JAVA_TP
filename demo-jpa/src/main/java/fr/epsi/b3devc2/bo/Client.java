// Définition du package pour la classe Client
package fr.epsi.b3devc2.bo;

// Importation des annotations JPA (Java Persistence API)
import jakarta.persistence.*;
import java.util.List;

// Définition de la classe Client comme entité JPA
@Entity
// Spécification du nom de la table correspondante dans la base de données
@Table(name = "CLIENT")
public class Client {

    // Définition de l'identifiant unique de la classe Client
    @Id
    // Génération automatique de l'identifiant à l'aide de la stratégie GenerationType.IDENTITY
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // Définition du champ nom avec une contrainte de non-nullité
    @Column(nullable = false)
    private String nom;

    // Définition du champ prénom avec une contrainte de non-nullité
    @Column(nullable = false)
    private String prenom;

    // Définition de la relation One-To-Many avec la classe Emprunt
    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Emprunt> emprunts;

    // Constructeur par défaut
    public Client() {}

    // Getters et Setters pour les champs de la classe Client

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public List<Emprunt> getEmprunts() {
        return emprunts;
    }

    public void setEmprunts(List<Emprunt> emprunts) {
        this.emprunts = emprunts;
    }
}