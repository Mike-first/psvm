package com.hill.pattern.creational.abstractfactory.smarthousesystem;

import com.hill.pattern.creational.abstractfactory.Commissioner;

public class SmartHouseSystemCommissioner implements Commissioner {
    @Override
    public void performCommissioning() {
        System.out.println("Commissioning engineer perform commissioning of SmartHouseSystem");
    }
}
