package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(){

    }
    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public String startEngine(){
        return "the car's engine is starting";
    }
    public void drive(){
        runEngine();
    }
    protected void runEngine(){

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
