package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Eleman sayısını giriniz : ");
        int number=scanner.nextInt();
        int firstValue=0;
        int secondValue=1;
        int a=0,b=1;
        int result=0;
        System.out.print(firstValue+" "+secondValue+" ");
        for (int i = 2; i < number; i++) {
            result=a+b;
            System.out.print(result+" ");
            a=b;
            b=result;
        }
    }
}
