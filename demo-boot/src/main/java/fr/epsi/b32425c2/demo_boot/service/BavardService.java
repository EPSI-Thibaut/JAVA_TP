package fr.epsi.b32425c2.demo_boot.service;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

// 1 - Création d'une classe BavardService
@Component
public class BavardService {
    private String nom = "Valeur par défaut";

    // Getter
    public String getNom() {
        return nom;
    }

    // Setter
    public void setNom(String nom) {
        this.nom = nom;
    }

    // Méthode parler qui affiche le nom et le nom de la classe
    public String parler() {
        System.out.println("Nom : " + nom + ", Classe : " + this.getClass().getSimpleName());
        return null;
    }

    // 2 - Méthode annotée avec @PostConstruct
    @PostConstruct
    private void postConstruct() {
        System.out.println("BavardService postConstruct");
    }

}
