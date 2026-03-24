package com.hillel.immobillien;

public class Shanghai extends City{

    public Shanghai(String funnyWord){
        super(funnyWord);
    }

    @Override
    public String sayFunnyWord(){
        return "Hello from Shanghai :) " + this.funnyWord;
    }

    @Override
    public void count() {
        System.out.println("in Shanghai ich habe 3 rieseige schöne Penthauses");
    }
}
