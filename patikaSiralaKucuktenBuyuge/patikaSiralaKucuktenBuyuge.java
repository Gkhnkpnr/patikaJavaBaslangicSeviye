package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Degiskenler Olusturuldu
        int a,b,c;
        //Scanner sinifi icin bir instance olusturuldu.
        Scanner input = new Scanner(System.in);
        //Kullanicidan karsilastirma yapmak uzere 3 deger alindi.
        System.out.print("1. Sayiyi Giriniz :");
        a = input.nextInt();
        System.out.print("2. Sayiyi Giriniz :");
        b = input.nextInt();
        System.out.print("3. Sayiyi Giriniz :");
        c = input.nextInt();
        //Kullancicidan alinan 3 deger birbirleri arasinda karsilastirilarak ekrana cikti verildi.
        if ((a>b) && (a>c)){
            if (b>c){
                System.out.println("c<b<a");
            }else{
                System.out.println("b<c<a");
            }
        }else if ((b>a) && (b>c)){
            if (a>c){
                System.out.println("c<a<b");
            }else {
                System.out.println("a<c<b");
            }
        }else{
            if (b>a){
                System.out.println("a<b<c");
            }else{
                System.out.println("b<a<c");
            }
        }
    }
}
