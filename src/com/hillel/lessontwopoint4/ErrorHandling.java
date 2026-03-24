package com.hillel.lessontwopoint4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ErrorHandling {
    public static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int number = readNumber(1, 5);
        System.out.println();
    }

    public static int readNumber(int min, int max) {
        System.out.println("please enter a number ");
        try {
            int number = Integer.parseInt(READER.readLine());
            if (number < min || number > max) {
                throw new NumberNotInRangeException("Number is incorrect");
            }
            return number;
        } catch (RuntimeException e) {
            System.out.println("Please not string pls " + e.getMessage());
            return readNumber(min, max);
        } catch (IOException e) {
            System.out.println("Error of Buffer: " + e.getMessage());
            return 0;
        } finally {
            System.out.println("Finally");
        }
    }

}
