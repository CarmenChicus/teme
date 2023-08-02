import java.util.Scanner;

public class Tema1Ex15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println("Utilizatorul este angajat");
        boolean isEmployee = scanner.nextBoolean();
        System.out.println("Utilizatorul este contractor");
        boolean isContractor = scanner.nextBoolean();
        System.out.println("Badge-ul este activ");
        boolean isBadgeActive = scanner.nextBoolean();
        System.out.println("Contractul nu este expirat");
        boolean isContractExpired = scanner.nextBoolean();
        System.out.println("Nu sunt ore de mentenanta");
        boolean isMaintenanceHour = scanner.nextBoolean();

        boolean canAccessNetwork = (isEmployee && isBadgeActive) || (isContractor && isBadgeActive || !isContractExpired) && !isMaintenanceHour;
        System.out.println( canAccessNetwork);
    }
}
