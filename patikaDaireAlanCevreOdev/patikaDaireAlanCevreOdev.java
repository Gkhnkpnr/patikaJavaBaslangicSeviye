package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int yariCap, merkezAciOlcusu;
        double PI = 3.14;

        Scanner input = new Scanner(System.in);

        System.out.print("Daire`nin yari cap degerini giriniz : ");
        yariCap = input.nextInt();
        System.out.print("Istenilen daire diliminin aci olcusunu yaziniz : ");
        merkezAciOlcusu = input.nextInt();
        double alan = (PI*yariCap*yariCap);
        double cevre = (PI*2*yariCap);
        double sonuc = (PI*(yariCap * yariCap)* merkezAciOlcusu)/360;
        System.out.println("Yaricap degerini verdiginiz dairenin cevresi : " + cevre);
        System.out.println("Yaricap degerini verdiginiz dairenin alani : " + alan);
        System.out.println("Merkez Acisini ve Yaricap degerini verdiginiz Daire diliminin Alani : " + sonuc);


    }
}
