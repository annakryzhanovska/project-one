package com.hillel.lesson4;

import java.util.Scanner;

public class Box {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input w, d, h: ");
        int width = sc.nextInt();
        int depth = sc.nextInt();
        int height = sc.nextInt();

        int volume = calculateVolume(width, depth, height);
        System.out.println(volume);
        int volume2 = calculateVolume(300, 500, 1000);
    }

    public static int calculateVolume(int width, int height, int depth) {
        return width * depth * height;
    }

}
