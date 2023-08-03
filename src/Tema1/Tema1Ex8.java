package Tema1;

import java.util.Scanner;

public class Tema1Ex8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Cartea este deja imprumutata");
        boolean isBookRented = scanner.nextBoolean();

        System.out.println("Cate carti imprumutate are clientul?");
        int numberOfRentedBooks = scanner.nextInt();

        System.out.println("Clientul  nu are datorii");
        boolean hasLateFees = scanner.nextBoolean();

        boolean canRentBook = !isBookRented && numberOfRentedBooks < 3 && !hasLateFees;

        System.out.println(canRentBook);
    }
}
