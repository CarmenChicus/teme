package Tema2;

import java.util.Scanner;

public class Tema2Ex9 {

    public static void accessSmartHome(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password: ");
        int password = 76543210;
        int passwordInput = scanner.nextInt();

        // checking if the password is correct
        if (passwordInput == password) {
            chooseOption();
        } else {
            System.out.println("parola incorecta");
        }
    }

    public static void chooseOption(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the object: 1 – speakers, 2 – lamp, 3 – door");
        String action = scanner.next();

        switch (action) {
            case "1":
                controlSpeakers();
                break;
            case "2":
                //controLights();
                break;
            case "3":
                //controlDoor();
                break;
            default:
                System.out.println("inalid option");
        }
    }

    public static void controlSpeakers(){
        Scanner scanner = new Scanner(System.in);
        String speakersState1 = scanner.nextLine();
        switch (speakersState1) {
            case "on":
                // ...
            case "off":
                // ...
            default:
                // ...
        }
    }



    public static void main(String[] args) {
        // ...
        Scanner scanner = new Scanner(System.in);
        int password = 76543210;
        String speakersState;
        String lampState;
        String doorState;
        //acccessSmartHome()
            //citirea parolei
            //verificarea parolei si daca este corecta apelam chooseAction()

        //chooseAction()
            //in functie de actiune, sa execute ce trebe
               // pentru 1: controlSpeakers()
               // pentru 2: controlLights()
               //pentru 3: controlDoor();

        // reading the password
        System.out.println("Enter password: ");
        int passwordInput = scanner.nextInt();

        // checking if the password is correct
        if (passwordInput != password) {
            System.out.println("Incorrect password!");
        } else {
            // asking the user what they want to do
            System.out.println("Choose the object: 1 – speakers, 2 – lamp, 3 – door");
            String action = scanner.next();

            switch (action) {
                case "1":
                    // asking the user about speakers
                    String speakersState1 = scanner.nextLine();
                    switch (speakersState1) {
                        case "on":
                            // ...
                        case "off":
                            // ...
                        default:
                            // ...
                    }
                    break;
                case "2":
                    // asking the user about lights...
                case "3":
                    // asking the user about the door...
            }
        }
    }
}
