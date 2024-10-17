package com.hillel.lesson2;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("hi");

        double num = Math.pow(2, 4);
        System.out.println(num);

        double random = Math.random();
        System.out.println("random: " + random);

        double intRandom = (int)(random*100);
        System.out.println("random int " + intRandom);
    }
}
