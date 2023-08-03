package Tema1;

import java.util.Scanner;

public class tema1Ex7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println("Are cursuri anterioare?");
        boolean hasCompletedPrerequisites = scanner.nextBoolean();

       // System.out.println("Are nota medie A sau B?");
       // char gradeInPrerequisites = scanner.next().charAt();

        System.out.println("Sunt locuri libere?");
        boolean hasOpenSpots = scanner.nextBoolean();

        boolean canTakeCourse = hasCompletedPrerequisites  && hasOpenSpots;

        System.out.println(canTakeCourse);
    }
}