package com.shivam.patterns.structural.decorator.decorator;

import com.shivam.patterns.structural.decorator.decorator.impl.SimpleCoffee;
import com.shivam.patterns.structural.decorator.decorator.impl.decorators.MilkDecorator;
import com.shivam.patterns.structural.decorator.decorator.impl.decorators.SugarDecorator;

public class CoffeeShop {

    public static void main(String[] args) {

        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " ₹" + coffee.getCost());

        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);
        coffee = new MilkDecorator(coffee);

        System.out.println(coffee.getDescription() + " ₹" + coffee.getCost());
    }
}
