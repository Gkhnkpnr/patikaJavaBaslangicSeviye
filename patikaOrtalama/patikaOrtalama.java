package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //Degiskenleri tanimladim.
        int number,sum=0,count=0,average;

        //Kullanicidan deger almak icin Scanner sinifini olusturdum.
        Scanner input = new Scanner(System.in);

        //Kullanicidan degeri aldim.
        System.out.print("Lutfen sayiyi giriniz: ");
        number = input.nextInt();

        //Kullanidan aldigimiz degere kadar olan sayilardan 3'un ve 4'un kati olanlari ve kactane olduklarini buldun.
        for (int i = 1; i<number; i++){
            if (i % 3 == 0 && i%4 ==0){
                sum += i;
                count++;
            }
        }

        //Donguden sonra sayilarin kendi aralarinda toplamini ve kac adet olduklarini biliyoruz ortalama degeri ekrana bastiralim.
        average = sum / count;
        System.out.println("3'e ve 4'e Tam Bolunen Sayilarin Ortalamasi : " +average);
    }
}
