package com.hillel.lambdaLesson;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionalInterfaceTest {
    public static void main(String[] args) {
        Function<Integer, Integer> function = (x) -> x++;
        // hier realisieren wir die funktion

        Integer result = function.apply(10);
        //hier rufen wir erst die funktion auf und bekommen danach das Result
        System.out.println(result);;

        Consumer<Integer> consumer = x -> System.out.println(x);
        System.out.println("Consumer: ");
        consumer.accept(10);

        Supplier<Integer> supplier = () -> 200;
        System.out.println("Supplier: ");
        System.out.println(supplier.get());

    }


    public static void runFunction(Function<Integer, Integer> function){
        System.out.println("Function: ");
        Integer result = function.apply(10);
        System.out.println(result);
    }



}
