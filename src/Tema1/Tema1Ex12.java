package Tema1;

import java.util.Scanner;

public class Tema1Ex12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Cat este nivelul de combustibil");
        double fuelLevel = scanner.nextDouble();
        System.out.println("Sistemele funcioneaza");
        boolean isSystemsCheckPassed = scanner.nextBoolean();
        System.out.println("Vremea este buna");
        boolean isWeatherClear = scanner.nextBoolean();
        System.out.println("Nu are oameni la bord");
        boolean hasLivingCreaturesInCargo = scanner.nextBoolean();
        System.out.println("Este o misiune de salvare");
        boolean isRescueMission = scanner.nextBoolean();
        boolean canTakeOff = fuelLevel>50 && isSystemsCheckPassed && isWeatherClear && (!hasLivingCreaturesInCargo || isRescueMission);
        System.out.println(canTakeOff);
    }
}
