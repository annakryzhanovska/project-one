package com.hillel.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchClass {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input a number: ");
        int number = Integer.parseInt(reader.readLine());
        System.out.println("number is: " + number);

        printSeason(number);
//        switchMethode(number);


    }

    private static void switchMethode(int number) {
        switch (number) {
            case 1:

                System.out.println("January");
                break;
            case 2:

                System.out.println("Feb");
                break;
            case 3:

                System.out.println("March");
                break;
            case 4:

                System.out.println("April");
                break;
            default:

                System.out.println("Unknown");
                break;
        }


    }

    private static void printSeason(int number) {
        switch (number) {
            case 12:
            case 1:
            case 2:

                System.out.println("Winter");


            case 3:
            case 4:
            case 5:
                System.out.println("Fruehling");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("herbst");
                break;

            default:

                System.out.println("Unknown");
                break;
        }


    }


}
