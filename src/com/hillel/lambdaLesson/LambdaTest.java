package com.hillel.lambdaLesson;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

public class LambdaTest {

    public static void main(String[] args) {
        new Thread(() -> System.out.println("Hello world!")).start();
        // die methode an sich muss irgendo gespeichert werden
        //bevor man die lambda expression in einer vaariable speichert,
        //muss man verstehen, welchen Typ die lyambda expression hat.
        //zb string oder int kann man das nicht so einfach speichern.
        // es gibt spezielle typen die die funktion speichen


        //wir createn einen neuen thread.

        Runnable runnable = () -> {
            System.out.println("Hello world1!");
            System.out.println("Hello world2!");
        };

        new Thread(runnable).start();


        final AtomicInteger counter = new AtomicInteger(0);
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                counter.incrementAndGet();
            }
        };

        Runnable runnable2 = () -> counter.incrementAndGet();;

    }

}
