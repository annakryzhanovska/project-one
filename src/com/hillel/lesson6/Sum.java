package com.hillel.lesson6;

public class Sum {
    public static void main(String[] args) {
        int number = 19;
        System.out.println(number += 3);

        String str = "Hello";
        String str2 = "hiii";
        if(!str.equals(str2)){
            System.out.println("Not equals");
        }
        System.out.println("String1".equals("String1"));
        System.out.println("String1".equals(str2));
    }

}
