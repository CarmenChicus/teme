import java.util.Scanner;

public class Tema1Ex9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Cati ani are lucrati?");
        int yearsWorked = scanner.nextInt();
        System.out.println("Ce scor de performanta are?");
        double performanceScore = scanner.nextDouble();
        System.out.println("Are recomandare de la manager");
        boolean hasManagerRecommendation = scanner.nextBoolean();
        System.out.println("Are sanctiuni disciplinare");
        boolean hasDisciplinaryAction = scanner.nextBoolean();
        System.out.println("Sunt promovarile inghetate");
        boolean isPromotionFreeze = scanner.nextBoolean();

        boolean isEligibleForPromotion = (yearsWorked > 5 && performanceScore > 8 && !isPromotionFreeze) || (hasManagerRecommendation && !hasDisciplinaryAction && !isPromotionFreeze);

        System.out.println(isEligibleForPromotion);
    }
}
