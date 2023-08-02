import java.util.Scanner;

public class Ses3ExIF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 10;
        int y = 10;
        System.out.println(getComparison(x,y));

        if (x == y) {
            System.out.println("egale");
        } else {
            System.out.println("diferite");
        }


    //2,4,6,8
    // % = modulo
    int number = 25;
        if(isEven(number)) {
        System.out.println("par");
    }else{
        System.out.println("impar");
    }
    int score = 73;
        System.out.println(getGrade(score));
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static String getGrade(int score) {
        String grade = "";
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else {
            grade = "F";
        }
        return grade;
    }
    public static String getComparison(int x, int y){
        if (x < y) {
          return "x mai mic ca y";
        } else if (x > y) {
          return "x mai mare ca y";
        } else {
            return "x egal cu y";
        }

    }
}
