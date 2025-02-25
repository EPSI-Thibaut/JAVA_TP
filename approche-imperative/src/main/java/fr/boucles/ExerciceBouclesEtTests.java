package fr.boucles;

public class ExerciceBouclesEtTests {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        System.out.println("Éléments du tableau :");
        for (int k : array) {
            System.out.print(k + " ");
        }
        System.out.println();

        System.out.println("Éléments du tableau en ordre inverse :");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); // Pour passer à la ligne suivante

        System.out.println("Éléments du tableau supérieurs à 3 :");
        for (int j : array) {
            if (j > 3) {
                System.out.print(j + " ");
            }
        }
        System.out.println();


        System.out.println("Valeurs des index pairs :");
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        System.out.println("Éléments impairs du tableau :");
        for (int j : array) {
            if (j % 2 != 0) {
                System.out.print(j + " ");
            }
        }
        System.out.println();
    }
}
