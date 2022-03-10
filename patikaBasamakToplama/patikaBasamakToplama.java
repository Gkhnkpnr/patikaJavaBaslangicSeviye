package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Degiskenleri tanimladim.
        int number;
        int basNumber= 0;
        int basValue;
        int basSum = 0;

        //Kullanicidan deger almak icin Scanner sinifini olusturdum.
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen Sayiyi Giriniz : ");
        number = input.nextInt();
        int tempNumber = number;

        //Verilen sayinin basamak degerini ogrendim.
        while(tempNumber != 0){
            tempNumber /= 10;
            basNumber++;
        }

        //Sayinin basamaklarindaki sayilarin degerlerini ogrendim ve birbirleri ile topladim.
        tempNumber =number;
        for (int i = 1; i <= basNumber; i++){
            basValue = tempNumber % 10;
            basSum = basSum + basValue;
            tempNumber /= 10;
        }

        //Donguden cikan basamak degerlerinin toplami sonucunu ekrana yazdirdim.
        System.out.println("Verilen Sayinin Basamaklari toplami : " + basSum);
    }
}
