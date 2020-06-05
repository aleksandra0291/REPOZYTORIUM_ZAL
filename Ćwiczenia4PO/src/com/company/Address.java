package com.company;
import java.util.Scanner;

public class Address {

    String city;
    String street;
    String zip_code;
    void wczytajAdres(){
        Scanner scan= new Scanner (System.in);
        System.out.println("Podaj Miasto");
        city= scan.nextLine();
        System.out.println("Podaj Ulicę");
        street= scan.nextLine();
        System.out.println("Podaj Kod Pocztowy");
        zip_code= scan.nextLine();
    }
    void wyswietlAdres(){
        System.out.println( "Miasto: " + city + "\n");
        System.out.println("Ulica: " + street + "\n");
        System.out.println("Kod pocztowy: " + zip_code + "\n");
    }
    }


