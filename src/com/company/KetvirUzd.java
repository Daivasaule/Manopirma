package com.company;

import java.util.Scanner;

/**
 * Created by KOMPAS on 5/23/2017.
 */
public class KetvirUzd {


        private String zodis;

        // 1 paprasyti vartotojo ivesti zodi
        public void pasisveikinimas() {
            System.out.println("Iveskite zodi");
        }

        // 2 nuskaityti zodi
        public void nuskaitymas() {
            Scanner skaneris = new Scanner(System.in);
            zodis = skaneris.nextLine();
        }

        // 3 atspausdinti kiek simboliu tame zodyje
        public void spausdinimas() {
            System.out.println(zodis.length());

        }

    }
