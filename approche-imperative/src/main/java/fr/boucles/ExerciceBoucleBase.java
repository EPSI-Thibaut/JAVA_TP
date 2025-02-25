package fr.boucles;

public class ExerciceBoucleBase {
    public static void main(String[] args) {

        System.out.println("Affichage de tous les nombres de 1 à 10");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "");
        }

        String MonPrenom = "thibaut";
        String MonNom = "Mosteau";
        System.out.println("Affichage du nom prénom 20 fois");
        for (int i = 1; i <= 20; i++) {
            System.out.println(i + " " + MonPrenom + " " + MonNom);
         }

        System.out.println("Addicher les éléments pairs de 2 à 100");
        for(int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println("Addicher les éléments impairs de 1 à 99");
        for(int i = 1; i <= 99; i += 2)
        {
            System.out.print(i + " ");
        }

}
}