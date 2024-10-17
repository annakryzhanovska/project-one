package com.hillel.lesson5.hometask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Scholarship {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter 5 grades: ");
        int grade1 = Integer.parseInt(br.readLine());
        int grade2 = Integer.parseInt(br.readLine());
        int grade3 = Integer.parseInt(br.readLine());
        int grade4 = Integer.parseInt(br.readLine());
        int grade5 = Integer.parseInt(br.readLine());

        double gradePointAverage = (double)(grade1 + grade2 + grade3 + grade4 + grade5) / 5;
        System.out.println("your grade point average is: " + gradePointAverage);
        if (gradePointAverage >= 10) {
            System.out.println("Hight scholarship");
        } else if (gradePointAverage >= 8) {
            System.out.println("Normal scholarship");
        } else {
            System.out.println("No scholarship");
        }


    }
}
