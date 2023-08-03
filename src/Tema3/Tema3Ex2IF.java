package Tema3;

import java.util.Scanner;

public class Tema3Ex2IF {
    public static void main(String[] args) {
        Scanner scanne = new Scanner(System.in);
        System.out.println("Introdu temperatura");
        int temperatura = scanne.nextInt();
        if (temperatura >= 100) {
            System.out.println("Apa fierbe");
        }
        //altfel daca intre 50-100 aproape fiarta
        //alltfel daca mai mica de 50 in curs de fierbere
        else if (temperatura >= 50 && temperatura < 100) {
            System.out.println("apa e aproape fiarta");
        } else if (temperatura < 50 && temperatura >= 0) {
            System.out.println("Apa e in curs de fierbere");
        }
        else {
            System.out.println("Apa e inghetata");
        }
    }

}
