package com.hillel.lessontwopoint5;
import java.util.Comparator;

public class PersonCompar implements Comparator<Person>{

    @Override //man überschreibt die Methode
    public int compare(Person a, Person b) {
        return Integer.compare(a.getAge(), b.getAge());
    }
}
