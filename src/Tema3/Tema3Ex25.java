package Tema3;

import java.util.Scanner;

public class Tema3Ex25 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Citeste de la tastatura 3 numere si afiseaza-le in ordine crescatoare in consola. Foloseste doar instructiunea IF

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a < b && b < c && a < c) {
            System.out.println("nr min este " + a + " nr mediu este " + b + " nr max este " + c);
        } else if (a < b && b > c && a < c) {
            System.out.println("nr min este " + a + " nr mediu este " + c + " nr max este " + b);
        } else if (b < a && a < c && b < c) {
            System.out.println("nr min este " + b + " nr mediu este " + a + " nr max este " + c);
        } else if (b < a && a > c && b < c) {
            System.out.println("nr min estee " + b + " nr mediu estee " + c + " nr max este " + a);
        } else if (c < a && a < b && c < b) {
            System.out.println("nr min este " + c + " nr mediu este " + a + " nr max este " + b);
        } else {
            System.out.println("nr min este " + c + " nr mediu este " + b + " nr max este " + a);
        }
    }
}


