package Strings;

public class Ex1 {
    //Scrie un program care sa extraga prima jumatate a unui String de lungime para
    //De exemplu, pentru "programmer", se va afisa in consola "progr".
    public static void main(String[] args) {
        String s = "programmer";
       s=  s.substring(0, s.length()/2);
        System.out.println(s);
    }
}
