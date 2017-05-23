package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
	// write your code here

        Scanner skaneris = new Scanner(System.in);
        System.out.println("Parasykite kokia rinksites is penkiu programu");
        int numeris  = skaneris.nextInt();

        switch(numeris){
            case 1:

               // public static void main(String[] args){
                // write your code here
               PirmaUzda objektas1 = new com.company.PirmaUzda();
               objektas1.pasisveikinimas();
               objektas1.nuskaitymas();
               objektas1.spausdinimas();
                //break;
                break;
            //}
            case 2:

               // public static void main(String[] args) {
                // write your code here
                AntraUzd objektas2 = new AntraUzd();
                objektas2.ivestiskaicius();
                objektas2.nuskaitymas();
                objektas2.apskaiciavimas();
                objektas2.spausdinimas();
                break;
            //}



            case 3:
                //public static void main(String[] args) {
                // write your code here
                TreciaUzd objektas3 = new TreciaUzd();
                objektas3.pasisveikinimas();
                objektas3.nuskaitymas();
                objektas3.spausdinimas1();
                objektas3.spausdinimas2();
                break;
            //}



            case 4:
               // public static void main(String[] args) {
                // write your code here
                KetvirUzd objektas4 = new KetvirUzd();
                objektas4.pasisveikinimas();
                objektas4.nuskaitymas();
                objektas4.spausdinimas();
                break;
            //}

            case 5:
                AstuntaUzd objektas5 = new AstuntaUzd();
                objektas5.pasisveikinimas();
                objektas5.nuskaitymas();
                objektas5.apskaiciavimas();
                objektas5.spausdinimas1();






        }
    }
}
