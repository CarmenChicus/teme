package Tema3;

import java.util.Scanner;

public class Tema3Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Daca valoarea citita este 10, -10, sau 0, printeaza un mesaj corespunzator (ex: "numarul este -10", in caz ca valoarea citita este -10)
        //Altfel, printeaza fie "numarul este pozitiv", fie "numarul este negativ", dupa caz

        int number = scanner.nextInt();

        if(number>=-10 && number <= -1){
            System.out.println("numarul este" + number );
        } else if (number >=0 && number <=10) {
            System.out.println("numarul este pozitiv");
        }
    }
}
