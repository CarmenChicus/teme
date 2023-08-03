package Tema4;

import java.util.Scanner;

public class Tema4Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Scrie un program care afiseaza numerele din sirul fibonacci pana la maxim n, n fiind citit de la tastatura
        //0, 1, 1, 2, 3, 5, 8, 13, 21,
        //n =25
        //cat timp nu am ajuns la 25
        //next devine first +second
        //copiez in first ce am in second second
        //copiez in second ce am in next

        int first = 0;
        int second = 1;
        int next = 0;

        while(first<=25){
            System.out.println(first);
            next =first + second;
            first =second;
            second = next;
        }

    }
}
