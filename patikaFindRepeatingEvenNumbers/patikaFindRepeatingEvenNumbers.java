package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] list = {2,7,2,2,1,9,10,21,1,33,9,1};
        int[] duplicate = new int[list.length];

        int startIndex =0;
        for (int i = 0; i< list.length;i++){
            for (int j = 0; j<list.length; j++){
                if ((i != j) && (list[i] == list[j]) && (list[i] % 2 ==0)){
                    duplicate[startIndex++] = list[i];
                    break;
                }
            }
        }

        for (int value : duplicate){
             if (value !=0){
                 System.out.println(value);
             }
        }
    }
}
