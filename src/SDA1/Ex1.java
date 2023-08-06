package SDA1;

public class Ex1 {
    public static void main(String[] args) {
        //1 2 3 4 5 6 7 8 9 10 11 12 13
        //N R A R N V N R A  R  N  V N
        //input nr descanduri
        int n = 13;
        //output
        int red = 1;
        int blue = 1;
        int purple = 0;
        int noColor = 1;

        //pentru fiecare scandura de la 4 pana la n
        //pentru  scandura curenta:
        //daca e multiplu de 2 si de 3, atunci o contorizam ca violet
        //altfel, daca e multiplu de 2, atunci  o contorizam ca rosie
        //altfel, daca e multiplu de 3, atunci  o contorizam ca albastra
        //altfel, atunci o contorizam ca nevopsit
        for (int i = 4; i <= n; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                purple++;
            } else if (i % 2 == 0) {
                red++;
            } else if (i % 3 == 0) {
                blue++;
            } else {
                noColor++;
            }
        }
        System.out.println("red" + red);
        System.out.println("blue" + blue);
        System.out.println("purple" + purple);
        System.out.println("noColor" + noColor);
    }

}
