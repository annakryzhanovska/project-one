package com.hillel.lessontwopoint4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileReaderTest {


    public static void main(String[] args) throws IOException {
        readFile();
        System.out.println(" ");
        writeFile(" Anna Cris");
        readFile();
    }


    public static final String TXT = "C:\\Users\\crija\\IdeaProjects\\project-one\\china.txt";

    private static void readFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(TXT))) {
            System.out.println(reader.readLine());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    private static void writeFile(String text) {
        try (FileWriter writer = new FileWriter(TXT, true)) {
            writer.write(text);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
