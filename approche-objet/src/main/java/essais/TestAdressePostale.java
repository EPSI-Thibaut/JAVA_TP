package essais;

import entites.AdressePostale;

public class TestAdressePostale {
    public static void main(String[] args) {
        // Création d'adresses via le constructeur complet
        AdressePostale adresse1 = new AdressePostale(10, "Place du Commerce", "44000", "Nantes");
        AdressePostale adresse2 = new AdressePostale(50, "Rue de Strasbourg", "44100", "Nantes");

        // Affichage des adresses
        System.out.println("Adresse 1 : " + adresse1.getNumeroRue() + " " + adresse1.getLibelleRue()
                + ", " + adresse1.getCodePostal() + " " + adresse1.getVille());

        System.out.println("Adresse 2 : " + adresse2.getNumeroRue() + " " + adresse2.getLibelleRue()
                + ", " + adresse2.getCodePostal() + " " + adresse2.getVille());
    }
}