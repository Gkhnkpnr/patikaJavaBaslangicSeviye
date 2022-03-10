package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Degiskenleri tanimladim.
        int number1, number2;
        int ebob =1,ekok=1;

        //Kullanicidan degerleri almak icin Scanner sinifini kullandim.
        Scanner input = new Scanner(System.in);

        //Kullanicidan degerleri aldim.
        System.out.print("Lutfen 1. Degeri Giriniz : ");
        number1 = input.nextInt();
        System.out.print("Lutfen 2. Degeri Giriniz : ");
        number2 = input.nextInt();

        //Ebob degerini Bulmak icin while dongusunu kullandim.
        int i =1;
        if (number1 < number2){
            while(i <= number1){
                if (number1 % i == 0 && number2 % i ==0){
                    ebob = i;
                }
                i ++;
            }
        }else{
            while(i <= number2){
                if (number1 % i == 0 && number2 % i ==0){
                    ebob = i;
                }
                i ++;
            }
        }

        int k = 1;

        //Verilen degerlerin Ekok degerini bulmak icin while dongusu kullandim
        while(k <= (number1 * number2)){
            if (k % number1 == 0 && k % number2 == 0){
                ekok = k;
                break;
            }
            k++;
        }


        //Ebob ve Ekok degerlerini ekrana yazdirdim.
        System.out.println("Sayilarin EBOB Degeri : "+ebob);
        System.out.println("Sayilarin EKOK Degeri : "+ekok);


    }
}
