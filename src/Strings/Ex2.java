package Strings;

public class Ex2 {
    public static void main(String[] args) {
        //Scrie un program care sa concateneze doua String-uri, mai putin primul caracter din fiecare
        //Pentru "Java" si "Fundamentals", se va afisa in consola "avaundamentals".
        String s1 = "Java";
        String s2 = "Fundamentals";
        String s3 = s1.substring(1) + s2.substring(1);
        System.out.println(s3);
    }
}
