import java.util.Scanner;
public class Tema3Ex21 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Daca etajul curent este mai mic decat etajul dorit, afisam in consola faptul ca liftul urca
        //Daca etajul curent este mai mare decat etajul dorit, afisam in consola faptul ca liftul coboara
        //Daca etajul curent este acelasi cu etajul dorit, afisam in consola ca usile se deschis
        //Liftul poate functiona doar daca nu este in mentenanta
        //Daca liftul este la etajul 0 si nu este in mentenanta, afisam in consola ca usile sunt deschise (adica tot timpul usile raman deschise la parter)
        //Citeste de la tastatura etajul curent, etajul dorit, si daca liftul este in mentenanta sau nu. Apoi implementeaza logica necesara.

        int etajCurent = scanner.nextInt();
        int etajDorit = scanner.nextInt();
        boolean esteMentenanta = scanner.nextBoolean();
        int etaj = scanner.nextInt();

        if (etajCurent < etajDorit) {
            System.out.println("Liftul urca");

        } else if (etajCurent > etajDorit) {
            System.out.println("Liftul coboara");

        } else {
            System.out.println("Usile se deschid");
        }
        if (!esteMentenanta && etaj == 0) {
            System.out.println("Usile sunt deschise");
        } else {
            System.out.println("Liftul nu e la parter");
        }
    }
}



