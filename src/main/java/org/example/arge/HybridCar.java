package org.example.arge;

public class HybridCar extends CarSkeleton {
    private double avgKmPerLiter;
    private int batterySize;
    private int cylinders;
    public HybridCar(String name, String description, double avgKmPerLiter,
                     int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting Hybrid Engine for " + super.name);
    }

    @Override
    public void drive() {
        System.out.println("Driving Hybrid Car " + super.name);
        runEngine();
    }

    public double getAvgKmPerLiter() {
        return avgKmPerLiter;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String toString() {
        return "HybridCar{" +
                "avgKmPerLiter=" + avgKmPerLiter +
                ", batterySize=" + batterySize +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
