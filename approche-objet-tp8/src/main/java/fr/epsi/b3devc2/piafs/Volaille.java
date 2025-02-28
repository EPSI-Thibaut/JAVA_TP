package fr.epsi.b3devc2.piafs;

public abstract class Volaille {
    protected String nom;

    public Volaille() {
    }

    public abstract void crier();

    public abstract void voler();

    public abstract void manger();

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}