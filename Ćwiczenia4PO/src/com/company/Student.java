package com.company;
import java.util.Scanner;

public class Student extends Person
{
    String kierunek;
    int rok;

    void infostudent()
    {
        wczytajPerson();
    Scanner scan = new Scanner(System.in);
    System.out.println("Podaj kierunek studiów");
    kierunek = scan.nextLine();
    System.out.println("Podaj rok studiów");
    rok= scan.nextInt();
    }
    void PodajKierunek()
    {
    System.out.println("Twój kierunek to :" + kierunek);
    }
    void wyswietlStudent()
    {
        System.out.println("Informacje o studencie : \n");
        wyswietlPerson();
        System.out.println("kierunek studiów to: "+ kierunek + "\n" + "\n" + "rok studiów :" + rok);
    }
}
