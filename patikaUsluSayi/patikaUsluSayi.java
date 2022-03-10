package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Degiskenleri tanimladim.
        int n,k,total=1;

        //Kullanicidan deger alabilmek icin Scanner sinifi dahil ettim.
        Scanner input = new Scanner(System.in);

        //Kullanicidan degerleri aldim.
        System.out.print("Ussu alinacak sayiyi giriniz: ");
        n = input.nextInt();
        System.out.print("Us olacak sayiyi giriniz: ");
        k= input.nextInt();

        //Ust alma islemini for dongusu ile olusturdum.
        for (int i =1; i<=k; i++){
            total = total *n;
        }

        //Buldugum ifadeyi ekrana yazdirdim.
        System.out.println(n + " Uzeri " + k + " : "+total);
    }
}
