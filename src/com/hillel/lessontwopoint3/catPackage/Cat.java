package com.hillel.lessontwopoint3.catPackage;

public class Cat {
    private final String name; //were not planning to change the cats name


    public Cat(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return "Cat: " + "name: " + name;
    }
}
