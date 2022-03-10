package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //Degiskenleri tanimladim.
        int range=100;

        for (int i = 2; i<=range;i++){
            int counter = 0;
            for (int j = 1; j<i; j++){
                if (i%j ==0){
                    counter++;
                }
            }
            if (counter <= 1){
                System.out.print(i + " ");
            }
        }
    }
}
