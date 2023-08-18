package com.example;

import java.util.Arrays;

public class Array15 {
    public static void main(String[] args) {
        int[] array1 = {2,2,3,4,5};
        int[] array2 = {1,2,3,4,5};

        // 양수, 0, 음수 (비교할때)
        // x - y = 결과가 양수라면?
        int compare = Arrays.compare(array1, array2);

        System.out.println(compare);
    }
}
