package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Degiskenler olusturuldu
        int number;

        //Kullanicidan sinirlayici degeri almak icin Scanner sinifi olusturuldu.
        Scanner input = new Scanner(System.in);

        //Kullanicidan sinirlayici deger alindi.
        System.out.print("Lutfen Sinirlayici Degeri Giriniz : ");
        number = input.nextInt();

        //Kullanicidan alinan sinirlayici degeri asmayacak sekilde 4'un kuvvetlerini ekrana yazdirildi.
        for (int i = 1; i<number; i*=4){
            System.out.println(i);
        }

        //Kullanicidan alinan sinirlayici degeri asmayacak sekilde 5'in kuvvetlerini ekrana yazdirildi.
        for (int j =1; j<number; j*=5){
            System.out.println(j);
        }

    }
}
