package com.company;
import java.util.Scanner;

public class Figura {
    Scanner scan = new Scanner(System.in);
    int boka;
    int bokb;
    int bokc;
    int wysokosc;
    int obwod;
    double promien;
    double pole;
    void ObliczPole(){
        System.out.println("Podaj bok a");
        boka=scan.nextInt();
    }
    void ObliczObwod() {
        obwod = 2*boka + 2*bokb;
    }
}
