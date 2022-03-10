package com.company;

import java.util.Arrays;

public class Main {
    public static void frequency(int arr[], int number)
    {
        System.out.println("Tekrar Sayilari");
        boolean isChecked[] = new boolean[number];
        Arrays.fill(isChecked, false);
        for (int i = 0; i < number; i++) {
            if (isChecked[i] == true)
                continue;
            int count = 1;
            for (int j = i + 1; j < number; j++) {
                if (arr[i] == arr[j]) {
                    isChecked[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " sayisi " + count + " kere tekrar edildi.");
        }
    }

    public static void main(String[] args) {
	    int arr[] = new int[]{10,20,20,10,10,20,5,20};
        int n = arr.length;
        frequency(arr, n);
    }
}
