package Tema3;

import java.util.Scanner;

public class Tema3Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //“toate numerele sunt egale”, daca toate numerele sunt egale
        //“toate numerele sunt diferite”, daca toate numerele sunt diferite
        //“cel putin doua sunt egale”, daca oricare doua numere dintre cele trei sunt egale De exemplu, pentru valorile initiale:
        //se va afisa in consola: "cel putin doua sunt egale"
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a == b && b == c && a == c) {
            System.out.println("Toate numerele sunt egale");

        } else if (a != b && b != c && a != c) {
            System.out.println("Toate numetele sunt diferite");
        } else {
            System.out.println("Cel putin doua sunt egale");
        }
    }

}
