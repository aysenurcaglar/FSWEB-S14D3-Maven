package org.example.arge;

public class ElectricCar extends CarSkeleton {
    private double avgKmPerCharge;
    private int batterySize;
    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting Electric Engine for " + super.name);
    }

    @Override
    public void drive() {
        System.out.println("Driving Electric Car " + super.name);
        runEngine();
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "avgKmPerCharge=" + avgKmPerCharge +
                ", batterySize=" + batterySize +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
