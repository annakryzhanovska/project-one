package com.hillel.lessontwopoint3;

import java.util.ArrayList;
import java.util.List;

public class IterateMail {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);

        for (int i = 0; i < numbers.size(); i++) {
            int j = numbers.size() - i - 1;
            System.out.println(numbers.get(j));
        }


        for (Integer integer : numbers){
            System.out.print(numbers + " ");
        }
        System.out.println("");
        System.out.println("is 7 here? " + numbers.contains(20));

    }
}
