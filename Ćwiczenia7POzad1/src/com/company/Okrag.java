package com.company;
import java.util.Scanner;


public class Okrag extends Kwadrat {

    @Override
    void ObliczPole(){
        super.ObliczPole();
        System.out.println( "pole koła wynosi : " + Math.PI * Math.pow(promien, 2));
    }

    @Override
    void ObliczObwod(){
        super.ObliczObwod();
        System.out.println("Obwód koła wynosi : " + 2*Math.PI * promien);

}}