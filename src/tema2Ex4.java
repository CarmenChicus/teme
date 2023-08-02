import java.util.Scanner;

public class tema2Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       citesteNumeDomeniu("Carmen", "gmail.com");
       String name = scanner.nextLine();
       String domeniu = scanner.nextLine();
       System.out.println(scanner.nextLine());
    }

    public static String creareNumeDomeniu(String nume, String domeniu){
        String result = nume + '@' + domeniu;
        return result;
    }
    public static void citesteNumeDomeniu(String nume, String domeniu) {
        String creare = creareNumeDomeniu(nume, domeniu);
        System.out.println(creare);
    }
}

