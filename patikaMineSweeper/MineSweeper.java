package com.company;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int row,column;
    boolean isOver = false;
    int[][] mineMap;
    String[][] gameMap;

    MineSweeper(int row, int column){
        this.row = row;
        this.column = column;
        this.mineMap = new int[row][column];
        this.gameMap = new String[row][column];
        placeMines(row,column);
    }
    void placeMines(int row, int column){
        int numberOfMines = (row * column) / 4;
        Random mines = new Random();
        int mineCount = 0;
        while(mineCount < numberOfMines){
            int mineRow = mines.nextInt(row);
            int mineColumn = mines.nextInt(column);
            if (this.mineMap[mineRow][mineColumn] != 1){
                this.mineMap[mineRow][mineColumn] = 1;
                mineCount++;
            }
        }
        for (String[] str : gameMap){
            Arrays.fill(str,"-");
        }
    }
    void run() {
        printGameMap();
        Scanner scan = new Scanner(System.in);
        while (!isOver) {
            printGame();
            System.out.print("Satir Giriniz : ");
            int scanRow = scan.nextInt();
            System.out.print("Sutun Giriniz : ");
            int scanColumn = scan.nextInt();
            if (scanRow >= row || scanRow < 0) {
                System.out.println("Hatali Satir Girdiniz");
                continue;
            }
            if (scanColumn >= column || scanColumn < 0) {
                System.out.println("Hatali Sutun Girdiniz");
                continue;
            }
            select(scanRow, scanColumn);
            if (isFinished()) {
                System.out.println("Tebrikler Kazandiniz!!!");
                break;
            }
            if (isOver) {
                System.out.println("Oyunu Kaybettiniz");
                printGameMap();
            }
        }
    }
    void printGameMap(){
        System.out.println("-----GameMap-----");
        for (int[] i : this.mineMap){
            for (int j : i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("-----GameMap-----");
    }
    void select(int row, int column){
        int count = 0;
        if (mineMap[row][column]==1){
            this.isOver=true;
        }else{
            for (int i = row-1; i <= row+1;i++){
                for (int j = column-1; j<=column+1;j++){
                    if (i == row && j== column){
                        continue;
                    }
                    try {
                        count+=mineMap[i][j];
                    }catch (Exception ignored){}
                }
            }
        }
        this.gameMap[row][column] = String.valueOf(count);
    }
    void printGame(){
        System.out.println("---------------");
        for (String[] str : this.gameMap){
            for (String j : str){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    boolean isFinished(){
        boolean isEmpty = true;
        for (int i = 0; i < gameMap.length;i++){
            for (int j = 0; j < gameMap[i].length;j++){
                if (Objects.equals(gameMap[i][j], "-") && !gameMap[i][j].equals("*")){
                    isEmpty = false;
                    break;
                }
            }
        }
        return isEmpty;
    }

}

