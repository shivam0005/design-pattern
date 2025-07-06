package com.shivam.patterns.creational.abstractfactory.structure.impl;

import com.shivam.patterns.creational.abstractfactory.structure.Checkbox;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering Windows Checkbox");
    }
}
