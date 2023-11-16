package org.example;

import java.util.Scanner;

public class Runner_AtamaOperatorleri {
    public static void main(String[] args) {

        int x =50,y=20;
        System.out.println("X değerimiz 50 olsun");
        System.out.println("+= Soldakine sağdakini ekler, sonucu soldakine atar");
        System.out.println("Sayı+=10 dediğimizde yeni sayı değeri "+ (x+=10));
        x-=10;
        System.out.println("----------------------------------------------------");
        System.out.println("-= Soldakinden sağdakini çıkarır, sonucu soldakine atar");
        System.out.println("Sayı-=10 dediğiğm zaman yeni sayı değeri "+(x-=10));
        x+=10;
        System.out.println("----------------------------------------------------");
        System.out.println("*= Soldakini sağdaki ile çarpar, sonucu soldakine atar");
        System.out.println("Sayı*=10 dediğimiz zaman yeni sayı değeri "+ (x*=10));
        x/=10;
        System.out.println("----------------------------------------------------");
        System.out.println("/= Soldakini sağdakine böler, sonucu soldakine atar");
        System.out.println("Sayı/=10 dediğimiz zaman yeni sayı değeri "+ (x/=10));
        x*=10;
        System.out.println("----------------------------------------------------");
        System.out.println("%= Soldaki ile sağdakinin modula işleminin sonucunu soldakine atar");
        System.out.println("Sayı%=10 dediğimiz zaman yeni sayı değeri "+ (x%=10));
        System.out.println("----------------------------------------------------");
        System.out.println("= Sağdaki değeri soldaki değişkene atar.");
        System.out.println("İkinci sayı değerimiz 20 olsun ve sayı1 = sayı 2 diyelim "+(x=y));
        System.out.println("Yeni sayı değerimiz "+x );


    }
}
