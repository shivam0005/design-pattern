package com.shivam.patterns.creational.abstractfactory.demo;

import com.shivam.patterns.creational.abstractfactory.demo.factory.VehicleFactory;
import com.shivam.patterns.creational.abstractfactory.demo.factory.impl.SportVehicleFactory;
import com.shivam.patterns.creational.abstractfactory.demo.product.Bike;
import com.shivam.patterns.creational.abstractfactory.demo.product.Car;

public class VehicleClient {
    public static void main(String[] args) {

        VehicleFactory factory = new SportVehicleFactory(); // or new LuxuryVehicleFactory()

        Car car = factory.createCar();
        Bike bike = factory.createBike();

        car.drive();
        bike.ride();
    }
}
