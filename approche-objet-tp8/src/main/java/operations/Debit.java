package operations;

public class Debit extends Operation {
    // Constructeur
    public Debit(String date, double montant) {
        super(date, montant);
    }

    // Redéfinition de la méthode afficherType
    @Override
    public String afficherType() {
        return "Débit";
    }
}