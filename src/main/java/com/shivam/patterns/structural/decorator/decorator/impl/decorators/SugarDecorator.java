package com.shivam.patterns.structural.decorator.decorator.impl.decorators;

import com.shivam.patterns.structural.decorator.decorator.Coffee;
import com.shivam.patterns.structural.decorator.decorator.impl.CoffeeDecorator;

public class SugarDecorator extends CoffeeDecorator {

    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return super.getDescription() + ", Sugar";
    }

    public int getCost() {
        return super.getCost() + 10;
    }
}
