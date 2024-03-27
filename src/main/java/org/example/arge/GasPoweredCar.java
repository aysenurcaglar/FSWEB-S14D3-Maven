package org.example.arge;

public class GasPoweredCar extends CarSkeleton {
    private double avgKmPerLiter;
    private int cylinders;
    public GasPoweredCar(String name, String description, double avgKmPerLiter, int cylinders) {
        super(name, description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    public double getAverageKmPerLiter() {
        return avgKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting Gas Engine for " + super.name);
    }

    @Override
    public void drive() {
        System.out.println("Driving this Gas Powered Car: " + super.name);
        runEngine();
    }

    @Override
    public String toString() {
        return "GasPoweredCar{" +
                "avgKmPerLiter=" + avgKmPerLiter +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
