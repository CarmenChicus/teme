package Tema3;

import java.util.Scanner;

public class Tema3Ex11 {
    public static void main(String[] args) {

        // Citeste de la tastatura un numar care reprezinta un an, si afiseaza la consola daca anul este bisect sau nu.
        // Un an este bisect daca este divizibil cu 400 sau cu 4 si in acelasi timp nu este divizibil cu 100
        //De exemplu, pentru valoarea initiala:
        //int year = 2020
        //se va afisa in consola: "anul 2020 este bisect"

        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();

        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Anul " + year + " este bisect");
        } else {
            System.out.println("Anul " + year + " nu este bisect");
        }
    }
}

