import java.util.Scanner;

public class Tema2Ex4var3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String domeniu = scanner.nextLine();
        String fullEmail = createEmail (name, domeniu);
        System.out.println(fullEmail);
    }

    public static String createEmail(String name, String domeniu) {
        return name + '@' + domeniu;
    }

}

