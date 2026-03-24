package com.hillel.lambdaLesson;

import java.util.List;

public class SequencesTest {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7);

        int sum = nums.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n * 2)
                .sum();

    }
}
