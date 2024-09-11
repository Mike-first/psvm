package com.hill.pattern.creational.abstractfactory.industrialautomation;

import com.hill.pattern.creational.abstractfactory.Installer;

public class IndustrialAutomationInstaller implements Installer {
    @Override
    public void performInstallation() {
        System.out.println("Installer perform installation of Industrial Automation");
    }
}
