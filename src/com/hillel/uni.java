package com.hillel;

public class uni {
    public static void main(String[] args) {

        int sum = 0;
        int i = 1;
        while (i <= 5){
            sum = sum + i;
            if(i==3){
                break;
            }
            i++;
        }
        System.out.println(sum);
    }

    public static class Cat extends Animal {



    }
}
