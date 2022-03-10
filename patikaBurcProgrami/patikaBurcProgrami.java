package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //Program icin kullanacagimiz degiskenleri tanimladik.
        int day,month;
        String zodiac = null;
        boolean isError=false;
        //Scanner sinifi programa dahil edildi ve bir instance olusturuldu.
        Scanner input = new Scanner(System.in);
        //Karsilastirma yapabilmek icin kullanicidan degerleri aldik.
        System.out.print("Dogdugunuz ayi giriniz : ");
        month = input.nextInt();
        System.out.print("Dogdugunuz gunu giriniz : ");
        day =input.nextInt();
        //Girilen verilere gore karsilastirmalarini yaptik
        if (month >= 1 && month <= 12){
            if (month == 1){
                if (day >= 1 && day <= 31){
                    if (day > 21){
                        zodiac = "Kova";
                    }else{
                        zodiac = "Oglak";
                    }
                }else{
                    isError = true;
                }
            }else if(month == 2){
                if (day >= 1 && day <= 28) {
                    if (day > 19) {
                        zodiac = "Balik";
                    } else {
                        zodiac = "Kova";
                    }
                }else{
                    isError = true;
                }
            }else if (month == 3){
                if (day >= 1 && day <= 31){
                    if (day > 20){
                        zodiac = "Koc";
                    }else{
                        zodiac = "Balik";
                    }
                }else{
                    isError =true;
                }
            }else if (month == 4){
                if (day >= 1 && day <= 30){
                    if (day > 20){
                        zodiac = "Boga";
                    }else{
                        zodiac = "Koc";
                    }
                }else {
                    isError = true;
                }
            }else if (month == 5){
                if (day >= 1 && day <= 31){
                    if (day > 21){
                        zodiac = "Ikizler";
                    }else{
                        zodiac = "Boga";
                    }
                }else{
                    isError = true;
                }
            }else if (month == 6){
                if (day >= 1 && day <= 30){
                    if (day > 22){
                        zodiac = "Yengec";
                    }else{
                        zodiac = "Ikizler";
                    }
                }else{
                    isError = true;
                }
            }else if (month == 7){
                if (day >= 1 && day <= 31){
                    if (day > 22){
                        zodiac = "Aslan";
                    }else{
                        zodiac = "Yengec";
                    }
                }else{
                    isError = true;
                }
            }else if (month == 8){
                if (day >= 1 && day <= 31){
                    if (day > 22){
                        zodiac = "Basak";
                    }else{
                        zodiac = "Aslan";
                    }
                }else{
                    isError = true;
                }
            }else if (month == 9){
                if (day >= 1 && day <= 30){
                    if (day > 22){
                        zodiac = "Terazi";
                    }else{
                        zodiac = "Basak";
                    }
                }else{
                    isError = true;
                }
            }else if (month == 10){
                if (day >= 1 && day <= 31){
                    if (day > 22){
                        zodiac = "Akrep";
                    }else{
                        zodiac = "Terazi";
                    }
                }else{
                    isError = true;
                }
            }else if (month == 11){
                if (day >= 1 && day <= 30){
                    if (day > 21){
                        zodiac = "Yay";
                    }else{
                        zodiac = "Akrep";
                    }
                }else{
                    isError = true;
                }
            }else{
                if (day >= 1 && day <= 31){
                    if (day > 21){
                        zodiac = "Oglak";
                    }else{
                        zodiac = "Yay";
                    }
                }else{
                    isError = true;
                }
            }
        }else{
            isError = true;
        }
        //Kullanici degerleri dogru verdiyse eger burcunu gosterir dogru vermediyse hata mesaji gonderir.
        if (isError){
            System.out.println("Girdiginiz deger hatalidir.");
        }else{
            System.out.println("Burcunuz :" + zodiac);
        }
    }
}
