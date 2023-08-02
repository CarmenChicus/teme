import java.util.Scanner;

public class Tema4Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Defineste in cadrul programului o variabila care sa contina un PIN, format din 4 cifre,
        // care va reprezenta PIN-ul corect.
        //Un utilizator are maxim 3 incercari sa introduca de la tastatura PIN-ul corect.
        //Daca reuseste sa faca asta, se va afisa in consola "PIN corect" si programul se va opri.
        //Daca nu reuseste sa faca asta, se va afisa in consola "PIN incorect" si programul se va opri

        int pin = 1234;
        int pinInsered = 0;

        boolean accesGranted = isPinValid(pin, 3);
        if (accesGranted) {
            System.out.println("Pin Corect");
        } else {
            System.out.println("card blocat");
        }
    }

    public static boolean isPinValid(int pin, int maxAttempts) {
        int i = 0;
        int pinInsered = 0;
        Scanner scanner = new Scanner(System.in);
        while (i < maxAttempts && pin != pinInsered) {
            pinInsered = scanner.nextInt();
            if (pinInsered == pin) {
                return true;
            } else {
                System.out.println("mai ai " + (2 - i) + " incercari");
            }
            i++;
        }
        return false;
    }
}

