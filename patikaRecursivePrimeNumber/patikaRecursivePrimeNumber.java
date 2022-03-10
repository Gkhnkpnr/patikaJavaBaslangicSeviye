package com.company;

import java.util.Scanner;

public class Main {
    static boolean isPrime(int number, int divider){
        if (number <= 2)
            return (number == 2) ? true : false;
        if (number % divider == 0)
            return false;
        if (divider * divider > number)
            return true;
        return isPrime(number, divider +1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi Giriniz : ");
        int n = input.nextInt();

        if (isPrime(n,2)){
            System.out.println(n + " ASAL Sayidir.");
        }else{
            System.out.println(n+" Asal Sayi Degildir.");
        }

    }
}
