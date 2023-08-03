package Tema3;

import java.util.Scanner;

public class Tema3Ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Trebuie sa tinem cont de urmatoarele conditii:
        // Cladura se va porni daca temperatura este mai mica decat 20 de grade si fie este iarna, fie este cineva acasa
        // Luminile se vor porni daca afara este intuneric si daca cineva este acasa.
        // Totusi, daca persoana care este acasa doarme, atunci luminile nu se vor porni
        // Alarma se va activa daca nimeni nu este acasa si fie este intuneric, fie fereastra este deschisa.
        //Casa are multi senzori care primesc informatii:
        //Valoarea temperaturii
        //Daca este sau nu cineva acasa
        //Daca este sau nu intuneric afara
        //Daca este sau nu fereastra deschisa
        //Daca persoana din casa doarme
        //Daca este iarna
        //Citeste de la tastatura valorile senzorilor si apoi implementeaza logica necesara.

        int temperature = scanner.nextInt();
        boolean homeFull = scanner.nextBoolean();
        boolean darkOutside = scanner.nextBoolean();
        boolean windowsOpen = scanner.nextBoolean();
        boolean personSleeps = scanner.nextBoolean();
        boolean isWinter = scanner.nextBoolean();

        if (temperature < 20 && isWinter || homeFull){
            System.out.println("Caldura se va porni");
        }else {
            System.out.println("caldura nu se va porni");
        }
        if (darkOutside && homeFull&& !personSleeps){
            System.out.println("Luminile se vor porni");
        }else{
            System.out.println("Luminile nu se vor porni");
        }
        if (!homeFull && darkOutside || windowsOpen){
            System.out.println("Alarma se va activa");
        }else {
            System.out.println("Alarma nu se va porni");
        }
    }
}
