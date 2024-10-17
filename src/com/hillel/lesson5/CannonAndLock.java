package com.hillel.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CannonAndLock {
    public static void main(String[] args) throws IOException {
        int startDistance = 1000;
        int endDistance = 1500;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите расстояние, на которое упало ядро (в метрах): ");

        int shellDistance = Integer.parseInt(bufferedReader.readLine());
        System.out.println();

//        if (shellDistance >= startDistance && shellDistance <= endDistance) {
//            System.out.println("Попали по замку.");
//        } else {
//            System.out.println("Не попали по замку.");
//        }


        if(shellDistance< startDistance || shellDistance > endDistance){
            System.out.println("Не попали по замку.");
        } else {
            System.out.println("Попали по замку.");
        }
    }
}
