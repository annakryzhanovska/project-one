package com.hillel.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class While {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String input = READER.readLine();
        int sum = 0;

//        while (!input.equalsIgnoreCase("stop")) {
//            System.out.println("Input is: " + input);
//            input = READER.readLine();
//        } // wenn wir stop haben dann ist es kein whiile at all

        while (!input.equalsIgnoreCase("sum")){
            sum += Integer.parseInt(input);
            System.out.println("sum before " + sum);
            input = READER.readLine();
        }

        System.out.println("result: " + sum);
    }
}
