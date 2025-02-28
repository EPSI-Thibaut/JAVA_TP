package fr.epsi.b3devc2.piafs;

public class Volaille {
    private String nom;

    public Volaille() {
    }
    
    public void crier() {
        if (this instanceof Carnard) {
            System.out.println("Je crie !");
        } else if (this instanceof Pigeon) {
            System.out.println("Je crie, je suis à PAris !");
        } else if (this instanceof Manchot) {
            System.out.println("Je crie, je suis un Manchot !"
        }
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


}
