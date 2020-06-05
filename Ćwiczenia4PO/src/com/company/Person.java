package com.company;
import java.util.Scanner;

public class Person {
    String surname;
    String name;
    int age;
    Address adress = new Address();
     void wczytajPerson(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj nazwisko");
        surname= scan.nextLine();
        System.out.println("Podaj imię");
        name= scan.nextLine();
        System.out.println("Podaj wiek");
        age =scan.nextInt();
        adress.wczytajAdres();
    }
    void wyswietlPerson(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nazwisko: " + surname+ "\n");
        System.out.println("Imię: " + name + "\n");
        System.out.println("Wiek: " + age + "\n");
        adress.wyswietlAdres();
    }
    void podajImie(){
        System.out.println(name);
    }
    void podajNazwisko() {
        System.out.println(surname);
    }
}