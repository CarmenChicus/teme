package oop.ex6;

public class Game {

    public static void main(String[] args) {

        Fighter fighter1 = new Fighter("fighter1", 100, 10);
        Fighter fighter2 = new Fighter("fighter2", 100, 11);

        System.out.println(declareWinner(fighter1, fighter2, "fighter1"));
    }

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttackerName){
        //stabilim cine atata primul
            //compar firtsAttaker cu numele lui fighter 1 SI DACA SUNT egale , atunci retin intr-o variabila cu numle firstAtacker pe fighter 1
            //daca nu, retin intr-o variabila cu numele firstAttacker pe fighter2
        //atat timp cat viata amandurora e  mai mare decat 0
            //scadem din viata celui de-al doilea damageul pe care il da primul
            //daca viata lui al doilea este mai mica sau egala decat 0 , returnez numele primului
            //scadem din viata rpimului damage-ul pe care il al doilea
            //daca viata primului este mai mica sau egala decat 0, returnez numele lui al doilea

        Fighter firstAttacker = new Fighter();
        Fighter secondAttacker = new Fighter();
        if (firstAttackerName.equals(fighter1.name)){
            firstAttacker = fighter1;
            secondAttacker = fighter2;
        }
        else{
            firstAttacker = fighter2;
            secondAttacker = fighter1;
        }

        //Fighter firstAttaker = firstAttackerName.equals(fighter1.name) ? fighter1 : fighter2;

        while (firstAttacker.health>0 && secondAttacker.health>0){
            secondAttacker.health -= firstAttacker.damagePerAttack;
            if (secondAttacker.health<=0){
                return firstAttacker.name;
            }
            firstAttacker.health-=secondAttacker.damagePerAttack;
            if (firstAttacker.health<=0){
                return secondAttacker.name;
            }
        }
        return "";
    }
}
