package com.shivam.patterns.creational.abstractfactory.structure.impl;

import com.shivam.patterns.creational.abstractfactory.structure.Checkbox;

public class MacCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering Mac Checkbox");
    }
}
