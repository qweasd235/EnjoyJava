package com.example;

import com.example.ItemForArray;

public class Array12 {
    public static void main(String[] args) {
        ItemForArray[] array = new ItemForArray[3];
        array[0] = new ItemForArray(500, "사과");
        array[1] = new ItemForArray(700, "수박");
        array[2] = new ItemForArray(1500, "멜론");

        for (ItemForArray item : array){
            System.out.println(item.getName());
            System.out.println(item.getPrice());
        }
    }

}
