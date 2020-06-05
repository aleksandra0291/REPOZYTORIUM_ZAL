package com.company;

import java.util.Scanner;

public class Person {
    private String surname;
    private String name;
    private Integer age;

    void Wczytaj() {
        Scanner scan= new Scanner(System.in);
        System.out.println("Wpisz swoje imię");
        name= scan.nextLine();
        System.out.println("Wpisz swoje nazwisko");
        surname= scan.nextLine();
        System.out.println("Wpisz swój wiek");
        age= scan.nextInt();
    }
    void Wypisz(){
        System.out.println(surname+ " " + name+ " "+ age);

    }

}
