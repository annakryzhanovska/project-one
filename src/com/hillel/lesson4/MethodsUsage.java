package com.hillel.lesson4;

import java.util.Scanner;

public class MethodsUsage {
    public static void main(String[] args) {
        Methods.printMessage();

        Scanner scanner = new Scanner(System.in);


        int number = method();
        System.out.println(number);

        int randomInt = method(18, 50);
        System.out.println(randomInt);
    }


    public static int method() {
        return (int) (Math.random() * 100);
    }

    public static int method(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }
}
