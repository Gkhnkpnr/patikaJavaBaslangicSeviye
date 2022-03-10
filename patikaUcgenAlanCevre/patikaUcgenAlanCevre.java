package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double aKenari, bKenari, cKenari, uDegeri, alan;
        Scanner input = new Scanner(System.in);

        System.out.print("a Kenari uzunlugunu giriniz : ");
        aKenari = input.nextDouble();

        System.out.print("b Kenari uzunlugunu giriniz : ");
        bKenari = input.nextDouble();

        System.out.print("c Kenari uzunlugunu giriniz : ");
        cKenari = input.nextDouble();

        uDegeri = (aKenari + bKenari + cKenari) / 2;

        alan = Math.sqrt(uDegeri*(uDegeri - aKenari)*(uDegeri-bKenari)*(uDegeri-cKenari));

        System.out.println("Girdiginiz kenar uzunluklarina gore Ucgenin alani : " + alan);

    }
}
