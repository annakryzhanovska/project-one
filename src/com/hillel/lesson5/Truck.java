package com.hillel.lesson5;

import java.util.Scanner;

public class Truck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ведите length: ");
        int length = scan.nextInt();

        System.out.println("Ведите width: ");
        int width = scan.nextInt();

        System.out.println("Ведите height: ");
        int height = scan.nextInt();

        int volume = calculateVolume(length, width, height);
        print( volume);

        int maxWight = 58;
        int totalWeight = totalWeight(volume, maxWight);
        System.out.println("Max Wight: " + totalWeight);
    }


    public static int calculateVolume(int length, int width, int height) {
        return length * width * height;
    }

    public static int totalWeight(int volume, int maxWight) {
        return volume * maxWight;
    }

    public static void print(int volume){
        System.out.println(volume);
    }
}
