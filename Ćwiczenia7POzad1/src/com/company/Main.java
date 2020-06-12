package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wybierz odpowiednią figurę ");

        int figura=4;
        switch (figura) {
            case 1:
                Kwadrat kwadrat = new Kwadrat();
                kwadrat.ObliczPole();
                kwadrat.ObliczObwod();
            case 2:
                Trojkat trojkat = new Trojkat();
                trojkat.ObliczPole();
                trojkat.ObliczObwod();
            case 3:
                Okrag okrag = new Okrag();
                okrag.ObliczPole();
                okrag.ObliczObwod();
            case 4 :
                Prostokat prostokat = new Prostokat();
                prostokat.ObliczPole();
                prostokat.ObliczObwod();




        }
       }
}

