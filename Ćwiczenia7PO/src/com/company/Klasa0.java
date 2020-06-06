package com.company;
import java.util.Scanner;
public class Klasa0 {
    int zmiennai;
    String zmiennas;
    Double zmiennad;
    void wczytajDane(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj zmienną");
        zmiennad= scan.nextDouble();
        zmiennai=scan.nextInt();
        zmiennas=scan.nextLine();

    }
}
