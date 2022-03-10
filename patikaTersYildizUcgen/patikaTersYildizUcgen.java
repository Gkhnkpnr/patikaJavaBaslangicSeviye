package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //Degiskenleri tanimladim.
        int number;

        //Kullanicidan deger alabilmek icin Scanner sinifi olusturdum.
        Scanner input = new Scanner(System.in);

        //Kullanicidan Basamak degerini aldim.
        System.out.print("Lutfen Bir Sayi Giriniz : ");
        number = input.nextInt();

        for (int i = 1; i <= number; i++){
            for (int j = 1; j<=i;j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*(number-i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
