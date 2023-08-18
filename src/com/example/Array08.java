package com.example;

public class Array08 {
    public static void main(String[] args) {
        // 이차원 배열 선언과 초기화
        int[][] array = {{0,1,2},{3,4,5}};

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
