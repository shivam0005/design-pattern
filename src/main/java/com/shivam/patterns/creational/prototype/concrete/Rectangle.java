package com.shivam.patterns.creational.prototype.concrete;

import com.shivam.patterns.creational.prototype.Shape;
import org.w3c.dom.css.Rect;

public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle() {}

    public Rectangle(Rectangle target){
        super(target);
        if(target != null){
            this.width = target.width;
            this.height = target.height;
        }
    }

    public void setSize(int width, int height){
        this.width = width;
        this.height = height;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
}
