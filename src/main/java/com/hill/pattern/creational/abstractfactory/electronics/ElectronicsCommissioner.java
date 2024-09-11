package com.hill.pattern.creational.abstractfactory.electronics;

import com.hill.pattern.creational.abstractfactory.Commissioner;

public class ElectronicsCommissioner implements Commissioner {
    @Override
    public void performCommissioning() {
        System.out.println("Commissioning engineer perform commissioning of Electronics");
    }
}
