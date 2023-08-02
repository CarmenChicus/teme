import java.util.Scanner;

public class Tema3Ex24 {
    public static void main(String[] args) {
        ;
        Scanner scanner = new Scanner(System.in);

        //Citeste de la tastatura 3 numere si afiseaza in consola cel mai mare(maximul) si cel mai mic (minimul) dintre cele 3 numere.
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int max;
        int min;

        if (a > b && a > c && b > c) {
            max = a;
            min = c;
            System.out.println("max este " + max + " min este " + min);
            // System.out.println("min este " + c);

        } else {
            System.out.println("se afiseaza numar diferit de min si max " + b);
        }
    }
}



