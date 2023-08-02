package Tema5;

import java.util.Scanner;

public class Tema5Ex27 {
    public static void main(String[] args) {
        //Printeaza aceeasi jumatate de piramida (doar ca acum formata din numere), in functie de un numar n citit de la tastatura.

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            printRow(i);
        }
    }

    public static void printRow (int number){
        for (int j = 0; j <= number; j++) {
            System.out.print("#");
        }
        System.out.println();
    }
}