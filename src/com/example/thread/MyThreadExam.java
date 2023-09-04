package com.example.thread;

public class MyThreadExam {
    public static void main(String[] args) {
        String name = Thread.currentThread().getName();
        System.out.println("Thread name -> " + name);
        System.out.println("start");

        MyThread str1 = new MyThread("*");
        MyThread str2 = new MyThread("+");
/*
        // 3. Thread는  start()메소드로 실행한다. -> Thread메소드 상속형식으로 구현한 것
        str1.start();
        str2.start();*/

        MyRunnable mr1 = new MyRunnable("*");
        MyRunnable mr2 = new MyRunnable("+");

        // 3. Thread인스턴스를 생성하는 데, 생성자에 Runnable인스턴스를 넣어준다.
        Thread t1 = new Thread(mr1);
        Thread t2 = new Thread(mr2);

        // 4. Thread가 가지고 있는 start()메소드를 호출한다.
        t1.start();
        t2.start();

        System.out.println();
        System.out.println("end");
    }
}
