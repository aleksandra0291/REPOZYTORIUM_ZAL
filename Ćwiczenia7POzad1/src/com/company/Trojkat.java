package com.company;
import java.util.Scanner;
public class Trojkat extends Figura {
    @Override
    void ObliczPole() {
        super.ObliczPole();
        System.out.println(" Pole trojkata wynosi: " + (boka * wysokosc)/2);
    }

    @Override
    void ObliczObwod() {
        super.ObliczObwod();
        System.out.println("obwód trojkata to: "  + boka +bokb +bokc);
    }
}
