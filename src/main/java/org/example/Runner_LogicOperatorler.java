package org.example;

import java.util.Scanner;

public class Runner_LogicOperatorler {
    public static void main(String[] args) {
        System.out.println("Eğer A sayısı 5 ten büyük ve B sayısı 10 dan küçük olursa, " +
                "Koşulumuz doğru değil ise Koşulumuz yanlış olucaktı");
        System.out.println("----------------------------------------------------------");
        System.out.println("A sayısını giriniz");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("B sayısını giriniz");
        int b = scanner.nextInt();
        String sonuc = (a > 5 && b < 10) ? ("Bu kosul doğrudur") : ("Bu kosul yanlıştır");
        System.out.println(sonuc);
        System.out.println("----------------------------------------------------------");
        System.out.println("Eğer A sayısı 5 ten büyük veya B sayısı 10 dan küçük olursa, " +
                "İkinci koşulumuz doğru değil ise İkinci koşulumuz yanlış olucaktı");
        System.out.println("----------------------------------------------------------");
        System.out.println("Yeni A sayısını giriniz");
        int ay = scanner.nextInt();
        System.out.println("Yeni B sayısını giriniz");
        int by = scanner.nextInt();
        System.out.println("Eğer A sayısı 5 ten büyük veya B sayısı 10 dan küçük olursa " +
                "İkinci koşulumuz doğru değil ise İkinci koşulumuz yanlış olucaktı");
        String sonuc2 = (ay > 5 || by < 10) ? ("İkinci koşulumuz doğrudur") : ("İkinci koşulumuz yanlıştır");
        System.out.println(sonuc2);

    }
}
