import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Tema6Excls {
    public static void main(String[] args) {


        //citim de la tastatura cate scor-uri vrem sa introducem introducem
        //apoi citim fiecare scor de la tastatura si il adaugam intr-un array
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cate scoruri ai?");
        int n = scanner.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
           // System.out.println(scores[i]);
        }

        // System.out.println(sum);
        int average  = getAverage(scores);
        System.out.println(average);
    }

    public static int getAverage(int[] scores) {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
        }
        return sum/ scores.length;
    }
}