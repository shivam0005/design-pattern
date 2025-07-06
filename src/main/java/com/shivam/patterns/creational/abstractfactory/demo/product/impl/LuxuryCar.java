package com.shivam.patterns.creational.abstractfactory.demo.product.impl;

import com.shivam.patterns.creational.abstractfactory.demo.product.Car;

public class LuxuryCar implements Car {
    @Override
    public void drive() {
        System.out.println("Driving a luxary car");
    }
}
