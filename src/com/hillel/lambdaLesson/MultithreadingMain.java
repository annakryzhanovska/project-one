package com.hillel.lambdaLesson;

public class MultithreadingMain {
    public static void main(String[] args) {



        for (int i = 0; i <= 5; i++) {
            MultithreadingTest myThing = new MultithreadingTest(i);
            Thread myThread = new Thread(myThing);
            myThread.start();

        }

        System.out.println("hello");
    }

}
