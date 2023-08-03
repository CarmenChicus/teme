package Tema3;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Tema3Ex22 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        //Daca semaforul este verde si nu asteapta niciun pieton, afisam in consola faptul ca masinile circula
        //Daca semaforul este verde si exista pietoni care asteapta, afisam in consola faptul ca lumina se va schimba la rosu. Si dupa un delay, semaforul trebuie sa se schimbe la rosu
        //Daca semaforul este rosu si inca exista pietoni care asteapta, afisam in consola faptul ca acum trec pietonii
        //Daca semaforul este rosu si nu mai exista pietoni care asteapta, afisam in consola ca lumina se va schimba la verde. SI dupa un delay, semaforul trebuie sa se schimbe la verde.
//TimeUnit.SECONDS.sleep(2)
        //(trafficLight) si statusul pietonilor (arePedestriansWaiting).
        String trafficLight = scanner.nextLine();
        boolean arePedestrianWaiting = scanner.nextBoolean();
        // TimeUnit time = TimeUnit.SECONDS;

        for (int i = 0; i < 10; i++) {
            System.out.println("Iteration: " + i);

            if (i == 3) {
                arePedestrianWaiting = true;
            }

            if (i == 6) {
                arePedestrianWaiting = false;
            }

            /* insereaza codul aici */
            if (trafficLight.equals("verde")) {
                if (!arePedestrianWaiting) {
                    System.out.println("masinile circula");
                } else {
                    System.out.println("lumina se va schimba la rosu");
                    //dam un delay
                    TimeUnit.SECONDS.sleep(2);
                    //trafficLight devine rosu
                    trafficLight = "rosu";
                }
            } else {
                if (arePedestrianWaiting) {
                    System.out.println("acum trec pietonii");
                } else {
                    System.out.println("lumina se va schimba la verde");
                    TimeUnit.SECONDS.sleep(2);
                    trafficLight = "verde";
                }
            }


            //System.out.println("semaforul trebuie sa se schime la verde" + TimeUnit.SECONDS.sleep(2));
        }
    }
}

