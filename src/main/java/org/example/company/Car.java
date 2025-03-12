package org.example.company;

import java.sql.SQLOutput;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine(){
        System.out.println(getClass().getSimpleName());
        return "the car's engine is starting";

    }

    public String accelerate(){
        System.out.println(getClass().getSimpleName());
        return "the car is accelerating";

    }

    public String brake(){
        System.out.println(getClass().getSimpleName());
        return "the car is braking";

    }



    @Override
    public String toString() {
        return "Cylinders: " + cylinders + "Name: " + name + "Engine: " + engine + "Wheels: " + wheels;
    }

    @Override
    public boolean equals(Object obj) {
        if(((Car)obj).name.equals(name) && ((Car)obj).cylinders == cylinders){
            return true;
        }else {
            return false;
        }

    }
}
