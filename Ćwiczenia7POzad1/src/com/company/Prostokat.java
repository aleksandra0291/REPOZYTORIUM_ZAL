package com.company;
import java.util.Scanner;
public class Prostokat extends Kwadrat {
    Scanner scan = new Scanner(System.in);
    @Override
    void ObliczPole() {
        super.ObliczPole();
        System.out.println("Pole wynosi : " + boka * bokb);
    }

    @Override
    void ObliczObwod() {
        super.ObliczObwod();
        System.out.println( "Obwód wynosi : " + (2*boka)+(2*bokb));

    }
}
