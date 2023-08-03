package Tema3;

import javax.management.StringValueExp;
import java.util.Scanner;

public class Tema3Ex23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Automatul are 3 tipuri de cafea: espresso, care costa 5 lei, latte, care costa 7 lei si cappuccino, care costa 6 lei.
        //Clientul poate adauga extra lapte pentru 1 leu, sau extra zahar in mod gratuit.
        //Citeste de la tastatura tipul cafelei si daca clientul doreste extra lapte sau extra zahar.
        //Apoi afiseaza in consola pretul total.
        // int cafea = scanner.nextInt();
        
        String coffeType = scanner.nextLine();
        boolean extraLapte = scanner.nextBoolean();
        
        //daca tipul este expresso, atunci pretul e 5 lei
        //altfel daca este latte, atunci 7 lei
        //altfel daca este capuccino, atunci 6 lei
        //altfel "imi pare rau, n-avem "
        //daca extraLapte atunci maresc pretul cu 1
        int price = 0;
        if (!isValid(coffeType)){
            System.out.println("n-avem");
        } else {
            if (coffeType.equals("espresso")) {
                price = 5;
            } else if (coffeType.equals("latte")) {
                price = 7;
            }

            if (extraLapte) {
                price += 1;
            }
            System.out.println(price);
        }


//        if (espresso.equals("5") && extraLapte.equals("1") || extraZahar.equals("")) {
//            System.out.println("espresso cu extralapte sau extrazahar" );
//
//        } else if (latte.equals("7") && extraLapte.equals("1") || extraZahar.equals("")) {
//            System.out.println("latte cu extralapte sau extrazahar" );
//        } else if (cappucino.equals("6") && extraLapte.equals("1") || extraZahar.equals("")) {
//            System.out.println("cappucino cu extralapte sau extrazahar" );
//        }


    }

    private static boolean isValid(String coffeType) {
        return coffeType.equals("espresso") || coffeType.equals("latte");
    }
}









