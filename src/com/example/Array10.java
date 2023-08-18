package com.example;

public class Array10 {
    public static void main(String[] args) {
        int[][] array = {{0,1},{2,3,4}};

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.printf(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
