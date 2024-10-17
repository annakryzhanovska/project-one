package com.hillel.lesson4;

public class Main {

    public static void main(String[] args) {
        int worker1 = 10_000;
        int worker2 = 5_000;
        int worker3 = 14_000;

        System.out.println("Salary for 10 Years of the worker 1 is: " + salaryInTenYears(worker1));
        System.out.println("Salary for 10 Years of the worker 2 is: " + salaryInTenYears(worker2));
        System.out.println("Salary for 10 Years of the worker 3 is: " + salaryInTenYears(worker3));

        System.out.println("  ");


        double fivePercent1 = percentFive(worker1);
        double fivePercent2 = percentFive(worker2);
        double fivePercent3 = percentFive(worker3);
        System.out.println("5 percent of the worker 1 is: " + fivePercent1);
        System.out.println("5 percent of the worker 2 is: " + fivePercent2);
        System.out.println("5 percent of the worker 3 is: " + fivePercent3);

        System.out.println(" ");

        System.out.println("after all 1: " + salaryInTenYearsAfterTaxes(worker1));
        System.out.println("after all 2: " + salaryInTenYearsAfterTaxes(worker2));
        System.out.println("after all 3: " + salaryInTenYearsAfterTaxes(worker3));


    }

    public static double salaryInTenYears(double salary){
        return salary*120;
    }

    public static double percentFive(double salary){
        return salary*0.05;
    }

    public static double salaryInTenYearsAfterTaxes(double salary){
        return salary*120 - 12 * (salary*0.05);
    }
}
