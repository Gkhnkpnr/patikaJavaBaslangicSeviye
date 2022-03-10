package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double armutFiyat = 2.14, elmaFiyat= 3.67, domatesFiyat= 1.11, muzFiyat = 0.95, patlicanFiyat = 5.00;
        int armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo;


        Scanner input = new Scanner(System.in);

        System.out.print("Kac Kilo Armut Aldiniz : ");
        armutKilo = input.nextInt();
        System.out.print("Kac Kilo Elma Aldiniz : ");
        elmaKilo = input.nextInt();
        System.out.print("Kac Kilo Domates Aldiniz : ");
        domatesKilo = input.nextInt();
        System.out.print("Kac Kilo Muz Aldiniz : ");
        muzKilo = input.nextInt();
        System.out.print("Kac Kilo Patlican Aldiniz : ");
        patlicanKilo = input.nextInt();
        double toplamTutar = (armutFiyat * armutKilo) + (elmaFiyat*elmaKilo) + (domatesFiyat*domatesKilo)+(muzFiyat*muzKilo)+(patlicanFiyat*patlicanKilo);
        System.out.println("Toplam Tutar : " + toplamTutar +" TL");


    }
}
