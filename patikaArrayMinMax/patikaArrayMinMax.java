package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen Bir Sayi Giriniz: ");
        int number = input.nextInt();

        int[] copyList = Arrays.copyOf(list,list.length+1);
        copyList[7] = number;
        Arrays.sort(copyList);
        int index = Arrays.binarySearch(copyList,number);
        System.out.println("Girilen sayıdan küçük en yakın sayı : "+ copyList[index-1]);
        System.out.println("Girilen sayıdan buyuk en yakın sayı : "+ copyList[index+1]);

    }
}
