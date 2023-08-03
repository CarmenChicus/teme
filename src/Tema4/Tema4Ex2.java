package Tema4;

import java.util.Scanner;

public class Tema4Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Scrie un program care afiseaza suma numerelor de la 1 la n, n fiind citit de la tastatura
        int n = 10;
        int i = 1;
        int sum = 0;

        while(i<=n){
            System.out.println(sum);
            sum = sum + i;
            i++;
        }

    }
}
