package com.shivam.patterns.creational.prototype;

//prototype
public abstract class Shape {

    protected int x;
    protected int y;
    protected String color;

    public Shape() {
    }

    public Shape(Shape target){
        if(target != null){
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public abstract Shape clone();

    public void draw() {
        System.out.println("Drawing " + this.getClass().getSimpleName() +
            " at (" + x + "," + y + ") in color " + color);
    }
}
