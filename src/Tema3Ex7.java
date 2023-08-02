
import java.util.Scanner;

public class Tema3Ex7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int pretBilet = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String zi = scanner.nextLine();

        if (a < 12 && b > 65) {
            pretBilet = 5;
        } else {
            pretBilet = 10;
        }

        if (zi.equals("marti")) {
            pretBilet = pretBilet - 2;
        } else {
            System.out.println(pretBilet);
        }
    }
}

