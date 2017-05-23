package com.company;

import java.util.Scanner;

/**
 * Created by KOMPAS on 5/23/2017.
 */
public class AstuntaUzd {
    private double a;
    private double b;
    private double km;
    ///private int suma;
    //private int skirtumas;

    // 1 paprasyti vartotojo ivesti skaicius
    public void pasisveikinimas() {
        System.out.println("Iveskite nuvaziuotus km ir kuro sanaudas");


    }

    // 2 nuskaityti zodi
    public void nuskaitymas() {
        Scanner skaneris = new Scanner(System.in);
        a = skaneris.nextDouble();
        b = skaneris.nextDouble();


    }

    public void apskaiciavimas(){

        double km =(b*100)/a;
    }


    public void spausdinimas1() {
        System.out.println("Automobilis nuvaziuoja: "  +km);


    }

   // public void spausdinimas2() {
     //   System.out.println("Skaiciu skirtumas: " + (a - b));
    //}


}


