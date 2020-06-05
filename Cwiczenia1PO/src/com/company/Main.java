//Napiszmy program, w którym zostanie zdefiniowana klasa osoba (zawierająca pola: nazwisko, imie, wiek i metody: wczytaj(), wypisz())
// oraz utworzone zostaną dwa obiekty klasy osoba: O1 i O2.
// Program ma realizować wczytywanie danych do pól i wypisywanie zawartości pól na ekranie.
// Dostęp do pól powinien być ograniczony — tylko poprzez metody.


package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Person Osoba1 = new Person();

        Osoba1.Wczytaj();
        Osoba1.Wypisz();
    }
}
