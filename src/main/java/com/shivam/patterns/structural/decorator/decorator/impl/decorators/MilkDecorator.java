package com.shivam.patterns.structural.decorator.decorator.impl.decorators;

import com.shivam.patterns.structural.decorator.decorator.impl.CoffeeDecorator;
import com.shivam.patterns.structural.decorator.decorator.Coffee;

public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return super.getDescription() + ", Milk";
    }

    public int getCost(){
        return super.getCost() + 20;
    }
}
