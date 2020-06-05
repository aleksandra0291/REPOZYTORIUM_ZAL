package com.company;
import java.util.Scanner;

public class Przedmiot {
    private String nazwa;
    private String typ;
    private String producent;
    private int rok_produkcji;

    Przedmiot()
    {
    }
    public Przedmiot(String nazwa, String typ, String producent, int rok_produkcji) {

        this.nazwa=nazwa;
        this.typ=typ;
        this.producent=producent;
        this.rok_produkcji=rok_produkcji;
     }

    void wczytaj() {
        Scanner scan= new Scanner(System.in);
        System.out.println("Podaj nazwę przedmiotu" );
        nazwa= scan.nextLine();
        System.out.println("Podaj typ przedmiotu");
        typ= scan.nextLine();
        System.out.println("Podaj producenta");
        producent= scan.nextLine();
        System.out.println("Podaj rok produkcji");
        rok_produkcji= scan.nextInt();
    }
    void wypisz() {
        System.out.println("Nazwa przedmiotu : " + nazwa + "\n" + "Typ przedmiotu : " + typ + "\n" + "Wyprodukowano przez :" + producent + "\n" + "Rok produkcji : " + rok_produkcji + "\n");
    }
}
