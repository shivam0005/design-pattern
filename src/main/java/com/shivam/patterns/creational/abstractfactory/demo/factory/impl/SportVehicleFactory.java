package com.shivam.patterns.creational.abstractfactory.demo.factory.impl;

import com.shivam.patterns.creational.abstractfactory.demo.factory.VehicleFactory;
import com.shivam.patterns.creational.abstractfactory.demo.product.Bike;
import com.shivam.patterns.creational.abstractfactory.demo.product.Car;
import com.shivam.patterns.creational.abstractfactory.demo.product.impl.SportBike;
import com.shivam.patterns.creational.abstractfactory.demo.product.impl.SportCar;

public class SportVehicleFactory implements VehicleFactory {
    @Override
    public Car createCar() {
        return new SportCar();
    }

    @Override
    public Bike createBike() {
        return new SportBike();
    }
}
