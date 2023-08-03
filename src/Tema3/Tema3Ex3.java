package Tema3;

import java.util.Scanner;

public class Tema3Ex3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char c = scanner.nextLine().charAt(0);
        if (c == 'y' || c == 'Y' ) {
            System.out.println("De acord");
        } else if (c == 'n' || c == 'N') {
            System.out.println("Nu sunt de acord");
        }else {
            System.out.println("Nu inteleg ce vrei");
        }

    }
}


