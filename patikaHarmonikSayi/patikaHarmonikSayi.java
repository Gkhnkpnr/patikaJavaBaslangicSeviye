package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Degiskenleri tanimladim.
        int number;
        double total = 0;

        //Kullanicidan deger alabilmek icin Scanner sinifini olusturdum.
        Scanner input = new Scanner(System.in);

        //Kullanicidan degeri aldim.
        System.out.print("Lutfen Sayiyi Giriniz: ");
        number = input.nextInt();

        //For dongusu ile harmonik seri hesabini yaptirdim.
        for (double i = 1; i <= number; i++){
            total += 1/i;
        }

        //Islem sonucu cikan degeri ekrana yazdirdim.
        System.out.println("Harmonik Seri Degeri : " + total);

    }
}
