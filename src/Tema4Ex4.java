public class Tema4Ex4 {
    public static void main(String[] args) {

        //Scrie un program care afiseaza suma numerelor divizibile cu 3 din intervalul [1-n], n fiind citit de la tastatura.


        int n = 10;
        int i = 1;
        int sum = 0;
        while (i <= n) {
            if (i % 3 == 0) {
                sum = sum + i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
