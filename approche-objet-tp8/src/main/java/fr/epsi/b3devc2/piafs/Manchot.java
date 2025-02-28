package fr.epsi.b3devc2.piafs;

public class Manchot extends Volaille {
    @Override
    public void crier() {
        System.out.println("Je suis un manchot");
    }

    @Override
    public void voler() {
        System.out.println("Je ne peux pas voler, je nage !");
    }

    @Override
    public void manger() {
        System.out.println("Le manchot mange du poisson.");
    }
}