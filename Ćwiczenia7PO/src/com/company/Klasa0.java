package com.company;

import java.util.Scanner;
public class Klasa0 {
    int zmiennai;
    String zmiennas;
    Double zmiennad;
    void wczytajZmienna(){
        System.out.println("Podaj zmienna");
        Scanner scan = new Scanner(System.in);
        zmiennad= scan.nextDouble();
        zmiennai=scan.nextInt();
        zmiennas=scan.nextLine();

    }

}
