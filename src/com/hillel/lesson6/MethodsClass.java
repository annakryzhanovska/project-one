package com.hillel.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodsClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input a String: ");
        String string1 = br.readLine();
        System.out.println("Input a String: ");
        String string2 = br.readLine();
        stickStringsTogether(string1, string2);
        stickStringsTogether("Anna", "in Paris");

        stickStringsTogether(br.readLine(), br.readLine());

        int number = Integer.parseInt(br.readLine());
        stickStringsTogether(string1, number);
    }

    public static void stickStringsTogether(String string1, String string2) {
        System.out.println(string1 + " " + string2);
    }

    public static void stickStringsTogether(String string1, int number){
        System.out.println(string1 + " " + number);
    }
}
