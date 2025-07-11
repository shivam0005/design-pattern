package com.shivam.patterns.structural.decorator.decorator.impl;

import com.shivam.patterns.structural.decorator.decorator.Coffee;

public class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Plain Coffee";
    }

    @Override
    public int getCost() {
        return 100;
    }
}
