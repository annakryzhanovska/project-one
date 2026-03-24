package com.hillel.lessontwopoint5;

import java.util.ArrayList;
import java.util.List;

public class PersonProgram {
    public static void main(String[] args) {
        List<Person> person = new ArrayList<>();
        person.add(new Person("Henry", 19));
        person.add(new Person("Sofia", 17));
        person.add(new Person("Diana", 18));

        System.out.println("Vor der Sortierung:");
        for (Person p : person) {
            System.out.println(p);
        }

        // Sortierung anwenden:
        // Wir übergeben der Liste unser "Sortier-Werkzeug"
        person.sort(new PersonCompar());

        System.out.println("Nach der Sortierung");
        for (Person p : person) {
            System.out.println(p);
        }
    }
}
