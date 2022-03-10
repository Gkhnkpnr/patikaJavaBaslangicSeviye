package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int temperature;

        Scanner input = new Scanner(System.in);
        System.out.print("Sicakligi Giriniz : ");
        temperature = input.nextInt();

        if (temperature < 5){
            System.out.println("Kayaga Gidebilirsiniz");
        }else if (temperature >= 5 && temperature <= 25){
            if (temperature <= 15){
                System.out.println("Sinemaya Gidebilirsiniz");
            }
            if (temperature>=10){
                System.out.println("Piknige Gidebilirsiniz");
            }
        }else{
            System.out.println("Yuzmeye Gidebilirsiniz.");
        }

    }
}
