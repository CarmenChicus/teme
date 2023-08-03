package Tema1;

import java.util.Scanner;

public class Tema1Ex14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Cat este credit score?");
        int creditScore = scanner.nextInt();
        System.out.println("Are sursa de venit stabila");
        boolean hasSteadyIncome = scanner.nextBoolean();
        System.out.println("Cat este creditul?");
        double loanAmount = scanner.nextDouble();
        System.out.println("Are cash colateral");
        boolean hasCollateral = scanner.nextBoolean();
        System.out.println("Banca poate acorda credite");
        boolean isBankInCreditFreeze = scanner.nextBoolean();

        boolean isLoanApproved = (creditScore > 700 && hasSteadyIncome && !isBankInCreditFreeze) || (loanAmount > 100000 && hasCollateral && !isBankInCreditFreeze);
        System.out.println(isLoanApproved);
    }
}
