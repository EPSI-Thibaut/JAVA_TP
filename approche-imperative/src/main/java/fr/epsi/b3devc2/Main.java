package fr.epsi.b3devc2;

public class Main {
    public static void main(String[] args) {
        // Déclaration et affectation de variables
        byte b = 10;
        short a = 1;
        int c = 5;
        long d = 100;
        int e = 2;


        System.out.print(e++ + " - " + e + " - " + ++e);

        // Affichage d'une variable
        System.out.println("Valeur de b : " + b);

        // Déclaration de la chaine de caractères
        String randomString = "Voici le résultat d’un calcul :\n1+5=6";

        // Chaine de caractères avec un saut de ligne
        System.out.println(randomString);
    }
}