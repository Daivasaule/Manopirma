package com.company;

import java.util.Scanner;

/**
 * Created by Kompas on 2017-05-22.
 */
public class PirmaUzda {
    private String vardas;

    // 1 paprasyti vartotojo ivesti varda
    public void pasisveikinimas() {
        System.out.println("Iveskite vartotoja varda");
    }

    // 2 nuskaityti vartotojo varda
    public void nuskaitymas() {
        Scanner skaneris = new Scanner(System.in);
        vardas = skaneris.nextLine();
    }

    // 3 atspausdinti ji 5 kartus
    public void spausdinimas() {
        for (int i = 0; i < 5; i++) {
            System.out.println(vardas);

        }

    }
}

