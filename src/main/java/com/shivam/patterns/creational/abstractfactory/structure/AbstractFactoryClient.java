package com.shivam.patterns.creational.abstractfactory.structure;

import com.shivam.patterns.creational.abstractfactory.structure.factory.MacUIFactory;

public class AbstractFactoryClient {

    public static void main(String[] args) {
        UIFactory factory = new MacUIFactory(); //or new WindowsUIFactory()

        Button btn = factory.createButton();
        Checkbox chx = factory.createCheckbox();

        btn.render();
        chx.render();
    }
}
