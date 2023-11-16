package org.example;

import java.util.Scanner;

public class Runner_IliskiselOperatorler {
    public static void main(String[] args) {
        System.out.println("İlk sayıyı giriniz");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("İkinci sayıyı giriniz");
        int y = sc.nextInt();
        boolean sonuc;
        sonuc = (x > y);
        System.out.println("x > y = " + sonuc);
        sonuc = (x < y);
        System.out.println("x < y = " + sonuc);
        sonuc = (x <= y);
        System.out.println("x <= y = " + sonuc);
        sonuc = (x >= y);
        System.out.println("x >= y = " + sonuc);
        sonuc = (x == y);
        System.out.println("x == y = " + sonuc);
        sonuc = (x != y);
        System.out.println("x != y = " + sonuc);

    }
}
