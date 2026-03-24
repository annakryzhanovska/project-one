package com.hillel.lesson6.hometask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculate {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Enter the first number");
        int number1 = Integer.parseInt(br.readLine());

        System.out.println("Enter a mathematical operation");
//        switch(br.readLine()){
//            case ""
//        }

        char operation = br.readLine().charAt(0);

        System.out.println("Enter the second number");
        int number2 = Integer.parseInt(br.readLine());

    }
}
