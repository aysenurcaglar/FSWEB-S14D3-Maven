package org.example;

import org.example.arge.ElectricCar;
import org.example.arge.GasPoweredCar;
import org.example.arge.HybridCar;
import org.example.company.Car;
import org.example.company.Ford;
import org.example.company.Holden;
import org.example.company.Mitsubishi;
import org.example.arge.CarSkeleton;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(8, "Base car");
        printActions(car);


        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");

        printActions(mitsubishi);

        Car ford = new Ford(6, "Ford Falcon");

        printActions(ford);

        Car holden = new Holden(6, "Holden Commodore");

        printActions(holden);



        System.out.println("******************************");

        CarSkeleton gasCar = new GasPoweredCar("Raikkonen", "Gas Car Description", 12.5, 4);
        CarSkeleton electricCar = new ElectricCar("Schumacher", "Electric Car Description", 100.0, 500);
        CarSkeleton hybridCar = new HybridCar("Hamilton", "Hybrid Car Description", 15.0, 300, 4);

        testCar(gasCar);
        testCar(electricCar);
        testCar(hybridCar);

        System.out.println(gasCar.toString());
        System.out.println(electricCar.toString());
        System.out.println(hybridCar.toString());
    }
    public static void testCar(CarSkeleton car) {
        car.startEngine();
        car.drive();
        System.out.println("Car Type: " + car.getClass().getSimpleName());
    }

    private static void printActions (Car car) {
        System.out.println(car.startEngine());

        System.out.println(car.accelerate());

        System.out.println(car.brake());
    }
}