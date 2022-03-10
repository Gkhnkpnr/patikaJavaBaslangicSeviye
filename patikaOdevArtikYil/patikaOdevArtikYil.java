package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //Kullanicidan alinacak yil degeri icin degisken tanimlandi.
        int year;

        //Kullanicidan degeri alabilmek icin Scanner sinifi projeye dahil edildi.
        Scanner input = new Scanner(System.in);

        //Kullanicidan deger alindi.
        System.out.print("Yili Giriniz : ");
        year = input.nextInt();

        //Kullanicidan alinan deger icin gerekli karsilastirmalar yapildi.
        if (year % 4 == 0 && year % 400 ==0){
            System.out.println(year +" bir artik yildir.");
        }else{
            System.out.println(year +" bir artik yil degildir.");
        }
    }
}
