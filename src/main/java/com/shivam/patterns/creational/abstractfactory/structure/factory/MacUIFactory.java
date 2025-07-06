package com.shivam.patterns.creational.abstractfactory.structure.factory;

import com.shivam.patterns.creational.abstractfactory.structure.Button;
import com.shivam.patterns.creational.abstractfactory.structure.Checkbox;
import com.shivam.patterns.creational.abstractfactory.structure.UIFactory;
import com.shivam.patterns.creational.abstractfactory.structure.impl.MacButton;
import com.shivam.patterns.creational.abstractfactory.structure.impl.MacCheckbox;

public class MacUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
