package com.hillel.lessontwopoint3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ContainsMain {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> strings = new ArrayList<>();

        System.out.println("please, enter a word");
        try {
            String word;
            while ( (word = reader.readLine()) != null && !word.equals("stop")){
                strings.add(word);
            }
        }catch (Exception e){
            System.out.println("Fehler beim Lesen der Eingabe.");
            System.exit(1); //Beende das Programm, weil ohne korrekte Daten nichts mehr geht
        }if(strings.contains("war")){
            System.out.println("thats bad!");
        }

        int count = 0;
        for (String word:strings){
            if (word.equals("war")){
                count++;
            }
        }
    }
}
