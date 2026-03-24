package com.hillel.immobillien;

public abstract class City {
    String funnyWord;

    public City(String funnyWord){
        this.funnyWord = funnyWord;
    }

    public abstract String sayFunnyWord();

    public abstract void count();
}
