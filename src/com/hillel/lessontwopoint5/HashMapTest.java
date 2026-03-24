package com.hillel.lessontwopoint5;

import java.util.*;

public class HashMapTest {

    public static void main(String[] args) {
        HashMap<String, Integer> employees = new HashMap<>();
        employees.put("HR", 20);
        employees.put("Dev", 50);
        employees.put(null, 1);


        Set<String> deps = employees.keySet();
        //so bekommen wir einfach einen set von den Schlüsseln von dem
        // map wenn wir einen haben
        System.out.println(deps);

        Collection<Integer> values = employees.values();
        System.out.println(values);
        //so bekommen wir einfach die Werte von der Kollektion aus map .values()

        //entry das ist einfach ein interface das in sich key und value hat
        //so iterieren wir über set und map
        for(Map.Entry<String,Integer> entry : employees.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println(employees.get("HR"));
        Set<String> departments = new HashSet<>();
        //set - interface, hashset - realisation von dem interface
        //hashSet bases on the hashMap. hashSet sind die Schlüssel
        // vom hashMap, weil sie sich nicht wiedeholen können
        departments.add("HR");
        departments.add("DEV");
        departments.add("MANAGEMENT");

        //In der Wirklichkeit drinne in Set entsteht Map und diese
        //elemente hr, dev, management, die sind Schlüssel von Map.
        //die können ja sich nicht wiederholen

        for (String department : departments){
            System.out.println(department);
        }

        departments.remove("DEV");
        for(String department : departments){
            System.out.println(department);
        }

        if(departments.contains("DEV")){
            System.out.println("developers are here?");
        }else{
            System.out.println("There are no developers in the company");
        }

    }
}
