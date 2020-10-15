package com.company;

import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    private static double wynik(int x, int y){
        return (Math.pow(x,y)%10);
    }

    private static String formatuj(double a){
        if(a == (long) a)
            return String.format("%d",(long)a);
        else
            return String.format("%s",a);
    }
    public static void main(String[] args) throws IOException {
        Scanner wejscie = new Scanner(System.in);
        int ilosc_prob;
        ilosc_prob = wejscie.nextInt();
        if (ilosc_prob < 1 || ilosc_prob > 10) {
            wejscie.close();
            System.exit(1);
        }
        int a,b;
        for (int i = 0; i < ilosc_prob; i++) {
            a = wejscie.nextInt();
            b = wejscie.nextInt();
            if (a < 1 || b > 1000000000) System.exit(1);
            System.out.println(formatuj(wynik(a,b)));

        }

    }
}
