package com.company;

/**
 * Created by KOMPAS on 5/23/2017.
 */
import java.util.Scanner;

/**
 * Created by KOMPAS on 5/22/2017.
 */
public class AntraUzd {

    private int mase;
    private int ugis;
    private double kmi;



    // 1  paprasyti skaicius
    public void ivestiskaicius() {
        //2 nuskaityti varda
        System.out.println("Iveskite savo svori ir ugi");


    }


    public void nuskaitymas() {

        Scanner skaneris = new Scanner(System.in);
        mase = skaneris.nextInt();
        ugis = skaneris.nextInt();


    }

    public void apskaiciavimas(){

        double kmi = mase/(ugis)^2;
    }

    //isvedimas
    public void spausdinimas() {

        System.out.println("Jus KMI: " + kmi);


    }



}
