package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int matematikNotu = 0, fizikNotu = 0, turkceNotu = 0, kimyaNotu = 0, muzikNotu = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz Giriniz : ");
        matematikNotu = input.nextInt();
        if (matematikNotu > 0 && matematikNotu <101){
            System.out.print("Fizik Notunuz Giriniz : ");
            fizikNotu = input.nextInt();
            if (fizikNotu > 0 && fizikNotu < 101){
                System.out.print("Turkce Notunuz Giriniz : ");
                turkceNotu = input.nextInt();
                if (turkceNotu > 0 && turkceNotu < 101){
                    System.out.print("Kimya Notunuz Giriniz : ");
                    kimyaNotu = input.nextInt();
                    if (kimyaNotu > 0 && kimyaNotu < 101){
                        System.out.print("Muzik Notunuz Giriniz : ");
                        muzikNotu = input.nextInt();
                    }else{
                        System.out.println("Lutfen Gecerli Not Giriniz!!!");
                    }
                }else{
                    System.out.println("Lutfen Gecerli Not Giriniz!!!");
                }
            }else{
                System.out.println("Lutfen Gecerli Not Giriniz!!!");
            }
        }else{
            System.out.println("Lutfen Gecerli Not Giriniz!!!");
        }

        double average = (matematikNotu + fizikNotu + kimyaNotu + turkceNotu + muzikNotu) / 5;

        if (average >= 55){
            System.out.println("Tebrikler Sinifi Gectiniz");
        }else{
            System.out.println("Sinifta Kaldiniz Seneye Gorusmek Uzere");
        }
    }
}
