package Tema6;

public class Tema6Ex9 {

    public static void main(String[] args) {
        int[] prices = {7,3,1,10,9};
        int min = prices[0];
        int max = prices[0];
        for (int i = 0; i<prices.length; i++){
            if (prices[i]<min){
                min = prices[i];
            }
            if (prices[i]>max){
                max = prices[i];
            }
        }

        System.out.println(min + " " + max);


    }
}
