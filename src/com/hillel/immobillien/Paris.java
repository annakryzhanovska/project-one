package com.hillel.immobillien;

public class Paris extends City {
    public Paris(String funnyWord){
        super(funnyWord);
    }

    @Override
    public String sayFunnyWord(){
        return "hello from Pari hehehhe" + this.funnyWord;
    }

    @Override
    public void count(){
        System.out.println("in Paris habe ich 7 große Wohnungen und 2 Häuser.");
    }
}
