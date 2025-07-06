package com.shivam.patterns.creational.abstractfactory.demo.product.impl;

import com.shivam.patterns.creational.abstractfactory.demo.product.Bike;

public class SportBike implements Bike {
    @Override
    public void ride() {
        System.out.println("Riding a sport bike");
    }
}
