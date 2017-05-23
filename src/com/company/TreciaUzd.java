package com.company;

import java.util.Scanner;

/**
 * Created by Kompas on 2017-05-22.
 */
public class TreciaUzd {

    private int a;
    private int b;
    private int suma;
    private int skirtumas;

    // 1 paprasyti vartotojo ivesti skaicius
    public void pasisveikinimas() {
        System.out.println("Iveskite du skaicius");


    }

    // 2 nuskaityti zodi
    public void nuskaitymas() {
        Scanner skaneris = new Scanner(System.in);
        a = skaneris.nextInt();
        b = skaneris.nextInt();


    }


    public void spausdinimas1() {
        System.out.println("Skaiciu suma: " + (a + b));


    }

    public void spausdinimas2() {
        System.out.println("Skaiciu skirtumas: " + (a - b));
    }


}
