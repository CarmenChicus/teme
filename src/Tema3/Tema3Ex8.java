package Tema3;

import java.util.Scanner;

public class Tema3Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //daca previziunea este rainy sau snowing si viteza vantului > 30 ramai in casa
        //String currentForecast = "rainy"
        //int currentWindSpeed = 40
        //este previziunea rainy sau snowing?
        // este viteza vantului mai mare decat 30?
        String currentForecast = scanner.nextLine();
        int currentWindSpeed = scanner.nextInt();

        boolean home = shouldIStayHome(currentForecast, currentWindSpeed);
        if (home){
            System.out.println("ramai cas");
        } else {
            System.out.println("nu ramai acasa");
        }

        //input: currentForecast si currentWindSpeed
        //ouput: nu avem

    }

    public static boolean shouldIStayHome(String currentForecast, int currentWindSpeed){
        return (currentForecast.equals("rainy") || currentForecast.equals("snowing")) && currentWindSpeed >30;
    }
}
