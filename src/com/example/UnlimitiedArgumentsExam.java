package com.example;

public class UnlimitiedArgumentsExam {
    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(sum(1,2,3,4));
        System.out.println(sum(3,2,4,4,2,5,6));
    }

    public static int sum(int... args){
        System.out.println("println 메소드 - args 길이 : " + args.length);
        int sum = 0;
        for (int i = 0; i < args.length; i++){
            sum += args[i];
        }
        return sum;
    }
}
