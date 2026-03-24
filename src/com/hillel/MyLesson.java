package com.hillel;


public class MyLesson {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.setName("jj");
        cat.setAge(2);

        System.out.println(cat.getName());
        Animal.ageChanger(cat);
        System.out.println(cat.getAge());

        Dog dog1 = new Dog();
        dog1.setName("Bruni");
        dog1.eat();

        Cat c1 = new Cat("Meow", 2, "seam");
        c1.setLoaded(false);
        c1.setName("KITTY");
    }
}