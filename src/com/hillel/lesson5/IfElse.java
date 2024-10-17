package com.hillel.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfElse {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input a number: ");

        int number = Integer.parseInt(bufferedReader.readLine());
        System.out.println("number: " + number);

        if(number>=1000){
            System.out.println("50000$");
        }else if (number >= 500) {
            System.out.println("20000$");
        } else if (number >= 100) {
            System.out.println("10000$");
        } else {
            System.out.println("null");
        }
    }
}
