package com.company;
import java.util.Scanner;
public class Klasa1 extends Klasa0 {
    double zmiennad;
    public void rysuj(double zmienna) {
        System.out.println(zmienna + ".0");
    }

    public void rysuj(String zmienna) {
        System.out.println(zmienna);
    }

    public void rysuj(int zmienna) {
        System.out.println(zmienna + zmienna + zmienna);
    }
}
