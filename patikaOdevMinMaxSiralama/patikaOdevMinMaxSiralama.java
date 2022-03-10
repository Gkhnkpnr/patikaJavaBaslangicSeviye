package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //Degiskenleri tanimladim.
        int number,count,maxNumber=0,minNumber=0;

        //Kullanicidan deger alabilmek icin Scanner sinifini olusturdum.
        Scanner input = new Scanner(System.in);

        //Kullanicidan kac adet sayi girecegi bilgisini aldim.
        System.out.print("Kac adet rakam gireceksiniz : ");
        count = input.nextInt();

        //For dongusu ile degerleri aldim ve siraladim.
        for (int i = 1; i <=count; i++){
            System.out.print(i +" . sayiyi giriniz : ");
            number = input.nextInt();
            if (number > maxNumber){
                maxNumber=number;
            }else if (number < minNumber || number > 0){
                minNumber = number;
            }
        }

        //Elde ettigim minNumber ve maxNumber degerlerini ekrana yazdirdim.
        System.out.println("Girilen En Buyuk Sayi : "+ maxNumber);
        System.out.println("Girilen En Kucuk Sayi : "+ minNumber);
    }
}
