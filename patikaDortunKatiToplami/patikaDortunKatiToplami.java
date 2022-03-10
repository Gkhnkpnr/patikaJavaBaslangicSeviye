package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //Degiskenleri tanimladim.
        int number = 2;
        int sum = 0;

        //Kullanicidan deger almak icin Scanner sinifini olusturdum.
        Scanner input = new Scanner(System.in);

        //Girdigi sayi tek olana kadar kullanicidan deger almaya devam ettim ve bunlarin arasindan sayi cift ve 4 un kati olanlari kendi aralarinda topladim.
        do {
            System.out.print("Sayi Giriniz :");
            number = input.nextInt();
            if (number % 4 == 0){
                sum += number;
            }
        }while (number % 2 == 0);

        //Daha sonra alinan degerlerden sarti saglayanlari kendi arasinda toplayip ekrana yazdirdim.
        System.out.println("Cift ve 4'un kati olan sayilarin toplami : "+sum);
    }
}
