package entites;

public class Personne {
    private String nom;
    private String prenom;
    private AdressePostale adressePostale;

    // Constructeur avec nom et prénom uniquement
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    // Constructeur avec nom, prénom et adresse postale
    public Personne(String nom, String prenom, AdressePostale adressePostale) {
        this.nom = nom;
        this.prenom = prenom;
        this.adressePostale = adressePostale;
    }

    // Méthode pour afficher le nom et le prénom avec le nom en majuscules
    public void afficherIdentite() {
        System.out.println(prenom + " " + nom.toUpperCase());
    }

    // Méthode pour modifier le nom
    public void modifierNom(String nouveauNom) {
        this.nom = nouveauNom;
    }

    // Méthode pour modifier le prénom
    public void modifierPrenom(String nouveauPrenom) {
        this.prenom = nouveauPrenom;
    }

    // Méthode pour modifier l'adresse
    public void modifierAdresse(AdressePostale nouvelleAdresse) {
        this.adressePostale = nouvelleAdresse;
    }

    // Méthode pour retourner le nom
    public String getNom() {
        return nom;
    }

    // Méthode pour retourner le prénom
    public String getPrenom() {
        return prenom;
    }

    // Méthode pour retourner l'adresse
    public AdressePostale getAdressePostale() {
        return adressePostale;
    }
}