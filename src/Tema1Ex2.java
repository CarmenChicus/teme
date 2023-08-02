import java.util.Scanner;

public class Tema1Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Da-mi-l pe a");
        int a = scanner.nextInt();
        System.out.println("Da-mi-l pe b");
        int b = scanner.nextInt();

        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("la final a este "+a);
        System.out.println("la final b este "+b);

    }

}
