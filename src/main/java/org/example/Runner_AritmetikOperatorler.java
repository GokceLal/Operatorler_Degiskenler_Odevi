package org.example;

import java.util.Scanner;
public class Runner_AritmetikOperatorler {
    public static void main(String[] args) {

        int toplam=0,carp=1,cikart=0;
        double bol=0,mod=0;
        System.out.println("Büyük olan sayıyı giriniz");
        Scanner sc = new Scanner(System.in);
        int sayi1=sc.nextInt();
        System.out.println("Küçük olan sayıyı giriniz");
        int sayi2= sc.nextInt();
        toplam=sayi1+sayi2;
        System.out.println("İki sayının toplamı :"+toplam);
        carp=sayi1*sayi2;
        System.out.println("İki sayının çarpımı :"+carp);
        cikart=sayi1-sayi2;
        System.out.println("İki sayının çıkartması :"+cikart);
        bol= (double) sayi1 /sayi2;
        System.out.println("İki sayının bölümü :"+bol);
        mod=sayi1%sayi2;
        System.out.println("İki sayının modu :"+mod);





    }
}