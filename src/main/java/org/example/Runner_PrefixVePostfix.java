package org.example;

import java.util.Scanner;

public class Runner_PrefixVePostfix {
    public static void main(String[] args) {
        System.out.println("Lütfen bir sayı giriniz");
        Scanner sc = new Scanner(System.in);
        int sayi = sc.nextInt();
        System.out.println("Sayı = " + sayi +
                " sayı ++ yapınca yeni sayı değeri = " + sayi++
                + " bir sonraki işlemde görünen sayı değeri =" + sayi);
        sayi--;
        System.out.println("---------------------------------------------------------");
        System.out.println("Sayı = " + sayi +
                " sayı-- yapınca yeni sayı değeri = " + sayi--
                + " bir sonraki işlemde görünen sayı değeri = " + sayi);
        sayi++;
        System.out.println("---------------------------------------------------------");
        System.out.println("Sayı = " + sayi +
                " ++sayı  yapınca yeni sayı değeri = " + ++sayi
                + " bir sonraki işlemde görünen sayı değeri = " + sayi);
        sayi--;
        System.out.println("---------------------------------------------------------");
        System.out.println("Sayı = " + sayi +
                " --sayı yapınca yeni sayı degeri = " + --sayi
                + " bir sonraki işlemde görünen sayı değeri = " + sayi);
        sayi++;


    }

}
