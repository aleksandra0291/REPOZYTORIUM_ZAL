package com.company;

import java.util.Scanner;
public class Ksiazka {
    private String tytuł;
    private String autor;
    private String wydawnictwo;
    private int rok_wydania;
    private int cena;
   Ksiazka (){ }
    public Ksiazka(String tytuł, String autor, int rok_wydania, String wydawnictwo) { }
    {
        this.tytuł=tytuł;
        this.autor=autor;
        this.rok_wydania=rok_wydania;
        this.wydawnictwo=wydawnictwo;

    }
    void wczytajTytul(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj tytuł książki ");
        tytuł= scan.nextLine();
    }
    void wczytajAutor(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj autora książki ");
        tytuł= scan.nextLine();

    }
    void wczytajRokWydania(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj rok wydania książki ");
        rok_wydania= scan.nextInt();
    }
    void wczytajWydawnictwo(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj nazwę wydawnictwa");
        wydawnictwo= scan.nextLine();
    }
    void wypiszTytul(){
        System.out.println("Tytuł książki to: " + tytuł);
    }
    void wypiszAutor(){
        System.out.println("Autor książki to: " + autor);
    }
    void wypiszRokWydania(){
        System.out.println("Książka została wydana w: " + rok_wydania);
    }
    void wypiszjWydawnictwo(){
        System.out.println("Wydawnictwo tej książki to: " + wydawnictwo);
    }
}
