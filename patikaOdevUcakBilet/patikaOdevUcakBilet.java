package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //Kullanicidan alinacak degerler icin degiskenler tanimlandi.
        int distance, age, typeOfFlight;
        double discountRateForTypeOfFlight =1,discountRateForAge=1,totalPrice = 0;

        //Kullanicidan verileri almak icin Scanner sinifi projeye dahil edildi.
        Scanner input = new Scanner(System.in);

        //Kullanicidan mesafe degere alindi.
        System.out.print("Mesafeyi km turunden giriniz : ");
        distance = input.nextInt();

        //Kullanicidan yas degeri alindi.
        System.out.print("Yasinizi giriniz : ");
        age = input.nextInt();

        //Kullanicidan yolculuk tipi degeri alindi.
        System.out.print("Yolculuk tipini giriniz (1=> Tek Yon , 2=> Gidis Donus ) : ");
        typeOfFlight = input.nextInt();

        //Gerekli karsilastirmalar yapildi.
        if ((distance > 0 && age > 0) && (typeOfFlight == 1 || typeOfFlight == 2)){
            //Yasina gore indirim orani atandi.
            if (age < 12){
                discountRateForAge = 0.5;
            }else if (age > 12 && age < 24){
                discountRateForAge = 0.9;
            }else if (age > 65){
                discountRateForAge = 0.7;
            }else{
                discountRateForAge = 1;
            }
            //Yolculuk tipine gore indirim tanimlandi.
            if (typeOfFlight == 2){
                discountRateForTypeOfFlight = 0.8;
                totalPrice = (0.1 * distance * discountRateForAge * discountRateForTypeOfFlight) *2;
            }else{
                discountRateForTypeOfFlight =1;
                totalPrice = 0.1 * distance * discountRateForAge * discountRateForTypeOfFlight;
            }
        }else{
            System.out.println("Hatali Veri Girdiniz !");
        }

        //Indirimleri uygulayip toplam tutari yazdirdim.
        System.out.println("Toplam Tutar = "+totalPrice +" TL");
    }
}
