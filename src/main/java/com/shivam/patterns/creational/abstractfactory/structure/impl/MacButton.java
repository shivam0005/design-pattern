package com.shivam.patterns.creational.abstractfactory.structure.impl;

import com.shivam.patterns.creational.abstractfactory.structure.Button;

public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Mac Button");
    }
}
