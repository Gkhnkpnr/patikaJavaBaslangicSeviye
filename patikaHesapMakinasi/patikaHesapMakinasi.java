package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number1, number2, select;

        Scanner input = new Scanner(System.in);

        System.out.print("Ilk Sayıyı Giriniz : ");
        number1 = input.nextInt();

        System.out.print("İkinci Sayıyı Giriniz : ");
        number2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiniz: ");
        select = input.nextInt();

        if (select == 1){
            System.out.println("Toplam : " + (number1 + number2));
        }else if(select == 2){
            System.out.println("Fark : " + (number1 - number2));
        }else if(select == 3){
            System.out.println("Çarpım : "+ (number1 * number2));
        }else if(select == 4){
            if (number2 != 0){
                System.out.println("Bölüm : "+ (number1 / number2));
            }else{
                System.out.println("Bir sayı 0'a bölünemez.");
            }
        }else{
            System.out.println("Yanlış seçim yaptınız. Tekrar Deneyiniz.");
        }



    }
}
