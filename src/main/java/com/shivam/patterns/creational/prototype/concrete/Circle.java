package com.shivam.patterns.creational.prototype.concrete;

import com.shivam.patterns.creational.prototype.Shape;

public class Circle extends Shape {

    private int radius;

    public Circle(){};

    public Circle(Circle target){
        super(target);
        if (target != null){
            this.radius = target.radius;
        }
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    public Shape clone(){
        return new Circle(this);
    }
}
