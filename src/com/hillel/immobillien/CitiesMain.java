package com.hillel.immobillien;

import java.util.ArrayList;
import java.util.List;

public class CitiesMain {
    public static void main(String[] args) {
        List<City> cities = new ArrayList<>();
        cities.add(new Dubai(" Habibi"));
        cities.add(new Paris(" Mon amour"));
        cities.add(new Monaco(" моя любовь"));
        cities.add(new Shanghai(" yua yua"));

        for (City city: cities){
            city.count();
            System.out.println(city.sayFunnyWord());
        }
    }

}
