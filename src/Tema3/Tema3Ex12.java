package Tema3;

import java.util.Scanner;

public class Tema3Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //daca raspunsul este mai mic decat solutia (adica valoarea variabilei guess, afiseaza “nu ai ghicit, numarul este prea mic”
          //      daca raspunsul este mai mare decat solutia, afiseaza “nu ai ghicit, numarul este prea mare”
          //      daca raspunsul este egal cu solutia, afiseaza “ai ghicit”
        int guess = scanner.nextInt();
        int answer = scanner.nextInt();
        if (answer == guess){
            System.out.println("Ai ghicit!");
        } else if (answer < guess) {
            System.out.println("Nu ai ghicit, numarul este prea mic");
        }else{
            System.out.println("Nu ai ghicit, numarul este prea mare");
        }

    }
}
