package com.company;
import java.util.Scanner;
public class Klasa1 extends Klasa0 {
    double zmiennad;
    void rysuj(double zmienna) {
        System.out.println(zmienna + ".0");
    }
    void przesun(double zmienna) {
        System.out.println("                 " + zmienna + ".0" + "                  ");
    }
    void obrot(double zmienna){
        String zmiennad = Double.toString(zmienna);
        zmiennad.charAt(543210);
        System.out.println(zmiennad);

    }
}
