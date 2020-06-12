package com.company;

import java.sql.SQLOutput;
import java.util.*;
public class Obliczenia {

    public void Wywołaj(){
    int ilosc_liczb=5, i=1;
    double liczba, suma=0, min, max;
    long start= System.nanoTime();


    System.out.println("Program losuje" + ilosc_liczb + "liczb całkowitych od 0 do 99");
    System.out.println("a następnie znajduje najmniejszą i największą");
    System.out.println("oraz oblicza średnią ze wszystkich wylosowanych liczb.");

    Random r = new Random();
    min =Math.round(100*(r.nextDouble()));
    System.out.println();
    System.out.println("Wylosowano liczby: " + min );
    max = min ;
    suma= suma+max;

    do {
        liczba = Math.round(100*(r.nextDouble()));
        System.out.println(liczba);

        if (max<liczba) max =liczba;
        if (liczba<min) min =liczba;

        suma=suma+liczba;
        i++;
    }
    while (i<= ilosc_liczb-1);
    System.out.println();
    System.out.println("największa liczba to " + max);
    System.out.println("najmniejsza liczba to " + min);
    System.out.println("średnia = " + suma/ilosc_liczb);
    long stop= System.nanoTime();
    System.out.println("Czas wykonania [w nanosekundach] :" + (stop-start));





}
}
