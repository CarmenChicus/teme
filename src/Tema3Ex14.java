import java.util.Scanner;

public class Tema3Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Scrie un program care citeste de la tastatura 3 numere, reprezentand lugimile laturilor unui triunghi.
        //Trebuie sa afisezi in consola daca cele 3 laturi formeaza un triunghi valid, sau nu. Un triunghi este valid daca suma lungimiint lor oricaror doua laturi este mai mare decat lugimea celei de-a 3-a laturi.

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();


        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("triunghiul este valid");
        }else{
            System.out.println("altfel, triunghiul este invalid");
        }
    }
}