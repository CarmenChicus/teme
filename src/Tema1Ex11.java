import java.util.Scanner;

public class Tema1Ex11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println("Cate puncte are?");
        int playerPoints = scanner.nextInt();

        System.out.println("Are o cheie de aur");
        boolean hasGoldenKey = scanner.nextBoolean();

        System.out.println("Este sub atac");
        boolean isUnderAttack = scanner.nextBoolean();

        System.out.println("Jocul este pe pauza");
        boolean isGamePaused = scanner.nextBoolean();


        System.out.println("Serverul ruleaza");
        boolean isServerRunning = scanner.nextBoolean();

        boolean canAdvanceLevel = (playerPoints > 1000 && !isUnderAttack && !isGamePaused && isServerRunning) || (hasGoldenKey && !isUnderAttack && !isGamePaused && isServerRunning);
        System.out.println(canAdvanceLevel);
    }
}

