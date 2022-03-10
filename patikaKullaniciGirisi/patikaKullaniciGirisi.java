package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String userName ,password ,resetPassword ,newPassword;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanici Adiniz : ");
        userName = input.nextLine();

        if (userName.equals("patika")){
            System.out.print("Sifrenizi Giriniz : ");
            password = input.nextLine();
            if (password.equals("java123")){
                System.out.println("Giris yaptiniz!!");
            }else{
                System.out.print("Sifreniz Hatali Yeni Sifre Olusturmak Istermisiniz(evet/hayir) : ");
                resetPassword = input.nextLine();
                if (resetPassword.equals("evet")){
                    System.out.print("Yeni Sifrenizi yaziniz :");
                    newPassword = input.nextLine();
                    if (newPassword.equals("java123")){
                        System.out.println("Sifre Olusturulamadi Tekrar deneyiniz.");
                    }else{
                        System.out.println("Yeni Sifre Basarili Bir Sekilde Olusturuldu.");
                    }
                }else{
                    System.out.println("Sifre Olusturulamadi.");
                }
            }
        }else{
            System.out.println("Kullanici isminiz hatali lutfen daha sonra tekrar deneyiniz.");
        }




    }
}
