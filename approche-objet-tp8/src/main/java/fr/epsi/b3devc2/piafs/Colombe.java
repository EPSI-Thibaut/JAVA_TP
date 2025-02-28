package fr.epsi.b3devc2.piafs;

public class Colombe extends Volaille implements EstCapableDeVoler {
    @Override
    public void crier() {
        System.out.println("Je suis une colombe");
    }

    @Override
    public void voler() {
        System.out.println("Je vole comme une colombe");
    }

    @Override
    public void manger() {
        System.out.println("La colombe mange des graines.");
    }
}