package com.hillel.lessontwopoint3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionMain {
    public static void main(String[] args) throws IOException {

        //create
        int[] numbersArr = new int[5]; // array
        List<Integer> numbersColl = new ArrayList<>(4); //collection

        //getsize
        System.out.println(numbersArr.length); //length - parameter
        System.out.println(numbersColl.size()); //size() - method

        //fill array
        numbersArr[0]= 1;
        numbersArr[3]= 2;

        //add to collection in the end (no indexes used) - doesn't exist in array
        numbersColl.add(1);
        numbersColl.add(45);
        numbersColl.add(87); //es gibt hier keine indizies.
        // jemehr elements desto weiter dehnt sich die arraylist
        // hier 3 elemente, die grösse von der kollektion ist 3
        //{1, 45, 87}


        //add to collection in the middle
        numbersColl.add(0, 100);
        //adds to the index a value and everything what was there it pushes aside

        //on the concrete index we set a value -> replace
        numbersColl.set(0, 100);
        //numbersColl.set(4, 25);
        // - index exsistiert noch nicht deswegen das programm fällt runter

        //get element
        System.out.println(numbersArr[3]);
        System.out.println(numbersColl.get(0));

        //remove
        //in array we can only clean an element by index, array length will be same
        numbersArr[0] = 0;

        //in collection there are remove by obj, remove by index, remove all
        numbersColl.remove(0);

        //array in der konsole drücken
        System.out.println(Arrays.toString(numbersArr));

        //collection in der console drücken
        System.out.println(numbersColl);
    }
}
