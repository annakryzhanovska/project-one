package com.hillel.lesson2;

public class Snowflake {
    public static void main(String[] args) {
        double sh1 = 1.0;
        double sh2 = 0.5;
        double sh3 = 0.2;

        double plotn = 0.7;

        double sumofFrlache = calculateSh(sh1) + calculateSh(sh2) + calculateSh(sh3);
        double mass = sumofFrlache * plotn;
        System.out.println("result: " + mass);
    }

    public static double calculateSh(double a){
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(a, 3);
        return volume;
    }
}
