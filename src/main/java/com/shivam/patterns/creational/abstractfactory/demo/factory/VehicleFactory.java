package com.shivam.patterns.creational.abstractfactory.demo.factory;

import com.shivam.patterns.creational.abstractfactory.demo.product.Bike;
import com.shivam.patterns.creational.abstractfactory.demo.product.Car;

public interface VehicleFactory {
    Car createCar();
    Bike createBike();
}
