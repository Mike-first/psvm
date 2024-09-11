package com.hill.pattern.creational.abstractfactory.industrialautomation;

import com.hill.pattern.creational.abstractfactory.Commissioner;

public class IndustrialAutomationCommissioner implements Commissioner {
    @Override
    public void performCommissioning() {
        System.out.println("Commissioning engineer perform commissioning of Industrial Automation");
    }
}
