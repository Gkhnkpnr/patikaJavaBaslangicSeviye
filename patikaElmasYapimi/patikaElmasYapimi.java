package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Degiskenleri tanimladim.
        int level;

        //Kullanicidan deger alabilmek icin Scanner sinifini olusturdum.
        Scanner input = new Scanner(System.in);

        //Kullanicidan Degeri aldim.
        System.out.print("Lutfen Degeri Giriniz: ");
        level = input.nextInt();

        //For dongusu ile elmasin ust kismini olusturdum
        for (int i = 1; i <= level; i++){
            for (int k = 1; k <= (level - i); k++){
                System.out.print(" ");
            }

            for (int j = 1; j <= (2*i)-1; j++){
                System.out.print("*");
            }

            System.out.println();
        }
        //For dongusu ile elmasin alt kismini olusturdum.
        for (int a = 1; a < level; a++){
            for (int b=1; b <= a; b++){
                System.out.print(" ");
            }
            for (int c =1; c <= 2*(level-a)-1; c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
