package Tema3;

import java.util.Scanner;

public class Tema3Ex15 {
    public static void main(String[] args) {

        //Citeste de la tastatura raspunsul utilizatorului.\
        //
        //Printeaza apoi "corect", daca utilizatorul a raspuns cu 42, "forty-two" sau "forty-two", indiferent daca a folosit litere mari sau mici
        //Atlfel, printeaza "incorect"

        Scanner scanner = new Scanner(System.in);

        String parolaSecreta = scanner.nextLine();

        System.out.println(parolaSecreta);

        if (parolaSecreta.equalsIgnoreCase("forty-two") || parolaSecreta.equalsIgnoreCase("forty two") ||parolaSecreta.equals("42")){
            System.out.println("corect");
        } else  {
        System.out.println("incorect");
        }
    }
}
