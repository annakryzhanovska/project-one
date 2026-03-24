package com.hillel.immobillien;

public class Dubai extends City{

    public Dubai(String funnyWord){
        super(funnyWord);
    }

    @Override
    public String sayFunnyWord() {
        return "Hello from Dubai bae" + this.funnyWord;
    }

    @Override
    public void count() {
        System.out.println("in Dubai habe ich zwei schöne grosse Wohnungen auf einer Insel");
    }
}
