public class Tema4Ex3 {
    public static void main(String[] args) {


        //Scrie un program care afiseaza numerele pare de la 1 la n
        int n = 10;
        int i = 2;

        while (i <= n) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i += 2;
        }
    }
}
