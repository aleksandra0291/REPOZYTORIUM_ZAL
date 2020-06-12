package com.company;
import java.util.Scanner;


public class Kwadrat extends Figura {

    @Override
    void ObliczPole() {
        super.ObliczPole();
        System.out.println("pole wynosi : " + boka*boka );
    }

    @Override
    void ObliczObwod() {
        super.ObliczObwod();
        System.out.println("Obwód wynosi : " + 4*boka);
    }
}