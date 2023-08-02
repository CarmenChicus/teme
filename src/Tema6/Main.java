package Tema6;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int population;
        ;
        population = 30000;
        System.out.println(population);
        population = 50000;
        System.out.println(population);
        String productName = "mustar";
        double price = 2.77;
        boolean isAvailable = true;
        char nutriscore = 'A' ;
        boolean isBio = false;
        System.out.println(population);

        String productName2 = "ketcup";
        double price2 = 65;
        boolean isAvailable2 = false;
        char nutriscore2 = 'A' ;
        boolean isBio2 = true;

        double totalPrice = price + price2;
        double mediumPrice = totalPrice / 2;
        boolean isMediumPriceCorrect = (30 < mediumPrice) && (mediumPrice < 35);
        boolean isMediumPriceCorrect2 = (30 < mediumPrice) || (mediumPrice < 35);
        System.out.println(totalPrice);
        System.out.println(mediumPrice);

        boolean isTotalPriceAfordable = totalPrice < 70;
        System.out.println(totalPrice < 70);
        System.out.println(totalPrice <= 70);
        System.out.println(price == price2);
        System.out.println(isBio2 && isBio);

        boolean isMustardcheaper = price < price2;

        boolean isCold = false;
        boolean isDry = true;
        boolean isSummer = false;
        boolean canTreking = isDry && (!isCold || isSummer);

        String username = "user";
        String password = "pass";
        System.out.println("introdu userul");
        String inputUsename = scanner.nextLine();
        System.out.println("introdu parola");
        String inputPassword = scanner.nextLine();
        boolean isLoggedIn = inputUsename.equals(username)  && inputPassword.equals(password);
        System.out.println(isLoggedIn);


        System.out.println(productName);
    }
}


