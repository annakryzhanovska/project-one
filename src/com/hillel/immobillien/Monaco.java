package com.hillel.immobillien;

public class Monaco extends  City{

    public Monaco(String funnyWord){
        super(funnyWord);
    }

    @Override
    public String sayFunnyWord() {
        return " Hello from Monaco hahaha :) " + this.funnyWord;
    }

    @Override
    public void count(){
        System.out.println("in Monaco bin ich based und habe ein großes schönes Haus am Meer");
    }
}
