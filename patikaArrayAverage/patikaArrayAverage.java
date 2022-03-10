package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] list = {1,2,3,4,5};
        double sum = 0.0;
        for (int i = 0; i < list.length; i++){
            sum =sum + (1/list[i]);
            System.out.println(sum);
        }

        double average =list.length / sum;
        System.out.println(average);
    }
}
