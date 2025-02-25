package operations;

public class Credit extends Operation {
    // Constructeur
    public Credit(String date, double montant) {
        super(date, montant);
    }

    @Override
    public String afficherType() {
        return "Crédit";
    }
}