package fr.epsi.b3devc2.piafs;

public class Canard extends Volaille implements EstCapableDeVoler {
    @Override
    public void crier() {
        System.out.println("Je suis un canard");
    }

    @Override
    public void voler() {
        System.out.println("Je vole comme un canard");
    }

    @Override
    public void manger() {
        System.out.println("Le canard mange des plantes et des petits insectes.");
    }
}