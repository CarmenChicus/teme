package Tema3;

import java.util.Scanner;

public class Tema3Ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Daca salutul incepe cu "Buna ziua", atunci printeaza "nicio penalizare"
        // Daca salutul incepe cu "B", dar nu este "Buna ziua", atunci printeaza "20 de lei penalizare"
        //Daca salutul nici macar nu incepe cu "B", printeaza "100 de lei penalizare" Ignora literele mari si literele mici din salut.
        // Ignora si orice spatii care apar inainte de primul cuvant din salut

        String salut = scanner.nextLine();
        System.out.println(salut);

        if(salut.equalsIgnoreCase("Buna ziua")){
            System.out.println("nici o penalizare");
        } else if (salut.equalsIgnoreCase("B")) {
            System.out.println("20 de lei penalizare");
        }else{
            System.out.println("100 de lei penalizare");
        }
    }
}
