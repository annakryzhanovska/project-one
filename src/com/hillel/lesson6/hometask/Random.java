package com.hillel.lesson6.hometask;

public class Random {
    public static void main(String[] args) {
        int randomNumber1 = (int) (Math.random() * 100);
        int randomNumber2 = (int) (Math.random() * 100);
        int randomNumber3 = (int) (Math.random() * 100);


        int min;
        System.out.println("Your numbers are: " + randomNumber1 + ", " + randomNumber2 + ", " + randomNumber3);
        if (randomNumber1 < randomNumber2 && randomNumber1 < randomNumber3) {
            min = randomNumber1;
        } else if (randomNumber2 < randomNumber3 && randomNumber2 < randomNumber1) {
            min = randomNumber2;
        } else {
            min = randomNumber3;
        }

        System.out.println("the minimum is: " + min);
    }
}
