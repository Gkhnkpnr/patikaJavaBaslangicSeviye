package com.company;

import java.util.Scanner;

public class Main {
    static int power (int n1, int n2){
        if (n2 == 0){
            return 1;
        }else {
            int result = n1*power(n1, n2-1);
            return result;
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            System.out.print("Taban Degerini Giriniz : ");
            int number1 = input.nextInt();
            System.out.print("Us Degerini Giriniz : ");
            int number2 = input.nextInt();
            System.out.println(power(number1,number2));
    }
}
