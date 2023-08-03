package Tema3;

import java.util.Scanner;

public class Tema3Ex17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Citeste de la tastatura numele fisierului.
        //Daca extensia fisierului este .jpg, .jpeg, sau .png, atunci fisierul este o imagine
        //Daca extensia fisierului este .webm, su .mp4, fisierul este un video.
        //Daca extensia fisierului este .zip, fisierul este o arhiva

        String fisier = scanner.nextLine();
        System.out.println(fisier);
        String extensie = scanner.nextLine();

        if (extensie.equals(".zip")) {
            System.out.println("fisierul este o arhiva");
        } else if (extensie.equals(".jpg") || extensie.equals(".jpeg") || extensie.equals(".png")) {
            System.out.println("fisierul este o imagine");
        } else if (extensie.equals(".webm") || extensie.equals(".mp4")) {
            System.out.println("fisierul este un video");
        }
    }
}
