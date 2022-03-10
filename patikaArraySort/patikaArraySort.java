package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin Boyutunu Giriniz : ");
        int n = input.nextInt();

        int[] list = new int[n];

        System.out.println("Dizinin Elamanlarini Giriniz: ");
        for (int i = 0; i< list.length;i++){
            System.out.print((i+1)+". Elemani : ");
            int number = input.nextInt();
            list[i]=number;
        }

        Arrays.sort(list);
        System.out.print("Siralama : ");
        for (int j = 0; j < list.length; j++){
            System.out.print(list[j]+" ");
        }
    }
}
