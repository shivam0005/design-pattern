package com.shivam.patterns.creational.abstractfactory.demo.factory.impl;

import com.shivam.patterns.creational.abstractfactory.demo.factory.VehicleFactory;
import com.shivam.patterns.creational.abstractfactory.demo.product.Bike;
import com.shivam.patterns.creational.abstractfactory.demo.product.Car;
import com.shivam.patterns.creational.abstractfactory.demo.product.impl.LuxuryBike;
import com.shivam.patterns.creational.abstractfactory.demo.product.impl.LuxuryCar;

public class LuxuryVehicleFactory implements VehicleFactory {
    @Override
    public Car createCar() {
        return new LuxuryCar();
    }

    @Override
    public Bike createBike() {
        return new LuxuryBike();
    }
}
