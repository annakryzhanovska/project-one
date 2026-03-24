package com.hillel;
class Animal {
    protected String name;
    protected int age;

    void eat(){
        System.out.println("animal eats");
    }

    public String getName(){
        return name;
    }

    public void setName(String animalName){
        if(animalName.isEmpty()){
            System.out.println("the name can't be empty");
        }else{
            name = animalName;
        }
    }

    public int getAge(){
        return age;
    }

    public void setAge(int animalAge){
        if(animalAge < 0){
            System.out.println("der Alter kann nicht kleiner als 0 sein ");
        } else {
            age = animalAge;
        }
    }

    public static void ageChanger(Animal obj){
        obj.age = 1000;
    }
}
