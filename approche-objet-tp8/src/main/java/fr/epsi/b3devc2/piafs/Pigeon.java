package fr.epsi.b3devc2.piafs;

public class Pigeon extends Volaille implements EstCapableDeVoler {
    @Override
    public void crier() {
        System.out.println("Je suis un pigeon");
    }

    @Override
    public void voler() {
        System.out.println("Je vole comme un pigeon");
    }

    @Override
    public void manger() {
        System.out.println("Le pigeon mange des graines.");
    }
}