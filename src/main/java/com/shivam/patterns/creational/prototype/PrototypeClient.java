package com.shivam.patterns.creational.prototype;

import com.shivam.patterns.creational.prototype.concrete.Circle;
import com.shivam.patterns.creational.prototype.concrete.Rectangle;
import org.w3c.dom.css.Rect;

public class PrototypeClient {

    public static void main(String[] args) {
        Circle originalCircle = new Circle();
        originalCircle.x = 10;
        originalCircle.y = 20;
        originalCircle.color = "Red";
        originalCircle.setRadius(15);

        //clone it
        Circle clonedCircle = (Circle) originalCircle.clone();
        clonedCircle.x = 100;
        clonedCircle.color = "Blue";


        Rectangle originalRect = new Rectangle();
        originalRect.x = 5;
        originalRect.y = 5;
        originalRect.color = "Green";
        originalRect.setSize(50, 80);

        Rectangle clonedRect = (Rectangle) originalRect.clone();
        clonedRect.setSize(100, 200);


        // draw all shapes
        originalCircle.draw();
        clonedCircle.draw();
        originalRect.draw();
        clonedRect.draw();
    }
}
