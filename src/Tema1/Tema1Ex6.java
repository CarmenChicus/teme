package Tema1;

import java.util.Scanner;

public class Tema1Ex6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Este membru premium");
        boolean isPremiumMember = scanner.nextBoolean();
        System.out.println("Video-ul este cumparat");
        boolean hasBoughtVideo = scanner.nextBoolean();
        System.out.println("Serverul este online");
        boolean isServerOnline = scanner.nextBoolean();

       boolean canViewVideo = (isPremiumMember  && isServerOnline) || (hasBoughtVideo && isServerOnline);

        System.out.println(canViewVideo);
    }
}
