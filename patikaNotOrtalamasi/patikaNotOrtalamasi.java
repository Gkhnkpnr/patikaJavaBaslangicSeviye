package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Not degiskenlerimizi tanimlayalim.
        int matematikNotu, fizikNotu, kimyaNotu, turkceNotu, tarihNotu, muzikNotu;

        //Scanner sinifini dahil edelim.
        Scanner input = new Scanner(System.in);

        //Notlari belirlemek icin kullanicidan deger alalim
        System.out.print("Matematik Notunuz : ");
        matematikNotu = input.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizikNotu = input.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimyaNotu = input.nextInt();

        System.out.print("Turkce Notunuz : ");
        turkceNotu = input.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarihNotu = input.nextInt();

        System.out.print("Muzik Notunuz : ");
        muzikNotu = input.nextInt();

        int toplam = matematikNotu + fizikNotu + kimyaNotu + turkceNotu + tarihNotu + muzikNotu;
        double sonuc = toplam / 6.0;
        System.out.println("Not Ortalamaniz : " + sonuc);

        String str = (sonuc > 60) ? "Gectiniz" : "Kaldiniz";
        System.out.println(str);


    }
}
