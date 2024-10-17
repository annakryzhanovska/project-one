package com.hillel.lesson4.hometasks;

public class Air {
    public static void main(String[] args) {
        printAirPlaneInfo("Jet", "F-22 Raptor");
        printAirPlaneInfo("Airliner", "Aerobus 737", "120");
        printAirPlaneInfo("Airliner", "Boeing 777", "180", "28");


//        Airplane airplane = new Airplane();
//
//        // Примеры вызова методов
//        airplane.printAirplaneInfo("Истребитель", "F-22 Raptor");
//        airplane.printAirplaneInfo("Пассажирский самолет", "Aerobus 737", 120);
//        airplane.printAirplaneInfo("Пассажирский самолет", "Boeing 777", 180, 28);

    }


    public static void printAirPlaneInfo(String type, String model){
        System.out.println("Тип самолета: " + type + ", модель: " + model);
    }

    public static void printAirPlaneInfo(String type, String model, String economyClass){
        System.out.println("Тип самолета: " + type + ", модель: " + model + ", кол. пассажиров эконом класса: " + economyClass);

    }

    public static void printAirPlaneInfo(String type, String model, String economyClass, String businessClass){
        System.out.println("Тип самолета: " + type + ", модель: " + model + ", кол. пассажиров эконом класса: " + economyClass + ", пассажиров бизнес класса: " + businessClass);
    }

}
