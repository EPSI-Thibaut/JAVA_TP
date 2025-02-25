package operations;

public class Credit extends Operation {
    // Constructeur
    public Credit(String date, double montant) {
        super(date, montant);
    }

    // Redéfinition de la méthode afficherType
    @Override
    public String afficherType() {
        return "Crédit";
    }
}