package com.company;

import java.util.Scanner;

public class Main {
    static void f(int n,int temp,boolean status) {
        System.out.print(" "+temp);
        if (temp <= 0){
            status =false;
        }
        int next = status ? temp-5 : temp+5;
        if (next <=n){
            f(n,next,status);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi Giriniz : ");
        int n = input.nextInt();
        f(n,n,true);
    }
}
