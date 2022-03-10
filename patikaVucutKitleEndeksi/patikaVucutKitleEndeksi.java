package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int kilo;
        double boy, vucutKitleIndeksi;

        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen Boyunuzu (Metre Cinsinden) Giriniz : ");
        boy = input.nextDouble();
        System.out.print("Lutfen Kilonuzu Giriniz: ");
        kilo = input.nextInt();

        vucutKitleIndeksi = kilo / boy * boy;
        System.out.println("Vucut Kutle Indeksiniz : " + vucutKitleIndeksi);

    }
}
