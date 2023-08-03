package Tema1;

import java.util.Scanner;

public class Tema1Ex13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Camera este disponibila");
        boolean isRoomAvailable = scanner.nextBoolean();
        System.out.println("Nu este depasit nr de rezervari");
        boolean isQuotaExceeded = scanner.nextBoolean();
        System.out.println("Este o camera speciala");
        boolean isHighCapacityRoom = scanner.nextBoolean();
        System.out.println("Care este marimea echipei");
        int teamSize = scanner.nextInt();

        //
        boolean canBookRoom = isRoomAvailable && !isQuotaExceeded && (!isHighCapacityRoom || teamSize>10);
        System.out.println(canBookRoom);
    }
}
