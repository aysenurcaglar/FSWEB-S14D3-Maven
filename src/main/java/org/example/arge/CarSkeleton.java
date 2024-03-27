package org.example.arge;

public class CarSkeleton {
    protected String name;
    protected String description;

    public CarSkeleton() {
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Starting engine for " + name);
    }

    public void drive() {
        System.out.println("Driving " + name);
        runEngine();
    }

    protected void runEngine() {
        System.out.println("Engine is running for " + name);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

}
