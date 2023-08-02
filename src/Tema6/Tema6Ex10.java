package Tema6;

import java.util.Scanner;

public class Tema6Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i<n; i++){
            prices[i] = scanner.nextInt();
        }

        int[] pricesReversed = new int[n];

        for (int i=prices.length-1; i>=0; i--){
            pricesReversed[n-i-1]=prices[i];
        }


        for (int i=0; i<pricesReversed.length; i++){
            System.out.print(pricesReversed[i] + " ");
        }



    }
}
