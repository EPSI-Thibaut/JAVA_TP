package test;

import operations.Credit;
import operations.Debit;
import operations.Operation;

public class TestOperation {
    public static void main(String[] args) {
        // Création du jeu de données
        Operation[] operations = {
                new Credit("2023-10-01", 150.0),
                new Debit("2023-10-02", 50.0),
                new Credit("2023-10-03", 200.0),
                new Debit("2023-10-04", 75.0)
        };

        double montantGlobal = 0;

        // Boucle pour parcourir le jeu de données
        for (Operation operation : operations) {
            // Affichage
            System.out.println("Type d'opération : " + operation.afficherType());
            System.out.println("Date de l'opération : " + operation.getDate());
            System.out.println("Montant de l'opération : " + operation.getMontant());
            System.out.println(); // Ligne vide pour séparer les opérations dans l'affichage

            // Calcul du montant global
            if (operation instanceof Credit) {
                montantGlobal += operation.getMontant(); // Crédit : on ajoute
            } else if (operation instanceof Debit) {
                montantGlobal -= operation.getMontant(); // Débit : on soustrait
            }
        }

        // Affichage du montant global après la boucle
        System.out.println("Montant global des opérations : " + montantGlobal);
    }
}