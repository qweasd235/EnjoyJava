package com.example;

public class CommandLineArgumentExam {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("사용법 : CommandLineArgumentExam 값 값 ....");
            System.exit(0); // return; 으로 변경 가능
        }

        for (String arg : args){
            System.out.println(arg);
        }
    }
}

/*

Hello.java 파일 작성하고
javac Hello.java

명령을 실행할 때 성공 시 아무런 메시지도 출력하지 않는다 -> Unix 철학
Linux도 Unix계열이다.

 */
