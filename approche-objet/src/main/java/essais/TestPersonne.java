package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        // Création d'une personne avec le constructeur valorisant nom et prénom
        Personne personne = new Personne("Dupont", "Jean");

        // Affichage initial du nom et prénom
        System.out.println("Nom initial : " + personne.getNom());
        System.out.println("Prénom initial : " + personne.getPrenom());

        // Modifier le nom et le prénom
        personne.modifierNom("Durand");
        personne.modifierPrenom("Marie");

        // Afficher le nouveau nom et prénom
        System.out.println("Nom modifié : " + personne.getNom());
        System.out.println("Prénom modifié : " + personne.getPrenom());

        // Création et affectation d’une nouvelle adresse via la méthode modifierAdresse
        AdressePostale nouvelleAdresse = new AdressePostale(25, "Rue des Lilas", "75015", "Paris");
        personne.modifierAdresse(nouvelleAdresse);

        // Affichage de l'identité avec l'adresse complète
        System.out.print("Identité complète : ");
        personne.afficherIdentite();
        System.out.println("Adresse : " + personne.getAdressePostale().getNumeroRue() + " " +
                personne.getAdressePostale().getLibelleRue() + ", " +
                personne.getAdressePostale().getCodePostal() + " " +
                personne.getAdressePostale().getVille());
    }
}