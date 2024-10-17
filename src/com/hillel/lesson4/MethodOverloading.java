package com.hillel.lesson4;

public class MethodOverloading {

    public static void main(String[] args) {
        int a = -45;
        int b = - 95;
        int c = 98;

        int num = helloWorld(a, b, c);
        System.out.println("result: " + num);


    }

    public static int helloWorld(int a, int b, int c){
        int num = Math.abs(a+b+c);

        System.out.println("Hello World!");
        return num;
    }

    public static int helloWorld(int a, int b){
        int num = a*b;
        System.out.println("hallo, die Welt!");
        return num;
    }


}
