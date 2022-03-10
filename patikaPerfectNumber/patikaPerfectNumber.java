package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Degiskenleri tanimladim.
        int number,total=0;

        //Kullanicidan deger alabilmek icin Scanner sinifini olusturdum.
        Scanner input = new Scanner(System.in);

        //Kullanicidan degeri aldim.
        System.out.print("Lutfen bir sayi giriniz : ");
        number = input.nextInt();

        //For dongusu ile kullanicidan alinan sayiyi kalansiz bolen rakamlari kendi aralarinda topladim.
        for (int i = 1; i < number; i++){
            if (number % i == 0){
                total += i;
            }
        }
        //Kullanicidan gelen rakam ile onu tam bolen sayilarin toplamini karsilastirip mukemmel sayimi degilmi onu ekrana yazdirdim.
        if (total == number){
            System.out.println(number+" Mukemmel sayidir.");
        }else{
            System.out.println(number+" Mukemmel sayi degildir.");
        }
    }
}
