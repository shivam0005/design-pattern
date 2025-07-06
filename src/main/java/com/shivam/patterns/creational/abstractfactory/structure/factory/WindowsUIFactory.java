package com.shivam.patterns.creational.abstractfactory.structure.factory;

import com.shivam.patterns.creational.abstractfactory.structure.Button;
import com.shivam.patterns.creational.abstractfactory.structure.Checkbox;
import com.shivam.patterns.creational.abstractfactory.structure.UIFactory;
import com.shivam.patterns.creational.abstractfactory.structure.impl.WindowsButton;
import com.shivam.patterns.creational.abstractfactory.structure.impl.WindowsCheckbox;

public class WindowsUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
