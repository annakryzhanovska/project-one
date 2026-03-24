package com.hillel;

public class Dog extends  Animal{
    void bark(){
        System.out.println("dog barks");
    }
    @Override
    void eat(){
        super.eat();
        System.out.println("Dog eats meat");
    }

    @Override
    public String getName() {
        System.out.println(super.getName());
        return name;
    }
}
