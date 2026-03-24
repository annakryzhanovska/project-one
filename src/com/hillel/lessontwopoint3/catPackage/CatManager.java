package com.hillel.lessontwopoint3.catPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CatManager {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("kusia"));
        cats.add(new Cat("murka"));
        cats.add(new Cat("simona"));
        cats.add(new Cat("pixel"));
        cats.add(new Cat("markis"));

        System.out.println(cats);
        removeCatByName(cats, "murka");
        System.out.println(cats);

    }

    public static void removeCatByName(List<Cat> cats, String name){
        Iterator<Cat> iterator = cats.iterator(); //iterator cat, its a parametric type
        while(iterator.hasNext()){ //we ask whether the iterator has the next element
            Cat cat = iterator.next(); //if yes so we take the next element

            if (cat.getName().equals(name)){ // if the name is what we need, we add a new cat to the collection
                iterator.remove(); //wir müssen remove von dem Iterator benutzen
            }
        }
    }

//    public static removeCatByName(List<Cat> cats, String name){
//        for(Cat cat: cats){
//            if (cat.getName().equals(name)){
//                cats.remove(cat);
//
//                //int index = cats.indexOf(name);
//                //cats.remove(index);
//            }
//        }
//    }

    //in Iterator ew dont expect the collection to be changed
    //Iterator doesnt know how many elements we have. ifwe change something in the future its egal for Iterator who stands in the beginning



}
