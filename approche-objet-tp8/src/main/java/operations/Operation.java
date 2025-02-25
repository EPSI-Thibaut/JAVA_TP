package operations;

public abstract class Operation {
    private String date;
    private double montant;

    // Constructeur avec 2 paramètres
    public Operation(String date, double montant) {
        this.date = date;
        this.montant = montant;
    }

    // Getters pour accéder aux attributs
    public String getDate() {
        return date;
    }

    public double getMontant() {
        return montant;
    }

    // Méthode abstraite : chaque classe fille doit la redéfinir
    public abstract String afficherType();
}