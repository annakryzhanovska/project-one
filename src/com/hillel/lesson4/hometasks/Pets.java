package com.hillel.lesson4.hometasks;

public class Pets {
    public static void main(String[] args) {
        int dogs = 24;
        int cats = 8;

        int mealsPerDay = 3;
        int daysPerMonth = 30;

        int food = 50;
        double price = 2.0;

        System.out.println("Нужно корма для котов в месяц: " + calculateMonthlyFood(cats, food, mealsPerDay, daysPerMonth));
        System.out.println("Нужно корма для собак в месяц: " + calculateMonthlyFood(dogs, food, mealsPerDay, daysPerMonth));

        System.out.println("Нужно денег для содержания приюта: " + (calculateMoneyPerMonth(dogs, price, mealsPerDay, daysPerMonth) + calculateMoneyPerMonth(cats, price, mealsPerDay, daysPerMonth)));

    }

    public static int calculateFoodPerDay(int animalCount, int portionPerAnimal) {
        return animalCount * portionPerAnimal;
    }

    public static int calculateMonthlyFood(int animalCount, int portionPerAnimal, int mealsPerDay, int daysPerMonth) {
        return calculateFoodPerDay(animalCount, portionPerAnimal) * mealsPerDay * daysPerMonth;
    }

    public static double calculateMoneyPerMonth(int animalCount, double price, int mealsPerDay, int daysPerMonth) {

        return animalCount * mealsPerDay * daysPerMonth * price ;

    }


}
