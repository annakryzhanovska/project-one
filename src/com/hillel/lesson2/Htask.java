package com.hillel.lesson2;

public class Htask {
    public static void main(String[] args) {
        double a = 7;
        double b = 8;
        double c = 9;


        double sum = calculate(a, b, c);

        System.out.println("sum: " + sum);
    }

    public static double calculate(double a, double b, double c){
        double module = Math.abs(a-b);
        double pow = Math.pow((a+b), 3);
        double sqrt = Math.sqrt(c);

        return module/pow - sqrt;
    }

}
