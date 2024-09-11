package com.hill.pattern.creational.abstractfactory.industrialautomation;

import com.hill.pattern.creational.abstractfactory.Designer;

public class IndustrialAutomationDesigner implements Designer {
    @Override
    public void createProject() {
        System.out.println("Designer perform project of Industrial Automation");
    }
}
