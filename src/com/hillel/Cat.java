package com.hillel;

public class Cat extends  Animal{
    private String breed;
    private boolean loaded;

    public void setLoaded(boolean loaded){
        if (loaded){
            System.out.println("is not ok");
        }else{
            System.out.println("is okay");
        }
    }

    public Cat(String name, int age, String breed){
        super.name = name;
        super.age = age;
        this.breed = breed;
    }

    public Cat(String name, int age, boolean loaded){
        super.name = name;
        super.age = age;
        this.loaded = loaded;
    }


    public void setBreed(String breed){
        if (breed.isEmpty()){
            System.out.println("please enter the breed");
        } else {
            this.breed = breed;
        }
    }

    public String getBreed(){
        return breed;
    }
     @Override
    public void setName(String name){
        super.setName(name);
         System.out.println(name + " is my new name");
     }
}
