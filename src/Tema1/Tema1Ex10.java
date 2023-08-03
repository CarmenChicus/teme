package Tema1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Tema1Ex10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Este administrator");
        boolean isAdministrator = scanner.nextBoolean();
        System.out.println("Are rolul de manager");
        boolean isManager = scanner.nextBoolean();
        System.out.println("Este parte din proiectul paginii secrete");
        boolean isPartOfProject = scanner.nextBoolean();
        System.out.println("Are 2FA");
        boolean hasTwoFactorEnabled = scanner.nextBoolean();
        System.out.println("Este marcat cu activitate suspicioasa");
        boolean isFlaggedSuspicious = scanner.nextBoolean();
        System.out.println("Serverul este pornit");
        boolean isServerUp = scanner.nextBoolean();

        boolean canAccessPage = (isAdministrator  && hasTwoFactorEnabled && !isFlaggedSuspicious && isServerUp) || (isManager && isPartOfProject && hasTwoFactorEnabled && !isFlaggedSuspicious && isServerUp);
        System.out.println(canAccessPage);
    }
}
