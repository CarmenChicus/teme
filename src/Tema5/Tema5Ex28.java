package Tema5;

public class Tema5Ex28 {


    //      #
    //     ##
    //    ###
    //   ####
    //  #####
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++){

            //printam n - i - 1 spatii
            for (int j = 0; j<n-i-1; j++){
                System.out.print(" ");
            }
            //printam i+1 dieji
            for (int j=0; j<=i; j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
