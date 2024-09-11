package com.vehicle.test;

import com.vehicle.Car;
import com.vehicle.ElectricCar;

public class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car();
        ElectricCar electricCar = new ElectricCar();

        car.setSpeed(120); 
        car.setFuelLevel(80); 
        car.drive(5000); 

        System.out.println("Car Speed in MPH: " + car.getSpeedMph());
        System.out.println("Car Distance in KM: " + car.getDistanceKm());
        System.out.println("Car Remaining Fuel: " + car.calculateRemainingFuel(5000));

        electricCar.setSpeed(100); 
        electricCar.setBatteryLevel(90); 
        electricCar.drive(20000); 

        System.out.println("Electric Car Speed in MPH: " + electricCar.getSpeedMph());
        System.out.println("Electric Car Distance in KM: " + electricCar.getDistanceKm());
        System.out.println("Electric Car Remaining Battery: " + electricCar.getBatteryLevel());
    }
}
