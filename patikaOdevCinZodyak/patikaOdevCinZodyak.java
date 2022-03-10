package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Kullanicidan alinacak veriler icin degiskenler tanimlandi.
	    int birthYear = 0, numberOfZodiac;
        //Kullanicidan veri alabilmek icin Scanner sinifi projeye dahil edilmistir.
        Scanner input = new Scanner(System.in);
        //Kullanicidan veri alindi.
        System.out.print("Dogum Yilinizi Giriniz : ");
        birthYear = input.nextInt();
        numberOfZodiac = birthYear % 12;

        //Switch Case ile burcu buluyoruz.
        switch (numberOfZodiac){
            case 0:
                System.out.println("Cin Zodyak Burcunuz : Maymun");
                break;
            case 1:
                System.out.println("Cin Zodyak Burcunuz : Horoz");
                break;
            case 2:
                System.out.println("Cin Zodyak Burcunuz : Kopek");
                break;
            case 3:
                System.out.println("Cin Zodyak Burcunuz : Domuz");
                break;
            case 4:
                System.out.println("Cin Zodyak Burcunuz : Fare");
                break;
            case 5:
                System.out.println("Cin Zodyak Burcunuz : Okuz");
                break;
            case 6:
                System.out.println("Cin Zodyak Burcunuz : Kaplan");
                break;
            case 7:
                System.out.println("Cin Zodyak Burcunuz : Tavsan");
                break;
            case 8:
                System.out.println("Cin Zodyak Burcunuz : Ejderha");
                break;
            case 9:
                System.out.println("Cin Zodyak Burcunuz : Yilan");
                break;
            case 10:
                System.out.println("Cin Zodyak Burcunuz : At");
                break;
            case 11:
                System.out.println("Cin Zodyak Burcunuz : Koyun");
                break;
            default:
                System.out.println("Hata ile karsilastik Lutfen Tekrar Deneyiniz.");
        }
    }
}
