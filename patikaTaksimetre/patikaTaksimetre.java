package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int distance;
        double perKm = 2.20, total,startPrice = 10;

        Scanner input = new Scanner(System.in);
        System.out.print("Km cinsinden mesafenizi giriniz : ");
        distance = input.nextInt();

        total = (perKm * distance);
        total += startPrice;

        total = (total < 20) ? 20 : total;

        System.out.println("Toplam tutar : " + total);



    }
}
