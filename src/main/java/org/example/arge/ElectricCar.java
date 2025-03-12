package org.example.arge;

public class ElectricCar extends CarSkeleton{
    public ElectricCar() {
    }

    public ElectricCar(String name, String description) {
        super(name, description);
    }

    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(double avgKmPerLitre, int batterySize){
        this.avgKmPerCharge = avgKmPerLitre;
        this.batterySize = batterySize;
    }

    public ElectricCar(String name, String description,double avgKmPerLitre, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerLitre;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }
}
